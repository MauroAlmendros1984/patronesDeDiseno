package com.example.patronesDeDiseno.Estructurales.Composite;

public class IndividualEmployee implements Employee {
    private String name;
    private String position;

    public IndividualEmployee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println("Employee: " + name + ", Position: " + position);
    }
}
