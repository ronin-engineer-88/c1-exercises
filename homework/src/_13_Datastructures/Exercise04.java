package _13_Datastructures;

import java.util.Scanner;
import java.util.Stack;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        System.out.print("Nhập chuỗi cần đảo ngược: ");
        String input = scanner.nextLine();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("Chuỗi sau khi đảo ngược: " + reversed.toString());

        scanner.close();
    }
}
