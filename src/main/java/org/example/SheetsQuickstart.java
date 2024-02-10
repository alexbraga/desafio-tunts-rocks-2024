package org.example;

import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.UpdateValuesResponse;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.example.utils.SheetsServiceUtil;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SheetsQuickstart {
    public static void main(String[] args) throws GeneralSecurityException, IOException {
        final Sheets sheetsService;
        final String SPREADSHEET_ID = "12kWrbO9nUXnaBd88NtwNvT2a5EWuiqCLIjAiD72xKMQ";
        final String range = "B4:F27";

        sheetsService = SheetsServiceUtil.getSheetsService();

        ValueRange response = sheetsService.spreadsheets().values().get(SPREADSHEET_ID, range).execute();
        List<List<Object>> values = response.getValues();

        ValueRange updateBody = new ValueRange();
        List<List<Object>> updateData = new ArrayList<>();

        for (int i = 0; i < values.size(); i++) {
            List<Object> row = values.get(i);
            String student = row.get(0).toString();
            int absences = Integer.parseInt((String) row.get(1));
            int p1 = Integer.parseInt((String) row.get(2));
            int p2 = Integer.parseInt((String) row.get(3));
            int p3 = Integer.parseInt((String) row.get(4));

            int totalNumberOfClasses = 60;
            double absencesPercentage = (absences * 1.0 / totalNumberOfClasses) * 100;
            double roundedAbsencesPercentage = Math.ceil(absencesPercentage);

            double average = ((p1 + p2 + p3) * 1.0 / 3) / 10;
            double roundedAverage = Math.ceil(average);

            String finalGrade = calculateStudentGrade(roundedAbsencesPercentage, roundedAverage);

            double naf;

            if (finalGrade.equals("Exame final")) {
                naf = (10 - roundedAverage) * 10;
            } else {
                naf = 0;
            }

            List<Object> newValues = Arrays.asList(finalGrade, naf);
            updateData.add(newValues);

            System.out.println(
                    "Aluno: " + student + ", Situação: " + finalGrade + ", Nota para Aprovação Final: " + naf);
        }

        updateBody.setValues(updateData);
        UpdateValuesResponse result = sheetsService.spreadsheets().values()
                                                   .update(SPREADSHEET_ID, "G4", updateBody)
                                                   .setValueInputOption("RAW")
                                                   .execute();
    }

    public static String calculateStudentGrade(double absences, double average) {
        String status;

        if (absences > 25) {
            status = "Reprovado por falta";
        } else if (average < 5) {
            status = "Reprovado por nota";
        } else if (5 <= average && average < 7) {
            status = "Exame final";
        } else {
            status = "Aprovado";
        }

        return status;
    }
}
