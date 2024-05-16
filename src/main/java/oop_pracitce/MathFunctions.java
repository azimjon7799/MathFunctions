package oop_pracitce;

public class MathFunctions {
    public static final double PI = 3.14159265359;
    public static final double E = 2.71828182846;

    public static void main(String[] args) {
        System.out.println(powE(2));
    }


    // Doira yuzini hisoblash
    public static double circleArea(double radius) {
        return PI * (positiveDegree(radius, 2));
    }

    // E=2.71828182846 sonini berilgan musbat darajaga oshirish
    public static double powE(double degree){
        if(degree == 0){
            return 1;
        }
        if(degree == 1){
            return E;
        }
        double result = 1;
        for(int i = 0; i < degree; i ++){
            result *= E;
        }
        return result;
    }
    // Uchburchak yuzini Geron formulasi yordamida hisoblash
    public static double calculateAreaByHeron(double a, double b, double c) {
        double p = (a + b + c) / 2; // yarim perimetr
        return sqrt(p*(p-a)*(p-b)*(p-c)); // yuza geron formulasi orqali
    }

    // Berigan sonning musbat butun darajasini hisoblash
    public static double positiveDegree(double number, double degree){
        if(degree == 0){
            return 1;
        }
        if(number == 1){
            return 1;
        }
        double result = 1;
        for(int i = 0; i < degree; i++){
            result *= number;
        }
        return result;
    }

    //Berilgan sonning musbat ildizini hisoblash
    public static double sqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number");
        }

        // Initial guess
        double guess = number / 2.0;
        double tolerance = 1e-10; // Convergence tolerance
        double difference;

        do {
            double newGuess = 0.5 * (guess + number / guess);
            difference = Math.abs(guess - newGuess);
            guess = newGuess;
        } while (difference > tolerance);

        return guess;
    }
}
