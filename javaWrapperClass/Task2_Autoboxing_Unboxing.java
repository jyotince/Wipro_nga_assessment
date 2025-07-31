package classPractice.javaWrapperClass;

import java.util.ArrayList;
import java.util.List;

//Task2: Autoboxing and Unboxing 

public class Task2_Autoboxing_Unboxing {
    public static void main(String[] args) {

        List<Double> doubleList = new ArrayList<>();

        doubleList.add(10.5);
        doubleList.add(20.0);
        doubleList.add(15.75);
        doubleList.add(13.25);

        double sum = 0;

        for (Double value : doubleList) {
            sum += value; 
        }

        double average = sum / doubleList.size();

        System.out.println("Values: " + doubleList);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}

