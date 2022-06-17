package com.employees;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Programmer {
    private int yearsOfExp;
    private int iq;
    private int linesOfCode;
    private String firstName;
    private String lastName;
    private LocalDate dob;


    public Programmer(String inputText) {

        String peopleRegex = "(?<lastName>\\w+),\\s*" +
                "(?<firstName>\\w+),\\s*" +
                "(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}),\\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)})?\\n";
        Pattern programmerPat = Pattern.compile(peopleRegex);
        Matcher programmerMat = programmerPat.matcher(inputText);
        String programmerRegex = "\\w+=(?<locpd>\\w+),\\w+=(?<yoe>\\w+),\\w+=" +
                "(?<iq>\\w+)";
        Pattern programmerDetailsPat = Pattern.compile(programmerRegex);
        if (programmerMat.find()) {
            this.firstName = programmerMat.group("firstName");
            this.lastName = programmerMat.group("lastName");
            DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");
            this.dob = LocalDate.from(dtFormatter.parse(programmerMat.group(
                    "dob")));
            Matcher programmerDetailsMat =
                    programmerDetailsPat.matcher(programmerMat.group(
                            "details"));

            if (programmerDetailsMat.find()) {
                this.linesOfCode =
                        Integer.parseInt(programmerDetailsMat.group("locpd"));
                this.yearsOfExp =
                        Integer.parseInt(programmerDetailsMat.group("yoe"));
                this.iq =
                        Integer.parseInt(programmerDetailsMat.group("iq"));
            }


        }
    }

    public int getSalary() {
        return 3000 + linesOfCode * yearsOfExp * iq;
    }
}