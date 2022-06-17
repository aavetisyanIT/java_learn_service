package com.employees;

import java.text.NumberFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        DataSource data = new DataSource();

        String peopleRegex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}),\\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)})?\\n";
        Pattern peoplePat = Pattern.compile(peopleRegex);
        Matcher peopleMat = peoplePat.matcher(data.getData());

        String managerRegex = "\\w+=(?<orgSize>\\w+),\\w+=(?<dr>\\w+)";
        Pattern managerPat = Pattern.compile(managerRegex);

        int totalSalaries = 0;
        while (peopleMat.find()) {
            totalSalaries += switch (peopleMat.group("role")) {
                case "Programmer" -> {
                    Programmer programmer = new Programmer(peopleMat.group());
                    yield programmer.getSalary();
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