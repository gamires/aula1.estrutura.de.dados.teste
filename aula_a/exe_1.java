import java.util.Scanner;

public class exe_1{
    public static void main(String[] arg){
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o primeiro numero: ");
    int valor1 = entrada.nextInt();
    System.out.print("Digite o primeiro segundo: ");
    int valor2 = entrada.nextInt();

    int valorJ = valor1;
    valor1 = valor2;
    valor2 = valorJ;

    System.out.println("valor 1 agora é: "+ valor1);
    System.out.println("valor 2 agora é: "+ valor2);
    entrada.close();
    }
}






/*Escreva um código Java que leia dois números inteiros informados pelo usuário.
Cada número deve ser salvo em variáveis distintas, por exemplo, valor1 e valor2.
Após ler os dois números, o código deve trocar o conteúdo das variáveis.*/