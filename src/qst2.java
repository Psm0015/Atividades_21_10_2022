import java.util.Scanner;
public class qst2 {
    public static void main(String[] args) {
        //3. Escreva um programa que vai ler 2 números, o sistema vai escrever na tela todos os número entre os 2 digitados.
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        int n1 = scan.nextInt();

        System.out.print("Digite o segundo número:");
        int n2 = scan.nextInt();

        scan.close();
        if(n1==n2){
            System.out.println("Os números digitados são iguais.");
        }
        while(n1<=n2-1){
            System.out.println(n1);
            n1++;
        }
        while(n2<=n1){
            System.out.println(n2);
            n2++;
        }
        scan.close();
    }
}
