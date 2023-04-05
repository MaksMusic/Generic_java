package Generics;

import java.util.ArrayList;

public class lesson2_GenericsClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        //list.add("Привет");
        Example<String> example = new Example<>("hello");
        example.print("Hello");

        GenericsMetod genericsMetod = new GenericsMetod();
        genericsMetod.ss("строк 1","строка 2");
        genericsMetod.ss(10,20);

    }



    static class Example<T> {

        // Объявление массива
        T[] array;

        // Объявление переменной
        T variable;

        // констурктор
        public Example(T variable) {
            this.variable = variable;
        }

        // Объявление метода с дженериком
        public void print(T input) {
            System.out.println("Input: " + input);
        }

        // Объявление листа с дженериком
        ArrayList<T> list = new ArrayList<>();
    }


    //класс в котором только метод принимает Тип
    static class GenericsMetod{
        public  <T> void ss(T t, T t2) {
            System.out.println(t + " " + t2);
        }
    }


}
