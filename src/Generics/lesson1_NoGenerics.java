package Generics;

public class lesson1_NoGenerics {
    public static void main(String[] args) {
        Object[] objects = new Object[10];
        objects[0] = 15;
        objects[1] = "Stroka";
        objects[2] = 1.5f;
        objects[3] = new Student("Tom");
        objects[4] = 1.5f;

        for (Object o : objects) {
            System.out.println(o);

//            if ((int)o > 10){ выведет ClassCastException
//                System.out.println("да");
//            }
        }

    }

    static class Student {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
