import java.math.BigInteger;
import static java.lang.System.*;
import java.util.Scanner;

public class Main {

    public static int getFactorialIterative(int number) {
        //
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }


    //  BigInteger result = BigInteger.ONE;
    //  for (int i = 1; i <= number; i++) {
    //     result = result.multiply(BigInteger.valueOf(i));
    //  }
    //  return result;
    // }



    public static class TriangleArea { //Только равнобедренные треугольники

        public static double calculateArea(double base, double height) {
            if (base < 0 | height < 0) {
                out.println("отрицательные значения");
                return 0;
            } else {
                return (base * height) / 2;
            }}
    }

    public static class Calculator {
        private static int num1;
        private static int num2;


        // Метод для сложения двух целых чисел
        public static int add(int num1, int num2) {
            Calculator.num1 = num1;
            Calculator.num2 = num2;
            System.out.println("сумма: " + (num1 + num2));
            return num1 + num2;
        }

        // Метод для вычитания двух целых чисел
        public static int substract(int num1, int num2) {
            Calculator.num1 = num1;
            Calculator.num2 = num2;
            System.out.println("разность: " + (num1 - num2));
            return num1 - num2;
        }

        // Метод для умножения двух целых чисел
        public static int multiply(int num1, int num2) {
            Calculator.num1 = num1;
            Calculator.num2 = num2;
            System.out.println("умножение: " + (num1 * num2));
            return num1 * num2;
        }

        // Метод для деления двух целых чисел
        public static int divide(int num1, int num2) {
            Calculator.num1 = num1;
            Calculator.num2 = num2;
            //  деление на ноль
            if (num2 == 0) {
                out.println("Деление на ноль");
                return 0;
            } else {
                System.out.println("деление: " + (num1 / num2));
                return num1 / num2;
            }
        }

        // Метод для сравнения двух целых чисел
        public static int compare(int num1, int num2) {
            Calculator.num1 = num1;
            Calculator.num2 = num2;
            if (num1==num2) {
                System.out.println("сравнение: " + num1 + "=" + num2);
                return num1;
            } else if (num1 > num2) {
                System.out.println("сравнение: " + num1 + ">" + num2);
                return num1;
            } else {
                System.out.println("сравнение: " + num1 + "<" + num2);
                return num2;
            }}

    }

    public static void main(String[] args) {

//факториал
        Scanner scanner = new Scanner(System.in);
        out.println("Введите натуральное число для расчета факториала");
        int number = scanner.nextInt();

        if (number < 0) {
            out.println("Факториал рассчитывают для натуральных чисел");
        } else {

            int factorial = getFactorialIterative(number);
            out.println("Факториал " + number + " равен: " + factorial);
        }
        out.println(" ");

//Треугольник
        Scanner scanner1 = new Scanner(System.in);
        out.println("Введите основание равнобедренного треугольника");
        double base = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        out.println("Введите высоту равнобедренного треугольника");
        double height = scanner.nextInt();

        //  ввод отрицательного значения высоты или основания треугольника
        if (base < 0  | height < 0) {
            out.println("Такого треугольникa не существует");
        } else {
            double area = TriangleArea.calculateArea(base, height);
            out.println("Площадь треугольника: " + area);
            out.println(" " );
        }
        out.println(" " );

//Арифметические действия

        out.println("Арифметические действия");
        Scanner scanner3 = new Scanner(System.in);
        out.println("Введите первое число");
        int num1  = scanner.nextInt();
        Scanner scanner4 = new Scanner(System.in);
        out.println("Введите второе число");
        int num2  = scanner.nextInt();
        //int num1 = 10;
        //int num2 = 2;
        out.println("число1 = " + num1);
        out.println("число2 = " + num2);

        Calculator.add(num1,num2);
        Calculator.substract(num1,num2);
        Calculator.multiply(num1,num2);
        Calculator.divide(num1,num2);
        Calculator.compare(num1,num2);


    }
}

