package org.example;

public class Fotogram implements PlataformaSocial {
    @Override
    public void compartilhar(Postagem postagem) throws UnsupportedOperationException {
        if (!postagem.getTipo().equalsIgnoreCase("imagem")) {
            throw new UnsupportedOperationException("O Fotogram só suporta compartilhamento de imagens.");
        }
        System.out.println("Você compartilhou essa postagem no Fotogram.");
    }
}
