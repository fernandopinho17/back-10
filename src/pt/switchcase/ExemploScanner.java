package pt.switchcase;

import java.util.Scanner;

public class ExemploScanner {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = s.nextByte();
        System.out.println("Vc tem" + idade + " anos ");
    }
}
