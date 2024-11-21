public class Main{
	public static void main(String[] args) {  // Выводит 1 exception по порядку (если есть ошибка условия в 2-х матрицах, то программа завершится с исключением для первой попавшейся)
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "3", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"} 
        };

        String[][] invalidArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "a", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            Number1.processArray(validArray);
            System.out.println();
            Number1.processArray(invalidArray);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

}