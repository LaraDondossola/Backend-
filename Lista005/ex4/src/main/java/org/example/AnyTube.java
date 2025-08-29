package org.example;

public class AnyTube implements PlataformaSocial {
    @Override
    public void compartilhar(Postagem postagem) throws UnsupportedOperationException {
        if (!postagem.getTipo().equalsIgnoreCase("video")) {
            throw new UnsupportedOperationException("O AnyTube só suporta compartilhamento de vídeos.");
        }
        System.out.println("Você compartilhou essa postagem no AnyTube.");
    }
}
