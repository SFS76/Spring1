package ru.skypro.spring1.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.spring1.service.CalculatorService;

@RestController
@RequestMapping("calculator")
public class CalculatorControl {

    private CalculatorService calculatorService;
    public CalculatorControl(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор";

    }

    @GetMapping("plus")
    public String plus(@RequestParam(required = false) float num1, @RequestParam(required = false) float num2) {
        if (num1 == null || num2 == null) {
            return "Для вычислений нужны оба аргумента";
        }
        float result = calculatorService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("minus")
    public String minus(@RequestParam(required = false) float num1, @RequestParam(required = false) float num2) {
        if (num1 == null || num2 == null) {
            return "Для вычислений нужны оба аргумента";
        }
        float result = calculatorService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping("multiply")
    public String multiply(@RequestParam(required = false) float num1, @RequestParam(required = false) float num2) {
        if (num1 == null || num2 == null) {
            return "Для вычислений нужны оба аргумента";
        }
        float result = calculatorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("divide")
    public String divide(@RequestParam(required = false) float num1, @RequestParam(required = false) float num2) {
        if (num1 == null || num2 == null) {
            return "Для вычислений нужны оба аргумента";
        }
        if (num2 == 0) {
            return "Делить на 0 запрещено";
        }
        float result = calculatorService.divide(num1, num2);
        return num1 + " / " + num2 + " = " + result;
    }

}
