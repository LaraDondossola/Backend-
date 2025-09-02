package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio08();
    }

    static void exercicio01() {
        String mensagem = "Bem-vindo ao Sistema de Geração de Jogadores!";
        System.out.println(mensagem);
    }

    static void exercicio02() {
        String nome = "Mariana Silva";
        String cargo = "Analista de Sistemas";
        double salario = 4500.00;

        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + salario);
    }

    static void exercicio03() {
        String produto = "Teclado";
        Integer codigo = 12345;
        double preco = 99.99;
        Boolean promocao = true;

        System.out.println("Produto: " + produto);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Promoção: " + promocao);
    }

    static void exercicio04() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor total da compra: ");
        double valor = leitor.nextDouble();

        if (valor>100) {
            double valor_final = valor * 0.9;
            System.out.println("O valor final com desconto é: R$" + valor_final);
        }
        else {
            System.out.println("O valor final sem desconto é: R$" + valor);
        }
    }

    static void exercicio05() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        double idade = leitor.nextDouble();

        if (idade<12) {
            System.out.println("Categoria Infantil");
        }
        else if (idade>= 12 && idade <= 17) {
            System.out.println("Categoria Adolescente");
        }
        else {
            System.out.println("Categoria Adulto");
        }
    }

    static void exercicio06() {
        int[] notas = {7,8,6,9,10};
        int soma  = 0;

        for (int i : notas) {
            soma += i;
        }

        double media = soma/notas.length;
        System.out.println("As notas: " + Arrays.toString(notas));
        System.out.println("A média das notas é: " + media);
    }

    static void exercicio07() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu peso: ");
        double peso = leitor.nextDouble();
        System.out.println("Digite a sua altura: ");
        double altura = leitor.nextDouble();

        double imc = peso/(altura*altura);
        System.out.println("O seu IMC é: " + imc);
    }

    static void exercicio08() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu nome completo: ");
        String nome = leitor.nextLine();

        String semEspacos = nome.replace(" ", "");
        int numCaracteres = semEspacos.length();
        String maiusculas = nome.toUpperCase();
        boolean verificar = nome.contains("Silva");

        System.out.println("Número de caracteres: " + numCaracteres);
        System.out.println("Maiúsculas: " + maiusculas);
        System.out.println("Contém \"Silva\": " + verificar);
    }


}