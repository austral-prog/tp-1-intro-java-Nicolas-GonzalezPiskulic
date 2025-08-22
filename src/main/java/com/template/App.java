package com.template;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        // TODO: Implement this method
        return (a + b);
    }

    // 2. Check Even or Odd
    public boolean isEven(int number) {
        // TODO: Implement this method
        return !(1==(number % 2));
    }

    // 3. Maximum of Two Numbers
    public int max(int a, int b) {
        // TODO: Implement this method
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            return 0;
        }
    }

    // 4. Factorial of a Number
    public int factorial(int n) {
        // TODO: Implement this method
        int boo = 1;
        int fer = n;
        while (fer > 0) {
            boo = boo * fer;
            fer -= 1;
        }
        return boo;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        // TODO: Implement this method
        return input.length();
    }

    // 6. Reverse a String
    public String reverse(String input) {
        // TODO: Implement this method
        return (new StringBuilder(input)).reverse().toString();
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        // TODO: Implement this method
        for ( int i = 2; i<number; i++) {
            if (number % i == 0) {
            return false;
            }
            }
        return true;
        }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
        // TODO: Implement this method
        int buffer = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < buffer) {
                buffer = array[i];
            }
        }
    return buffer;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        // TODO: Implement this method
        int buffer = 0;
        for (int i = 0; i < array.length; i++) {
            buffer += array[i];
        }
    return buffer;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        // TODO: Implement this method
        return (((celsius*9)/5)+32);
    }

    // 11. Sum of Elements in a List
    public int sumList(List<Integer> list) {
        // TODO: Implement this method
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return(sum);
    }

    // 12. Find the Largest Element in a List
    public int findMax(List<Integer> list) {
        // TODO: Implement this method
        if (!(list.isEmpty())) {
            int max = list.getFirst();
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > max) {
                    max = list.get(i);
                }
            }
            return max;
        }
        else {
            throw new IllegalArgumentException("list is empty");
        }
    }

    // 13. Filter Even Numbers from a List
    public List<Integer> filterEvenNumbers(List<Integer> list) {
        // TODO: Implement this method
        List<Integer> evens = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i)%2)==0){
                evens.add(list.get(i));
            }
        }
        return evens;
    }

    // 14. Concatenate Two Lists
    public List<String> concatenateLists(List<String> list1, List<String> list2) {
        // TODO: Implement this method
        List<String> lists = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            lists.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            lists.add(list2.get(i));
        }
        return lists;
    }

    // 15. Check if List Contains Element
    public boolean listContains(List<String> list, String element) {
        // TODO: Implement this method
        return (list.contains(element));
    }

    // 16. Convert Strings to Uppercase
    public List<String> toUpperCase(List<String> list) {
        // TODO: Implement this method
        for  (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).toUpperCase());
        }
        return list;
    }

    // 17. Remove Duplicates from a List
    public List<Integer> removeDuplicates(List<Integer> list) {
        // TODO: Implement this method
        List<Integer> nodup = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
                if (!(nodup.contains(list.get(i)))){
                    nodup.add(list.get(i));
            }
        }
        return nodup;
    }

    // 18. Convert List to Set for Unique Elements
    public Set<Integer> listToSet(List<Integer> list) {
        // TODO: Implement this method
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        return set;
    }

    // 19. Check if Map Contains Key
    public boolean mapContainsKey(Map<String, String> map, String key) {
        // TODO: Implement this method
        return map.containsKey(key);
    }

    // 20. Check if Map Contains Value
    public boolean mapContainsValue(Map<String, String> map, String value) {
        // TODO: Implement this method
        return map.containsValue(value);
    }

    // 21. Iterate Over a Map
    public List<String> iterateMap(Map<String, String> map) {
        // TODO: Implement this method
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            resultList.add(entry.getKey() + " -> " + entry.getValue());
        }
        return resultList;
    }
}
