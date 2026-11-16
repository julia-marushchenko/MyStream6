/**
 *  Java program to create a stream of numbers and converting it to HashSet.
 */

package com.mystreams;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create a stream of numbers.
        Stream<Integer> myStream = Stream.of(4, 8, 6, 9, 0, 1, 3, 2, 4);

        // Converting it to HashSet.
        HashSet<Integer> setOfNumbers = myStream.collect(Collectors.toCollection(HashSet::new));

        // Printing newly created HashSet instance to console.
        System.out.println(setOfNumbers); // Output: [0, 1, 2, 3, 4, 6, 8, 9]

    }
}
