package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        String[] myArray = new String[]{"HELLO", "People", "Of", "ELDAR", "This", "Is", "Homework", "Five", "Greetings"};

        String result = Arrays.stream(myArray)
                .map(n -> String.valueOf(n).toLowerCase())
                .collect(Collectors.joining(" "));
        System.out.println(result);

    }
}