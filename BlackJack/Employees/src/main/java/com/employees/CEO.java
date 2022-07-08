package com.employees;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CEO extends Employee {

    private final String ceoRegEx = "\\w+=(?<avgStockPrice>\\w+)";
    private final Pattern ceoPat = Pattern.compile(ceoRegEx);
    private int avgStockPrice;

    public CEO(String peopleText) {
        super(peopleText);

        Matcher ceoMatcher = ceoPat.matcher(peopleMat.group("details"));
        if (ceoMatcher.find()) {
            this.avgStockPrice = Integer.parseInt(ceoMatcher.group(
                    "avgStockPrice"));
        }
    }

    public int getSalary() {
        return 5000 * avgStockPrice;
    }
}
