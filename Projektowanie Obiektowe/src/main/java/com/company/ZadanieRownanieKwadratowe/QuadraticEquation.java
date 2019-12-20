package com.company.ZadanieRownanieKwadratowe;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double countDelta() throws DeltaBelowZeroExeption {
        double delta = 0;
        delta = Math.pow(b, 2) - (4 * a * c);
        if (delta < 0) {
            throw new DeltaBelowZeroExeption("Delta less than zero - equation has no roots");
        }
        System.out.println("Delta= " + delta);
        return delta;
    }

    private double countX() {
        return ((-b) / (2 * a));
    }

    private double countX1(double delta) {
        return ((-b) - Math.sqrt(delta)) / (2 * a);
    }

    private double countX2(double delta) {
        return ((-b) + Math.sqrt(delta)) / (2 * a);
    }

    public void solveEquation() {
        double delta = countDelta();
        if (delta > 0) {
            System.out.println("Equation has two roots x1= " + countX1(delta) + ", x2= " + countX2(delta));
        } else if (delta == 0) {
            System.out.println("Equation has one root x= " + countX());
        } else {
            System.out.println("Equation has no roots");
        }
    }
}
