import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
/*
1. Escreva um programa que vai ler um número, o sistema vai escrever na tela a tabuada de 1 até 10 do número digitado.

2. Escreva um programa que vai ler uma mensagem e um número, o sistema vai repetir a mensagem digitada x vezes o número digitado.

3. Escreva um programa que vai ler 2 números, o sistema vai escrever na tela todos os número entre os 2 digitados.

4. Escreva um programa que vai ler uma palavra, se a palavra for diferente de "Java-2022" o retorno vai ser "Palavra Errada" se igual "Palavra Ok" a pessoa pode faze no máximo 5 tentativas de acertar a palavra.

5. Escreva um programa que vai ler a idade de 5 pessoas, o sistema vai mostrar quantas são maior ou iguais a 18 e quantas são de menor.

6. Escreva um programa que vai ler 5 números o sistema vai mostrar o maior o menor a soma e a média dos números digitados.
*/
        String esc = " ";
        Scanner scan = new Scanner(System.in);
        while (!esc.equals("x")){
            System.out.println("-=-=-=-=-Menu-=-=-=-=-");
            System.out.println("a) Questão 00");
            System.out.println("b) Questão 01");
            System.out.println("c) Questão 02");
            System.out.println("d) Questão 03");
            System.out.println("e) Questão 04");
            System.out.println("f) Questão 05");
            System.out.println("x) Para encerrar");

            esc = scan.next();


            switch (esc) {
                case "a":
                    System.out.println("-- Questao00 --");
                    qst0.main(args);
                    esc = " ";
                    break;
                case "b":
                    System.out.println("-- Questao01 --");
                    qst1.main(args);
                    esc = " ";
                    break;
                case "c":
                    System.out.println("-- Questao02 --");
                    qst2.main(args);
                    esc = " ";
                    break;
                case "d":
                    System.out.println("-- Questao03 --");
                    qst3.main(args);
                    esc = " ";
                    break;
                case "e":
                    System.out.println("-- Questao04 --");
                    qst4.main(args);
                    esc = " ";
                    break;
                case "f":
                    System.out.println("-- Questao05 --");
                    qst5.main(args);
                    esc = " ";
                    break;
                case "x":
                    System.out.println("-- Saindo... --");
                    break;
                default:
                    System.out.println("Escolha outra opção");
                    break;
            }
        }
        scan.close();
    }
}
