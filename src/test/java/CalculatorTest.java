import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.Main.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @DisplayName("Addition 10 + 12")
    @Test
    void testAddition() {
        //Arrange

        double num1 = 10;
        double num2 = 12;
        double expectedResult = 22;

        //Act

        double result = addition(num1, num2);

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

        //Act

        double result = subtraction(num1, num2);

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

        //Act

        double result = multiplier(num1, num2);

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

        //Act

        double result = divider(num1, num2);

        //Assert

        assertEquals(expectedResult, result);
    }

    @DisplayName("Convert array of strings to int")
    @Test
    void testConvertingStringToInt(){
        //Arrange
        String [] stringArray = {"1", "2", "3"};
        int []expectedArray = {1, 2, 3};


        //Act
        int [] resultArray = arrayStringToInt(stringArray);

        //Assert
        assertArrayEquals(expectedArray, resultArray);
    }
}
