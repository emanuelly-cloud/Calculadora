import java.util.*;
public class Divisao {
    public static void main (String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println( "Digite o primeiro número a ser dividido e tecle Enter");
        String respostaUsuario = inputScanner.nextLine().trim();
        int numeroUm = Integer.valueOf(respostaUsuario);
        System.out.println( "Digite o segundo número a ser dividido e tecle Enter");
        respostaUsuario = inputScanner.nextLine().trim();
        int numeroDois = Integer.valueOf(respostaUsuario);
        double resultado = (double) numeroUm / numeroDois
        System.out.println( "O resultado da divisão é:" + (numeroUm / numeroDois));
        inputScanner.close();
    }
}