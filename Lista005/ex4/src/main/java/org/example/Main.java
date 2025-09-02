package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do usuário para a postagem
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Tipo (texto, imagem, video): ");
        String tipo = scanner.nextLine();

        Postagem postagem = new Postagem(titulo, descricao, tipo);

        // Criando instâncias das plataformas
        PlataformaSocial mybook = new MyBook();
        PlataformaSocial fotogram = new Fotogram();
        PlataformaSocial anytube = new AnyTube();

        // Testando as plataformas com a postagem
        System.out.println("\n--- Compartilhando no MyBook ---");
        try {
            mybook.compartilhar(postagem);
        } catch (UnsupportedOperationException e) {
            System.out.println("Ocorreu um erro ao compartilhar essa postagem no MyBook: " + e.getMessage());
        }

        System.out.println("\n--- Compartilhando no Fotogram ---");
        try {
            fotogram.compartilhar(postagem);
        } catch (UnsupportedOperationException e) {
            System.out.println("Ocorreu um erro ao compartilhar essa postagem no Fotogram: " + e.getMessage());
        }

        System.out.println("\n--- Compartilhando no AnyTube ---");
        try {
            anytube.compartilhar(postagem);
        } catch (UnsupportedOperationException e) {
            System.out.println("Ocorreu um erro ao compartilhar essa postagem no AnyTube: " + e.getMessage());
        }

        scanner.close();
    }
}
