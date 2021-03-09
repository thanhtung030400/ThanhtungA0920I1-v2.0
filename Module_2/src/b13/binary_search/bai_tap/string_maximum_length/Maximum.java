package b13.binary_search.bai_tap.string_maximum_length;

import java.util.LinkedList;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter String");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i<string.length(); i++){
            LinkedList<Character> list= new LinkedList<>();
            list.add(string.charAt(i));
            for (int j=i+1; j < string.length(); j++){
                if (string.charAt(j) > list.getLast()){
                    list.add(string.charAt(j));
                }
            }
            if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character character:max){
            System.out.print(character);
        }
        System.out.println();
    }
}
