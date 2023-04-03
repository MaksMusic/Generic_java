package tasks;

public class FindMax {
    public static void main(String[] args) {
        // Создаем массивы разных типов
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"apple", "banana", "orange", "pear"};

// Вызываем обобщенный метод для поиска максимальных элементов массивов
        Integer maxInt = findMax(intArray);
        Double maxDouble = findMax(doubleArray);
        String maxString = findMax(stringArray);

// Выводим результаты на экран
        System.out.println("Max integer: " + maxInt); // Max integer: 5
        System.out.println("Max double: " + maxDouble); // Max double: 5.5
        System.out.println("Max string: " + maxString); // Max string: pear
    }




    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}



