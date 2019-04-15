package com.tw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IO io = new IO();
        io.showMenu();
        Scanner scanner = new Scanner(System.in);
        while ((scanner.hasNextLine())){
            String s = scanner.nextLine();
            System.out.println(io.input(s));
        }
    }
}
