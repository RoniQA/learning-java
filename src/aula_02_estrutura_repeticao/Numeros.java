package aula_02_estrutura_repeticao;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args){

        int n, s=0;
        String resp;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite um número: ");
            n = teclado.nextInt();
            s += n; // mesma coisa de s = s + n
            System.out.println("Quer continuar?[s/n");
            resp = teclado.next();
        } while (resp.equals("s"));
        System.out.println("A soma de todos os valores é " + s);
    }
}
