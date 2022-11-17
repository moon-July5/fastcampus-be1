package me.day09.practice;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String answer = "";
//        while (true) {
//            char ch = scanner.next().charAt(0);
//            if (ch == 'q') break; // 종료구문은 항상 위에 작성하는 게 좋음
//
//            answer += ch;
//        }
//        System.out.println("answer = " + answer);

        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            char ch = scanner.next().charAt(0);
            if (ch == 'q') break;
            
            stringBuilder.append(ch);
        }
        String answer = stringBuilder.toString();
        System.out.println("answer = " + answer);

        scanner.close();
    }
}
