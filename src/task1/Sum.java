package task1;

/**
 * �������� ���������� ����� �����, ������� ��������� ��� ��������� ������� ���� � ���������� �� �����.
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

            // ����� ����� ������ ����������, ��� ��� �� �������������� �������� �������� ����� � �����
            Sum<String, Double> sum2 = new Sum<>("Hello", 2.71828);

        }
    }