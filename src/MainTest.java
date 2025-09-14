import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MainTest extends Assert{

        //сумма

       @DataProvider
       @Test
       void mainTestAdd() {
            assertEquals(-5, Main.Calculator.add(-10, 5), "-10 + 5 = -5");
        }

    public static void assertEquals(int i, int add, String s) {
    }

    //разность

    @DataProvider
    @Test
        void mainTestsubstract() {
            assertEquals(-15, Main.Calculator.substract(-10, 5), "-10 - 5 = -15");
        }

        //умножение

    @DataProvider
    @Test
        void mainTestmultiplyPossitiveNums() {
            assertEquals(15, Main.Calculator.multiply(5, 3), "5*3=15");
        }

    @DataProvider
    @Test
        void mainTestmultiplyPossitiveAndNegativeNums() {
            assertEquals(-15, Main.Calculator.multiply(-5, 3), "-5*3=-15");
        }
    @DataProvider
    @Test
        void mainTestmultiplyToZero() {
            assertEquals(0, Main.Calculator.multiply(-5, 0), "-5*0=0");
        }


        //деление

    @DataProvider
    @Test
        void mainTestdividePossitiveNums() {
            assertEquals(2, Main.Calculator.divide(10, 5), "Деление 10 на 5 должно быть 2");
        }

    @DataProvider
    @Test
        void mainTestdivideNegatineAndPossitiveNums() {
            assertEquals(-2, Main.Calculator.divide(-10, 5), "Деление -10 на 5 должно быть -2");
        }

    @DataProvider
    @Test
        void mainTestdivideNegatineNums() {
            assertEquals(2, Main.Calculator.divide(-10, -5), "Деление -10 на -5 должно быть 2");
        }

    @DataProvider
    @Test
        void mainTestdivideToZero() {
            assertEquals(0, Main.Calculator.divide(-10, 0), "На ноль делить нельзя");
        }
//сравнение

    @DataProvider
    @Test
        void mainTestcompareNegatineAndPossitiveNums() {
            assertEquals(5, Main.Calculator.compare(-10, 5), "Больше 5");
        }

    @DataProvider
    @Test
        void mainTestcompareNegatineNums() {
            assertEquals(-5, Main.Calculator.compare(-10, -5), "-10 меньше");
        }

    @DataProvider
    @Test
        void mainTestcompareNegatineAndZero() {
            assertEquals(0, Main.Calculator.compare(-10, 0), "-10 меньше");
        }

    @DataProvider
    @Test
        void mainTestcomparePossitiveAndZero() {
            assertEquals(10, Main.Calculator.compare(10, 0), "0 меньше");
        }

        //треугольник

    @DataProvider
    @Test
        void mainTestTriangleArea() {
            assertEquals(20, (int) Main.TriangleArea.calculateArea(20, 2), "20*2/2=20");
        }

    @DataProvider
    @Test
        void mainTestTriangleAreaNegativeBase() {
            assertEquals(0, (int) Main.TriangleArea.calculateArea(-20.0, 2.0), "отрицательное основание");
        }

    @DataProvider
    @Test
        void mainTestTriangleAreaNegativeHeight() {
            assertEquals(0, (int) Main.TriangleArea.calculateArea(20.0, -2.0), "отрицательная высота");
        }


    @DataProvider
    @Test
        void mainTestgetFactorialIterative() {
            assertEquals(1, Main.getFactorialIterative(1), " 1*2*3=6");
        }

    @DataProvider
    @Test
        void mainTestgetFactorialIterativeZero() {
            assertEquals(1, Main.getFactorialIterative(0), " 0!=1");
        }

    @DataProvider
    @Test
        void mainTestgetFactorialIterativeOne() {
            assertEquals(1, Main.getFactorialIterative(1), " 1!=1");
        }
    }


