package com.tw;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        IO io = new IO();
        io.showMenu();
        Scanner scanner = new Scanner(System.in);
        while ((scanner.hasNextLine())){
            String s = scanner.nextLine();
            System.out.println(io.input(s));
            io.showMenu();
        }
    }
}
