package b13.binary_search.bai_tap.string_maximum_length2;

import java.util.LinkedList;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        System.out.println("enter a string");
        String string = scanner.nextLine();

        for(int i = 0; i < string.length(); i ++){
            if (list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))){
                list.clear();
            }

            list.add(string.charAt(i));

            if (list.size() > max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for (Character character : max){
            System.out.println(character);
        }
        System.out.println();
    }
}
