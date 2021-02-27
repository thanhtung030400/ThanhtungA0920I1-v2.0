package b11.DSA_stack_queue.bai_tap.demical_to_binary_example;

import java.util.Stack;

public class DemicalToBinary {
    public void convertBinary(int num){
        Stack<Integer> stack = new Stack<Integer>();
        while(num != 0){
            int d = num%2;
            stack.push(d);
            num/=2;
        }
        while(!(stack.isEmpty())){
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        int demicalNumber= 123456;
        System.out.println(demicalNumber);
        new DemicalToBinary().convertBinary(demicalNumber);
    }
}