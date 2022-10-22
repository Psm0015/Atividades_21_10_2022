import java.util.Scanner;
public class qst3 {
    //4. Escreva um programa que vai ler uma palavra, se a palavra for diferente de "Java-2022" o retorno vai ser "Palavra Errada" se igual "Palavra Ok" a pessoa pode faze no máximo 5 tentativas de acertar a palavra.
    //ESSA EU NÃO CONSEGUI
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int c=1;c<=5;c++){
            System.out.println(c+"º Tentativa");

            System.out.print("Digite a palavra secreta: ");
            String plvr = scan.nextLine();

            if(plvr.contentEquals("Java-2022")){
                System.out.println("Parabéns! Você acertou a palavra sercreta!");
                break;
            } else if(c!=5){
                System.out.println("Tente novamente!");
            } else{
                System.out.println("Não foi dessa vez!");
            }
        }
        scan.close();
    }
}
