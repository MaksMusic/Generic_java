package Generics;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class lesson5_GenericsWildcards {
    public static void main1(String[] args) {
        /** Ковариантность (как у обычного наследования) */
        //можно
        List<Integer> list = new ArrayList<>();
        List<? extends  Number> list2 = list;

        //нельзя
//        List<Number> list3 = new ArrayList<>();
//        List<? extends  Integer> list5 = list3;



        /** Контравариантность (или Integer  или тот кто является супер классом для Integer)*/
        //можно
        List<Number> listArr = new ArrayList<>();
        List<? super  Integer> listArr2 = listArr;

        //нельзя
//        List<Object> list3 = new ArrayList<>();
//        List<? extends  Integer> list5 = list3;
    }


    public static void main2(String[] args) {
       List<Integer> list = new ArrayList<>();
       list.add(5);
       list.add(15);
       list.add(25);
       System.out.println(sum(list));

    }
    //method использует Ковариантность

    public static <T extends Number> T sum(List<T> list) {
        Double sum = Double.valueOf(0); // начальное значение суммы
        for (T value : list) {
            sum += value.doubleValue(); // складываем значения суммы и текущего элемента
        }
        return (T) sum;
    }

    //method2 c объектами использует Ковариантность


    public static void main(String[] args) {
        List<Fruit> fruits = mergeLists(new ArrayList<Apple>(), new ArrayList<Banana>());
    }

    public static List<Fruit> mergeLists(List<? extends Fruit> a, List<? extends Fruit> b) {
        List<Fruit> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    public abstract class Fruit {
        private String name;
        private String color;

        public Fruit(String name, String color) {
            this.name = name;
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public abstract void getInfo();
    }

    public class Apple extends Fruit {
        private String variety;

        public Apple(String name, String color, String variety) {
            super(name, color);
            this.variety = variety;
        }

        public String getVariety() {
            return variety;
        }

        public void setVariety(String variety) {
            this.variety = variety;
        }

        @Override
        public void getInfo() {
            System.out.println("Name: " + getName() + ", Color: " + getColor() + ", Variety: " + getVariety());
        }
    }

    public class Banana extends Fruit {
        private int length;

        public Banana(String name, String color, int length) {
            super(name, color);
            this.length = length;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        @Override
        public void getInfo() {
            System.out.println("Name: " + getName() + ", Color: " + getColor() + ", Length: " + getLength() + "cm");
        }
    }



}
