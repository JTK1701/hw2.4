
package pro.sky.skyprocalculator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprocalculator.Service.CalculatorService;

@RestController
@RequestMapping

public class CalculatController {
    private final CalculatorService calculatorService;

    public CalculatController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(path = "/calculator")
    public String calculator() {
        return calculatorService.calc();
    }

    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1") int n1, @RequestParam("num2") int n2) {
        return n1 + " + " + n2 + " = " + calculatorService.plus(n1, n2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") int n1, @RequestParam("num2") int n2) {
        return n1 + " - " + n2 + " = " + calculatorService.minus(n1, n2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int n1, @RequestParam("num2") int n2) {
        return n1 + " * " + n2 + " = " + calculatorService.multiply(n1, n2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") int n1, @RequestParam("num2") int n2) {
        if (n2 == 0) {
            return "Деление на 0 запрещено.";
        } else {
            return n1 + " / " + n2 + " = " + calculatorService.divide(n1, n2);
        }
    }
}
