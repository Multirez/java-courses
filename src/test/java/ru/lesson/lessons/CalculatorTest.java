package ru.lesson.lessons;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing Calculator class.
 * Created by Mult on 27.04.2017.
 */
public class CalculatorTest {

    @Test
    public void Sum() throws Exception {
        Calculator calc = new Calculator();
        calc.Sum(3, 4);

    }

}