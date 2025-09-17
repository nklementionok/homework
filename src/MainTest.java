import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //сумма

    @org.junit.jupiter.api.Test
    @Test
    void mainTestAdd() {
        assertEquals(-5, Main.Calculator.add(-10, 5), "-10 + 5 = -5");
    }

    //разность

    @org.junit.jupiter.api.Test
    @Test
    void mainTestsubstract() {
        assertEquals(-15, Main.Calculator.substract(-10, 5), "-10 - 5 = -15");
    }

    //умножение

    @org.junit.jupiter.api.Test
    @Test
    void mainTestmultiplyPossitiveNums() {
        assertEquals(15, Main.Calculator.multiply(5, 3), "5*3=15");
    }

    @org.junit.jupiter.api.Test
    @Test
    void mainTestmultiplyPossitiveAndNegativeNums() {
        assertEquals(-15, Main.Calculator.multiply(-5, 3), "-5*3=-15");
    }
    @org.junit.jupiter.api.Test
    @Test
    void mainTestmultiplyToZero() {
        assertEquals(0, Main.Calculator.multiply(-5, 0), "-5*0=0");
    }


    //деление

    @org.junit.jupiter.api.Test
    @Test
    void mainTestdividePossitiveNums() {
        assertEquals(2, Main.Calculator.divide(10, 5), "Деление 10 на 5 должно быть 2");
    }

    @org.junit.jupiter.api.Test
    @Test
    void mainTestdivideNegatineAndPossitiveNums() {
        assertEquals(-2, Main.Calculator.divide(-10, 5), "Деление -10 на 5 должно быть -2");
    }

    @org.junit.jupiter.api.Test
    @Test
    void mainTestdivideNegatineNums() {
        assertEquals(2, Main.Calculator.divide(-10, -5), "Деление -10 на -5 должно быть 2");
    }

    @org.junit.jupiter.api.Test
    @Test
    void mainTestdivideToZero() {
        assertEquals(0, Main.Calculator.divide(-10, 0), "На ноль делить нельзя");
    }
//сравнение

    @org.junit.jupiter.api.Test
    @Test
    void mainTestcompareNegatineAndPossitiveNums() {
        assertEquals(5, Main.Calculator.compare(-10, 5), "Больше 5");
    }

    @org.junit.jupiter.api.Test
    @Test
    void mainTestcompareNegatineNums() {
        assertEquals(-5, Main.Calculator.compare(-10, -5), "-10 меньше");
    }

    @org.junit.jupiter.api.Test
    @Test
    void mainTestcompareNegatineAndZero() {
        assertEquals(0, Main.Calculator.compare(-10, 0), "-10 меньше");
    }

    @org.junit.jupiter.api.Test
    @Test
    void mainTestcomparePossitiveAndZero() {
        assertEquals(10, Main.Calculator.compare(10, 0), "0 меньше");
    }

    //треугольник

    @org.junit.jupiter.api.Test
    @Test
    void mainTestTriangleArea() {
        assertEquals(20, Main.TriangleArea.calculateArea(20, 2), "20*2/2=20");
    }

    @org.junit.jupiter.api.Test
    @Test
    void mainTestTriangleAreaNegativeBase() {
        assertEquals(0, Main.TriangleArea.calculateArea(-20, 2), "отрицательное основание");
    }

    @org.junit.jupiter.api.Test
    @Test
    void mainTestTriangleAreaNegativeHeight() {
        assertEquals(0, Main.TriangleArea.calculateArea(20, -2), "отрицательная высота");
    }


    @org.junit.jupiter.api.Test
    @Test
    void mainTestgetFactorialIterative() {
        assertEquals(1, Main.getFactorialIterative(1), " 1*2*3=6");
    }

    @org.junit.jupiter.api.Test
    @Test
    void mainTestgetFactorialIterativeZero() {
        assertEquals(1, Main.getFactorialIterative(0), " 0!=1");
    }

    @org.junit.jupiter.api.Test
    @Test
    void mainTestgetFactorialIterativeOne() {
        assertEquals(1, Main.getFactorialIterative(1), " 1!=1");
    }
  }


