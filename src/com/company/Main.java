package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SqEquation [] equations = new SqEquation[3];

        equations[0] = new SqEquation(1, 6, 9);
        equations[1] = new SqEquation(1, 4, -5);
        equations[2] = new SqEquation(1, 4, 5);

        for (SqEquation equation : equations) {
            equation.solve();
        }
    }
}
