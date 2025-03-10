import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public  class CalculatorTest{
    @DisplayName("Addition 10 + 12")
    @Test
    void testAddition() {
        //Arrange

        double num1 = 10;
        double num2 = 12;
        double expectedResult = 22;
        Calculator calc = new Calculator();

        //Act

        double result = calc.addition(num1, num2);

        //Assert

        assertEquals(expectedResult, result);
    }

    @DisplayName("Subtraction 12 - 2")
    @Test
    void testSubtraction() {
        //Arrange

        double num1 = 12;
        double num2 = 2;
        double expectedResult = 10;
        Calculator calc = new Calculator();

        //Act

        double result = calc.subtraction(num1, num2);

        //Assert

        assertEquals(expectedResult, result);
    }

    @DisplayName("Multiplication 6 * 3")
    @Test
    void testMultiplication() {
        //Arrange

        double num1 = 6;
        double num2 = 3;
        double expectedResult = 18;
        Calculator calc = new Calculator();

        //Act

        double result = calc.multiplier(num1, num2);

        //Assert

        assertEquals(expectedResult, result);
    }

    @DisplayName("Division 16 / 2")
    @Test
    void testDivision() {
        //Arrange

        double num1 = 16;
        double num2 = 2;
        double expectedResult = 8;
        Calculator calc = new Calculator();

        //Act

        double result = calc.divider(num1, num2);

        //Assert

        assertEquals(expectedResult, result);
    }

    @DisplayName("Convert array of strings to int")
    @Test
    void testConvertingStringToInt() {
        //Arrange
        String[] stringArray = {"1", "2", "3"};
        int[] expectedArray = {1, 2, 3};
        Calculator calc = new Calculator();

        //Act
        int[] resultArray = calc.arrayStringToInt(stringArray);

        //Assert
        assertArrayEquals(expectedArray, resultArray);
    }
}
