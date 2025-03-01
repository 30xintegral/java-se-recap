package Algorithms;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    }

    static boolean searchInString(String str, char c){
        if (str.isEmpty()){
            System.out.println("string is empty");
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==c){
                System.out.println("position i="+i);
                return true;
            }
        }
        return false;
    }

}
