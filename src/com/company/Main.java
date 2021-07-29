package com.company;

import com.Computer;
import com.Processor;
import com.streams.StreamExamples;
import org.w3c.dom.Node;

import java.lang.reflect.Field;
import java.util.*;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException {
	// write your code here
        Computer comp1 = new Computer("comp", 1, Processor.AMD);
        Computer comp2 = new Computer("comp", 1, Processor.AMD);

        System.out.println(comp1.equals(comp2));

        System.out.println(comp1.hashCode());
        System.out.println(comp2.hashCode());

        System.out.println(OuterClass.InnerClass.getInnerName());

        Checker<Integer> isOdd = num -> num % 2 != 0;
//        Checker
        System.out.println(isOdd.check(3));
        System.out.println(isOdd.check(4));

        Map<String, Integer> mapa = new HashMap<>();
        Integer pipa = mapa.get("pipa");
        Integer one = 123456789;
        Integer two = 123456789;

        System.out.println(one.hashCode());
        System.out.println(two.hashCode());

        List<String> lista = new ArrayList<>();
        Set<String> set = new HashSet<>(lista);


        mapa.put("one", one);
        mapa.put("two", two);
        mapa.replace("one", one);

        System.out.println(mapa.size());


        HashClassTest one1 = new HashClassTest(1, "1");
        HashClassTest one2 = new HashClassTest(2, "2");
        HashClassTest one3 = new HashClassTest(3, "3");
        HashClassTest one4 = new HashClassTest(4, "4");
        HashClassTest one5 = new HashClassTest(5, "5");
        HashClassTest one6 = new HashClassTest(6, "6");
        HashClassTest one7 = new HashClassTest(7, "7");
        HashClassTest one8 = new HashClassTest(8, "8");
        HashClassTest one9 = new HashClassTest(9, "9");

        HashMap<HashClassTest, Integer> mapka = new HashMap<>();
        mapka.put(one1, 1);
        mapka.put(one2, 1);
        mapka.put(one3, 1);
        mapka.put(one4, 1);
        mapka.put(one5, 1);
        mapka.put(one6, 1);
        mapka.put(one7, 1);
        mapka.put(one8, 1);
        mapka.put(one9, 1);

        Set<Map.Entry<HashClassTest, Integer>> entries = mapka.entrySet();
        Field tableField = mapka.getClass().getDeclaredField("table");

        String dupaa = ";";

//        Node[] tableNodes = (Node[]) tableField;

//        tableField.setAccessible(true);


        String dupa = ";";


        new StreamExamples().streamTraining();

    }
}
