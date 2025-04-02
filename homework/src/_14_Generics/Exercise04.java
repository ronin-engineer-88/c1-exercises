package _14_Generics;

import java.util.Arrays;
import java.util.List;

public class Exercise04 {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);

        System.out.println("Sum of intList: " + sumNumbers(intList));
        System.out.println("Sum of doubleList: " + sumNumbers(doubleList));
    }
}

