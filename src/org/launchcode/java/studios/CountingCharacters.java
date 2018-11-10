package org.launchcode.java.studios;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class CountingCharacters {
    public static void main(String[] args) {
        //Creating a Hash map contains character as a key and Integer as a character count value
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the input string by User: ");
        String str = in.nextLine();
        String userString= str.replaceAll("[^A-Za-z]", "");

        //converting given string in to char Array
        char[] strArray = userString.toCharArray();

        //checking each char of strArray

        for(char ch : strArray) {
            if (charCountMap.containsKey(ch)) {

                //if char is present in charCountMap and
                //it is incrementing its count by 1
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        //printing the charCountMap

        for(Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : "+ entry.getValue());

        }


        }


    }







