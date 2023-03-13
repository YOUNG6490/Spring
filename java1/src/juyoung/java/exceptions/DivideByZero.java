package juyoung.java.exceptions;

import java.util.Scanner;

public class DivideByZero { // 5/0 Runtime exception example
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("나뉨수를 입력하세요 : ");
            int dividend = scanner.nextInt();
            System.out.print("나눗수를 입력하세요 : ");
            int divisor = scanner.nextInt();

            int share = dividend / divisor;
            System.out.format("몫은 %d 입니다. \n", share);
            System.out.println("프로그램을 정상적으로 종료합니다.");
            scanner.close(); // it is imperative to wirte close
            // by "try with" , can't write finally
        }
    }
}
