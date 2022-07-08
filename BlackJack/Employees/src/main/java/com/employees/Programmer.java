package com.employees;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Programmer extends Employee {

    private final String programmerRegex = "\\w+=(?<locpd>\\w+),\\w+=" +
            "(?<yoe>\\w+),\\w+=" +
            "(?<iq>\\w+)";
    private final Pattern programmerDetailsPat =
            Pattern.compile(programmerRegex);
    private int iq;
    private int linesOfCode;
    private int yearsOfExp;


    public Programmer(String personText) {
        super(personText);

        Matcher programmerDetailsMat =
                programmerDetailsPat.matcher(peopleMat.group(
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

    public int getSalary() {
        return 3000 + linesOfCode * yearsOfExp * iq;
    }
}