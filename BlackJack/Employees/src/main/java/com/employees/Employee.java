package com.employees;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {

    protected final String peopleRegex = "(?<lastName>\\w+),\\s*" +
            "(?<firstName>\\w+),\\s*" +
            "(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}),\\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)})?\\n";
    protected final String programmerRegex = "\\w+=(?<locpd>\\w+),\\w+=(?<yoe>\\w+),\\w+=" +
            "(?<iq>\\w+)";
    protected final Matcher peopleMat;
    private final Pattern peoplePat = Pattern.compile(peopleRegex);
    private final DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");
    protected String firstName;
    protected String lastName;
    protected LocalDate dob;

    public Employee(String personText) {
        peopleMat = peoplePat.matcher(personText);
        if (peopleMat.find()) {
            this.firstName = peopleMat.group("firstName");
            this.lastName = peopleMat.group("lastName");
            this.dob = LocalDate.from(dtFormatter.parse(peopleMat.group(
                    "dob")));
        }
    }

    int getSalary() {
        return 0;
    }
}
