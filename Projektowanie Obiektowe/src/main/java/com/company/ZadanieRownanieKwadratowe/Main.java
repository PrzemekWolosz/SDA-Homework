package com.company.ZadanieRownanieKwadratowe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] variables = new double[3];
        variables = getVariables(variables);
        QuadraticEquation quadraticEquation = new QuadraticEquation(variables[0], variables[1], variables[2]);
        quadraticEquation.solveEquation();
    }

    public static double[] getVariables(double[] variables) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type variable A");
        double a = scanner.nextDouble();
        while (a == 0) {
            System.out.println("Variable A cannot bez zero, please type next one");
            a = scanner.nextDouble();
        }
        System.out.println("Type variable B");
        double b = scanner.nextDouble();
        System.out.println("Type variable C");
        double c = scanner.nextDouble();
        variables[0] = a;
        variables[1] = b;
        variables[2] = c;

        return variables;
    }
}
