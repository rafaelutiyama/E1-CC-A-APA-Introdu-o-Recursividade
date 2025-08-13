import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[] prencher(int[] v, int n){
        Random r = new Random();
        if(n >= 0){
            v[n] = r.nextInt(0,10);
            prencher(v, n-1);
        }
        return v;
    }

    public static void exibir(int[] v, int n){
        if(n >= 0){
            System.out.print(v[n] + " ");
            exibir(v, n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int v[] = new int[n];
        exibir(prencher(v, n - 1), n - 1);
    }
}