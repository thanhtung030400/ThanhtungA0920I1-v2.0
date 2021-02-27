package b11.DSA_stack_queue.bai_tap.PalindromeString;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.print("press String:");
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        Stack stack = new Stack();
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
    }
        String reverseString = "";
        while (!stack.isEmpty()) {
            reverseString = reverseString+stack.pop();
        }
        if (inputString.equals(reverseString))
            System.out.println("palindrome string.");
        else
            System.out.println("not palindrome string");
    }
}
