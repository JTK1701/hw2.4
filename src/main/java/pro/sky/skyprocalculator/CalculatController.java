
package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

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
    public String plus(@RequestParam("num1") int n1, @RequestParam("num2") int n2){
        return calculatorService.plus(n1, n2);
    }
    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") int n1, @RequestParam("num2") int n2) {
        return calculatorService.minus(n1, n2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int n1, @RequestParam("num2") int n2) {
        return calculatorService.multiply(n1, n2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") int n1, @RequestParam("num2") int n2) {
        return calculatorService.divide(n1, n2);
    }
}
