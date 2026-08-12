import java.util.*;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

public class TASK09 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        boolean addTest = calc.add(10, 20) == 30;
        boolean divTest = calc.divide(20, 2) == 10;

        if (addTest && divTest)
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");
    }
}