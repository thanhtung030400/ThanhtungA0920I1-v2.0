package b11.DSA_stack_queue.bai_tap.switch_element_using_stack;

import java.util.Stack;

public class SwitchElement {
    public static void main(String[] args) {
    }

    public static void stackOfInteger(){
        int[] integerNumber = {1, 2, 3, 4};
        Stack<Integer> stack = new Stack<>();
        stack.push(integerNumber[0]);
        stack.push(integerNumber[1]);
        stack.push(integerNumber[2]);
        stack.push(integerNumber[3]);

        int i  = 0;
        for (i = 0; i < integerNumber.length; i ++ ){
            integerNumber[i] = stack.pop();
        }

        for ( int x : integerNumber){
            System.out.println(x);
        }
    }



//    Stack<String> stringStack = new Stack<>();
//    String string = "Hello Java EE";
//    String stringArray[] = string.split("\\s");
//
//        for(int i = 0; i < stringArray.length; i++){
//        stringStack.push(stringArray[i]);
//    }
//        for(int i = 0; i < stringArray.length; i++){
//        stringArray[i] = stringStack.pop();
//    }
//        for (String x: stringArray) {
//        System.out.println(x);
//    }

}

