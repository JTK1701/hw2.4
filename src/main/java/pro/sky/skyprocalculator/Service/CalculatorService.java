package pro.sky.skyprocalculator.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String calc() {
        return "Добро пожаловать в калькулятор";
    }

    public int plus(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public int minus(int num1, int num2) {
        int diff = num1 - num2;
        return diff;
    }

    public int multiply(int num1, int num2) {
        int mult = num1 * num2;
        return mult;
    }

    public double divide(int num1, int num2) {
        double quo = (double) num1 / num2;
        return quo;

    }
}
