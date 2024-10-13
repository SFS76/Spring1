package ru.skypro.spring1.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.spring1.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public float plus(float num1, float num2) {
        return num1 + num2;
    }

    @Override
    public float minus(float num1, float num2) {
        return num1 - num2;
    }

    @Override
    public float multiply(float num1, float num2) {
        return num1 * num2;
    }

    @Override
    public float divide(float num1, float num2) {
        return num1 / num1;
    }
}
