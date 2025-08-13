import java.util.Scanner;

public class Main {
    public static void contarRegressivamenteRecursivo(int n){
        if(n < 0) {
            return;
        }
        System.out.println(n);
        contarRegressivamenteRecursivo(n-1);
    }

    public static int converterParaNumeroNatural(int n, Scanner scanner) {
        do {
            System.out.println("Informe um número natural.");
            n = scanner.nextInt();
        } while(n < 0);
        return n;
    }

    public static int converterParaNumeroNaturalRecursivo(int n, Scanner scanner) {
        if(n >= 0) {
            return n;
        }
        System.out.println("Informe um número natural.");
        n = scanner.nextInt();
        return converterParaNumeroNaturalRecursivo(n, scanner);
    }

    public static int lerNumero(Scanner scanner) {
        System.out.println("Informe um número:");
        return scanner.nextInt();
    }


    public static void main(String[] args) {
        int numeroNatural;
        Scanner scanner = new Scanner(System.in);
        numeroNatural = lerNumero(scanner);
        if(numeroNatural < 0) {
            numeroNatural = converterParaNumeroNatural(numeroNatural, scanner);
        }
        contarRegressivamenteRecursivo(numeroNatural);
        scanner.close();
    }
}