package com.employees;

import java.text.NumberFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String peopleText = """
                Flinstone, Fred, 1/1/1900, Programmer, {locpd=2000,yoe=10,iq=140}
                Flinstone, Fred1, 1/1/1900, Programmer, {locpd=1300,yoe=14,iq=160}
                Flinstone, Fred2, 1/1/1900, Programmer, {locpd=1600,yoe=1,iq=180}
                Flinstone, Fred3, 1/1/1900, Programmer, {locpd=5,yoe=5,iq=100}
                Rubble, Barney, 2/2/1905, Manager, {orgSize=300,dr=10}
                Rubble, Barney1, 2/2/1905, Manager, {orgSize=100,dr=2}
                Rubble, Barney2, 2/2/1905, Manager, {orgSize=200,dr=5}
                Rubble, Barney3, 2/2/1905, Manager, {orgSize=500,dr=30} 
                Flinstone, Wilma, 3/3/1910, Analyst, {projectCount=3}
                Flinstone, Wilma1, 3/3/1910, Analyst, {projectCount=5}
                Flinstone, Wilma2, 3/3/1910, Analyst, {projectCount=2}
                Flinstone, Wilma3, 3/3/1910, Analyst, {projectCount=7}
                Rubble, Betty, 4/4/1915, CEO
                """;

        String peopleRegex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}),\\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)})?\\n";
        Pattern peoplePat = Pattern.compile(peopleRegex);
        Matcher peopleMat = peoplePat.matcher(peopleText);

        String progRegex = "\\w+=(?<locpd>\\w+),\\w+=(?<yoe>\\w+),\\w+=(?<iq>\\w+)";
        Pattern coderPat = Pattern.compile(progRegex);

        String managerRegex = "\\w+=(?<orgSize>\\w+),\\w+=(?<dr>\\w+)";
        Pattern managerPat = Pattern.compile(managerRegex);

        int totalSalaries = 0;
        while (peopleMat.find()) {
            totalSalaries += switch (peopleMat.group("role")) {
                case "Programmer" -> {
                    String details = peopleMat.group("details");
                    Matcher coderMat = coderPat.matcher(details);
                    if (coderMat.find()) {
                        int locpd = Integer.parseInt(coderMat.group("locpd"));
                        int yoe = Integer.parseInt(coderMat.group("yoe"));
                        int iq = Integer.parseInt(coderMat.group("iq"));
                        yield 3000 + locpd * yoe * iq;
                    } else {
                        yield 3000;
                    }
                }
                case "Manager" -> {
                    String details = peopleMat.group("details");
                    Matcher managerMat = managerPat.matcher(details);
                    if (managerMat.find()) {
                        int orgSize = Integer.parseInt(managerMat.group("orgSize"));
                        int dr = Integer.parseInt(managerMat.group("dr"));
                        yield 3000 + orgSize * dr;

                    } else {
                        yield 3000;

                    }
                }
                case "Analyst" -> 2500;
                case "CEO" -> 5000;
                default -> 0;
            };
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        System.out.printf("the total payout should be %s%n", currencyInstance.format(totalSalaries));

    }

}