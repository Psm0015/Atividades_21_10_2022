import java.util.Scanner;
public class qst0 {
    //1. Escreva um programa que vai ler um número, o sistema vai escrever na tela a tabuada de 1 até 10 do número digitado.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um Número: ");
        int n = scan.nextInt();
        System.out.println("Tábuada de "+n+":");

        for(int i=0;i<=10;i++){
            System.out.println(n+" x "+i+" = "+ n*i);
        }
    }
}
