public class Ingresso {
    public Cliente cliente;
    public Filme filme;
    public String assento;

    public Ingresso(Cliente cliente, Filme filme, String assento) {
        this.cliente = cliente;
        this.filme = filme;
        this.assento = assento;
    }
}