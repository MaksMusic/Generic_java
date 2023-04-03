package Generics;

import java.util.Arrays;
import java.util.List;

public class GenericRestrictions {
    public static void main(String[] args) {

    }

    /** ������ , ��������������� ����������� �������� ���������� �� ��������� ����: */
    public class Example<T> {
        private T value;

        public Example() {
            // ������ ������� ��������� �� ��������� ���� T
            // value = new T(); - ������ ����������

            //��� �����
        value = (T) new Object();
        }
    }


    /**������ , ��������������� ����������� �������� ������� ������������� ��� ���� ���������� ������:*/
    static class Example2<T> {
        private T[] array;

        public Example2() {
            // ������ ������� ������ ������������� ��� ���� ���������� ������
            // �� ����� ������� ������ Object � �������� ��� � ����������� ����:

            // array = new T[10]; - ������ ����������
            array = (T[]) new Object[10];
        }
    }

    /**  ������ , ��������������� ����������� �������� ���������� ����������� ����������: */
    static class Example3<T> {
        // ������ ������� ���������� ����������� ����������
        // �� ����� ������� ����������� ���������� ���� Object � �������� �� � ����������� ����:

        // private static T value; - ������ ����������

        private static Object value;
        public static <T> T getValue() {
            return (T) value;
        }
    }

}
