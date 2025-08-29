import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cinema cinema = new Cinema();

        String continuar = "sim";
        while (continuar.equalsIgnoreCase("sim")) {
            System.out.println("--- Venda de Ingresso ---");
            System.out.print("Qual o seu nome? ");
            String nomeCliente = sc.nextLine();
            System.out.print("Qual a sua idade? ");
            int idadeCliente = sc.nextInt();
            sc.nextLine();

            Cliente cliente = new Cliente(nomeCliente, idadeCliente);

            System.out.print("Que filme você deseja assistir? ");
            String filmeDesejado = sc.nextLine();
            System.out.print("Qual assento você deseja? (ex: A1, B3): ");
            String assentoDesejado = sc.nextLine();

            try {
                cinema.venderIngresso(cliente, filmeDesejado, assentoDesejado);
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }

            System.out.print("\nDeseja comprar outro ingresso? (sim/nao): ");
            continuar = sc.nextLine();
            System.out.println();
        }

        sc.close();
        System.out.println("Programa encerrado.");
    }
}