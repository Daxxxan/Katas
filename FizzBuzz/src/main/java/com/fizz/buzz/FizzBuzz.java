package com.fizz.buzz;

import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .mapToObj(FizzBuzz::fizzBuzz)
                .forEach(System.out::println);
    }

    public static String fizzBuzz(int number) {
        if(number % 15 == 0) {
            return "FizzBuzz";
        } else if(number % 5 == 0) {
            return "Buzz";
        } else if(number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
