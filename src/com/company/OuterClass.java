package com.company;

public class OuterClass {

    private String name;


    public static class InnerClass {
        public static String innerName = "innerName";

        public static String getInnerName() {
            return innerName;
        }
    }

}
