import java.util.Scanner;
public class qst5 {
    public static void main(String[] args) {
        //6. Escreva um programa que vai ler 5 números o sistema vai mostrar o maior o menor a soma e a média dos números digitados.

        Scanner scan = new Scanner(System.in);

        int maior = 0;
        int menor = 0;
        float soma = 0;

        for(int i = 1; i<=5;i++){
            System.out.println(String.format("Digite o %sº número: ", (i)));
            int num = scan.nextInt();
            if(i==1){
                maior=num;
                menor=num;
            }else if(num>maior){
                maior=num;
            }else if(num<menor){
                menor=num;
            }
            soma += num;

        }
        float media = soma/5;
        System.out.println(String.format("O maior número digitado foi: %s\nO menor número digitado foi: %s",maior,menor));
        System.out.println(String.format("A soma dos número digitados é: %s\nA média dos números digitados é: %s", soma,media));
        scan.close();
    }
}
