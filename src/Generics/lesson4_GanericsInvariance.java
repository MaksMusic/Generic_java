package Generics;

import java.util.ArrayList;
import java.util.List;

public class lesson4_GanericsInvariance {
    public static void main(String[] args) {
        List<Integer>  list = new ArrayList<>();
        //List<Number> list2 = list; ошибка компиляции
        List<Integer> list2 = list;
    }
}
