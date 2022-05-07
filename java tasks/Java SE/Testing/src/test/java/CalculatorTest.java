import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    @Test()
    ///checked invalid format of variables
    public void whenInputIncorrectValueThenThrowException() {
        boolean wasException=false;
        try {
            calculator.added("asdfgasdf", "5");
        }catch (Exception e){
            wasException=true;
        }
            assertTrue(wasException);
    }


    @Test
        //тестим 2 + 2 = 4
    void twoPlusTwoEqualFour() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void threePlusSevenEqualTen() {
        assertTrue(calculator.add(3, 7) == 10);
    }

    @Test
    void multiple() {
        assertEquals(15, calculator.multiple(3, 5));

    }

    @Test
    void divide() {
        assertEquals(10, calculator.divide(20, 2));
    }

    @Test
    void square() {
        assertEquals(4, calculator.square(2));
    }
    @AfterEach
    public void close() {
        calculator = null;
    }


}
