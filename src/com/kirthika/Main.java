package com.kirthika;

import java.util.*;

public class Main {

    public static int numberNeeded(String first, String second) {
        int[] letterCount = new int[26];
        for(char c : first.toCharArray()){
            letterCount[c-'a']++;
        }
        for(char c : second.toCharArray()){
            letterCount[c-'a']--;
        }
        int numberOfDeletions = 0;
        for(int i : letterCount){
            numberOfDeletions += Math.abs(i);
        }
        return numberOfDeletions;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
