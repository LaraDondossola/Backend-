import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Cinema {
    public List<Filme> filmesDisponiveis;
    public List<Ingresso> ingressosVendidos;
    public Map<String, Filme> mapaFilmes;

    public Cinema() {
        filmesDisponiveis = new ArrayList<>();
        ingressosVendidos = new ArrayList<>();
        mapaFilmes = new HashMap<>();

        Filme filme1 = new Filme("Homen Aranha", 25.00, 14);
        Filme filme2 = new Filme("O Poderoso Chefão", 30.00, 18);
        Filme filme3 = new Filme("A Bela e a Fera", 20.00, 0);
        Filme filme4 = new Filme("Joker", 35.00, 16);
        Filme filme5 = new Filme("Toy Story", 20.00, 0);

        filmesDisponiveis.add(filme1);
        filmesDisponiveis.add(filme2);
        filmesDisponiveis.add(filme3);
        filmesDisponiveis.add(filme4);
        filmesDisponiveis.add(filme5);

        for (Filme f : filmesDisponiveis) {
            mapaFilmes.put(f.nome, f);
        }
    }

    public void venderIngresso(Cliente cliente, String nomeFilme, String assento) throws Exception {
        Filme filmeEscolhido = mapaFilmes.get(nomeFilme);

        if (filmeEscolhido == null) {
            throw new Exception("O filme '" + nomeFilme + "' não está em cartaz.");
        }

        if (cliente.idade < filmeEscolhido.idadeMinima) {
            throw new Exception("O ingresso não pode ser vendido pois sua idade não permite! Idade mínima: " + filmeEscolhido.idadeMinima);
        }

        for (Ingresso i : ingressosVendidos) {
            if (i.assento.equalsIgnoreCase(assento) && i.filme.nome.equals(nomeFilme)) {
                throw new Exception("O ingresso não pode ser vendido pois o assento '" + assento + "' não está mais disponível!");
            }
        }

        Ingresso novoIngresso = new Ingresso(cliente, filmeEscolhido, assento);
        ingressosVendidos.add(novoIngresso);
        System.out.println("Ingresso vendido com sucesso! " + filmeEscolhido.nome + " - " + assento + " - " + cliente.nome);
    }
}