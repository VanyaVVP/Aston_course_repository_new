public class Number1 {
	static void processArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr == null) {                                                               // исключение размера массива
            throw new MyArraySizeException("Массив не может быть null");
        }
        if (arr.length != 4) {
            throw new MyArraySizeException("Массив должен иметь 4 строки");
        }
        for (int i = 0; i < 4; i++) {
            if (arr[i] == null || arr[i].length != 4) {
                throw new MyArraySizeException("Каждая строка массива должна иметь 4 элемента");
            }
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {     // исключение преобразования
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка преобразования в число в ячейке [" + i + "][" + j + "]: " + arr[i][j]);
                }
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
	}

