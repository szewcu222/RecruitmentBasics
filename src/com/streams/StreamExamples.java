package com.streams;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExamples {

    public void streamTraining() {
        System.out.println("StreamExamples.streamTraining");


        Predicate<Integer> isEqual = x -> x % 2 == 0 ;

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> equals = intList.stream()
                .filter(isEqual)
                .collect(Collectors.toList());

        // consumer bierze argument ale zwraca void
        Consumer<Integer> consumerPrint = num -> System.out.println(num);

        intList.forEach(consumerPrint.andThen(consumerPrint));

        String debugStop = "";
    }
    
}
