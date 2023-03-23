package task1;

/**
 * —оздайте обобщенный класс —умма, который принимает два параметра разного типа и возвращает их сумму.
 */
public class Sum<T, U> {
        private T first;
        private U second;

        public Sum(T first, U second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public U getSecond() {
            return second;
        }

        public double sum() {
            return ((Number) first).doubleValue() + ((Number) second).doubleValue();
        }
    }



    class Main{
        public static void main(String[] args) {
            Sum<Integer, Double> sum1 = new Sum<>(5, 3.14);
            System.out.println(sum1.sum()); // 8.14

            // «десь будет ошибка компил€ции, так как не поддерживаетс€ операци€ сложени€ строк и чисел
            Sum<String, Double> sum2 = new Sum<>("Hello", 2.71828);

        }
    }