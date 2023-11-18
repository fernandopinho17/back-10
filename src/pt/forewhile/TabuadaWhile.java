package pt.forewhile;

import java.util.Scanner;

public class TabuadaWhile {
    public static void main (String args []){
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja gerar a tabuada de algum número");
        String resposta = s.next();

        While(resposta.equalsIgnoreCase("Sim")) ;{
            System.out.println("Digite un número para gerar a tabuada:");
            int num = s.nextInt();
            for (int i = 0; i<=10; i++) {
                System.out.println(num + " x " + i + " = " + num*i);
            }
            System.out.println("Deseja gerar novamente a tabuada de algum número?");
            resposta = s.next();
        }
        System.out.println("Obrigado.");
    }

    private static void While(boolean sim) {
    }
}
