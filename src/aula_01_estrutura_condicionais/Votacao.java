package aula_01_estrutura_condicionais;

import java.util.Scanner;

public class Votacao {
    public static void  main (String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        int nasc = teclado.nextInt();
        System.out.println("Digite o ano atual: ");
        int ano = teclado.nextInt();

        int i = ano - nasc;
        if (i<16){
            System.out.println("Sua idade é "+ i +" anos então você não está apto para votar");
        }
        else {
            if ((i>=16 && i<18) || (i>70)){
                System.out.println("Sua idade é "+ i +" anos então seu voto é opcional!");
            }
            else {
                System.out.println("Sua idade é "+ i +" anos então seu voto é obrigatório!");
            }
        }
    }
}
