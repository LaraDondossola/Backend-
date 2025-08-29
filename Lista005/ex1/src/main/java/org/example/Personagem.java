package org.example;

public class Personagem {
    private String nome;
    private Integer vida;
    private Integer ataque;

    public Personagem (String nome, Integer vida, Integer ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getAtaque() {
        return ataque;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public void receberDano(Integer dano) {
        this.vida -= dano;
        if (this.vida <= 0) {
            this.vida = 0;
            System.out.println(this.nome + " foi derrotado!");
        }
    }

    public void atacar(Personagem alvo) {
        if (alvo.getVida() <= 0) {
            System.out.println("O ataque falhou, " + alvo.getNome() + " já foi derrotado.");
        } else {
            alvo.receberDano(this.ataque);
            System.out.println(this.nome + " causou " + this.ataque + " de dano em " + alvo.getNome());
        }
    }
}