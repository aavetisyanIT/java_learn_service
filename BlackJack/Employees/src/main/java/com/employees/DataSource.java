package com.employees;

public class DataSource {
    private final String peopleText = """
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

    public String getData() {
        return peopleText;
    }
}
