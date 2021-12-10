package com.codewithchristine;

public class AbstractTaxCalculator {
    protected double getTaxableIncome(double income, double expenses) {
        return income - expenses;
    }
}
