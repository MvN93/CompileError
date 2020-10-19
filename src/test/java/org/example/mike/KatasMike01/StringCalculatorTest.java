package org.example.mike.KatasMike01;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    void inputEmptyStringReturnZero(){
        String emptyString = "";
        StringCalculator stringCalculator = new StringCalculator();
        stringCalculator.sum(emptyString);
    }
}
