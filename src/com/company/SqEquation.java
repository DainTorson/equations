package com.company;


public class SqEquation {

    private double aQuotient;
    private double bQuotient;
    private double cQuotient;

    public SqEquation(double a, double b, double c) {

        this.aQuotient = a;
        this.bQuotient = b;
        this.cQuotient = c;

    }

    public void solve() {

        double discriminant = 0;

        try {
            discriminant = Math.pow(bQuotient, 2)  - 4 * aQuotient * cQuotient;
            if(discriminant < 0) {
                throw new NoSolutionException();
            }
        }
        catch (NoSolutionException exception) {
            System.out.println(exception.getMessage());
            return;
        }

        double solution1 = (-1 * bQuotient + Math.sqrt(discriminant)) / (2 * aQuotient);
        double solution2 = (-1 * bQuotient - Math.sqrt(discriminant)) / (2 * aQuotient);

        System.out.println("x1 = " + String.valueOf(solution1) + ", "
                + "x2 = " + String.valueOf(solution2));
    }
}
