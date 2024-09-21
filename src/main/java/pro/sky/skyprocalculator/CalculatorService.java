package pro.sky.skyprocalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String calc() {
        return "Добро пожаловать в калькулятор";
    }
    public String plus(int num1, int num2) {
        int sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
    }

    public String minus(int num1, int num2) {
        int diff = num1 - num2;
        return num1 + " - " + num2 + " = " + diff;
    }

    public String multiply(int num1, int num2) {
        int mult = num1 * num2;
        return num1 + " * " + num2 + " = " + mult;
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            return " <h1 style=\"color: red;\">Деление на ноль запрещено</h1>";
        } else {
            double quo = (double) num1 / num2;
            return num1 + " / " + num2 + " = " + quo;
        }
    }
}
