package Generics;

import java.util.Arrays;
import java.util.List;

public class GenericRestrictions {
    public static void main(String[] args) {

    }

    /** Пример , демонстрирующий ограничение создания экземпляра по параметру типа: */
    public class Example<T> {
        private T value;

        public Example() {
            // Нельзя создать экземпляр по параметру типа T
            // value = new T(); - ошибка компиляции

            //так можно
        value = (T) new Object();
        }
    }


    /**Пример , демонстрирующий ограничение создания массива специфических для типа обобщенных ссылок:*/
    static class Example2<T> {
        private T[] array;

        public Example2() {
            // Нельзя создать массив специфических для типа обобщенных ссылок
            // Но можно создать массив Object и привести его к обобщенному типу:

            // array = new T[10]; - ошибка компиляции
            array = (T[]) new Object[10];
        }
    }

    /**  Пример , демонстрирующий ограничение создания обобщенных статических переменных: */
    static class Example3<T> {
        // Нельзя создать обобщенную статическую переменную
        // Но можно создать статическую переменную типа Object и привести ее к обобщенному типу:

        // private static T value; - ошибка компиляции

        private static Object value;
        public static <T> T getValue() {
            return (T) value;
        }
    }

}
