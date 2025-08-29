package org.example;

public class MyBook implements PlataformaSocial {
    @Override
    public void compartilhar(Postagem postagem) {
        System.out.println("Você compartilhou essa postagem no MyBook.");
    }
}
