package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] lista = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9"};
        String senha = "";
        Senha novaSenha = new Senha(8);

        for (int i = 0; i < novaSenha.tamanho; i++) {
            Random random = new Random();
            senha += lista[random.nextInt(lista.length)];
        }

        System.out.println("Sua senha é: " + senha);
    }
}