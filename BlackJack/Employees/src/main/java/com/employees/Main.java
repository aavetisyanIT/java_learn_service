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

        int totalSalaries = 0;
        Employee employee;
        while (peopleMat.find()) {
            employee = switch (peopleMat.group("role")) {
                case "Programmer" -> new Programmer(peopleMat.group());
                case "Manager" -> new Manager();
                case "Analyst" -> new Analyst();
                case "CEO" -> new CEO();
                default -> null;
            };
            totalSalaries += employee.getSalary();
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        System.out.printf("the total payout should be %s%n", currencyInstance.format(totalSalaries));

    }

}