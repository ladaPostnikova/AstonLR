public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"7", "5", "4", "12"},
                {"5", "2", "6", "5"},
                {"23", "1", "2", "12"},
                {"15", "9", "8", "10"}
        };

        try {
            int result = ArrayCheck.arrayCheck(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
           System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных массива: " + e.getMessage());
        }

        System.out.println("\nВызов ошибки: ");
        try {
            System.out.println(array[4][4]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за пределы массива");
        }
    }
}
