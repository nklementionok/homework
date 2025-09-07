//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }

    public static class ArrayFourFour {
        public void processArray(String[][] array) throws MyArraySizeException {
            if (array == null || array.length != 4) { // Проверка количества строк
                throw new MyArraySizeException("Должно быть 4 строки.");
            }
            for (String[] row : array) {
                if (row == null || row.length != 4) { // Проверка количества столбцов в каждой строке
                    throw new MyArraySizeException("Должно быть 4 элемента.");
                }
            }
        }


        public static class MyArrayDataException extends Exception {
            public MyArrayDataException(String message) {
                super(message);
            }
        }

        public int sumArray(String[][] array) throws MyArrayDataException {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(
                                "Неверные данные в ячейке (неправильный массив): строка " + (i + 1) + ", столбец " + (j + 1) + ". Значение: " + array[i][j]
                        );
                    }
                }
            }
            return sum;
        }

        public static class ArrayIndexOutOfBoundsException extends Exception {
            public ArrayIndexOutOfBoundsException(String message) {
                super(message);
            }
        }
    }



    public static void main(String[] args) {
        ArrayFourFour processor = new ArrayFourFour();
        ArrayFourFour processor1 = new ArrayFourFour();

        // Пример правильного массива
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        // Пример неправильного массива (не 4х4)
        String[][] incorrectArray = {
                {"1", "2"},
                {"3", "яяя"}
        };

        try {
            System.out.println("Попытка обработки правильного массива:");
            processor.processArray(correctArray);
            System.out.println("все ок");
        } catch (MyArraySizeException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        System.out.println("///////////////////////////");

        try {
            System.out.println("Попытка обработки неправильного массива:");
            processor1.processArray(incorrectArray);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            int totalSum1 = processor.sumArray(correctArray);
            System.out.println("Сумма первого массива: " + totalSum1); // Вывод: 45
        } catch (ArrayFourFour.MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            int totalSum2 = processor.sumArray(incorrectArray);
            System.out.println("Сумма второго массива: " + totalSum2);
        } catch (ArrayFourFour.MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage()); // Вывод: Ошибка: Неверные данные в ячейке: строка 2, столбец 2. Значение: abc
        }

        String value = correctArray [8][1]; // Это вызовет исключение
        System.out.println("Значение элемента из массива: " + value);


    }
}
