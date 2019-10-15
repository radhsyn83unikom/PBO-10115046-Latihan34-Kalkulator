package com.radhsyn83;

public class Kalkulator {
    private Double value1;
    private Double value2;

    public void setValue1(Double value1) {
        this.value1 = value1;
    }

    public void setValue2(Double value2) {
        this.value2 = value2;
    }

    public double tambahBilangan() {
        return value1+value2;
    }

    public double kurangBilangan() {
        return value1-value2;
    }

    public double kaliBilangan() {
        return value1*value2;
    }

    public double bagiBilangan() {
        return value1/value2;
    }

    public double sisaBilangan() {
        return value1 % value2;
    }
}
