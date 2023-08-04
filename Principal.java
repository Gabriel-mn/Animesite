import br.com.gabriel.modelos.Anime;

public class Principal {
    public static void main(String[] args) {
        Anime sao = new Anime();
        sao.setNome("Sword Art Online");
        sao.setAutor("Reki Kawahara");
        sao.setDescricao("Um herói tentar salvar a vida de pessoas que foram presas em um jogo");
        sao.setDataLancamento("2012");
        sao.setGenero("Shounen,ação,rpg,fantasia");
        sao.setDuracao(23.40);
        sao.setTotalEpisodios(96);
        sao.setTotalTemporadas(4);
        sao.avalia(8);
        sao.avalia(10);
        sao.avalia(9);
        sao.pegaMedia();
        for (int i = 0; i < 1000; i++) {
            sao.totalVisualizacao();
        }
        System.out.println("Classificacao " +sao.getClassificacao());
        System.out.println("Media avaliacao " +sao.pegaMedia());
        System.out.println("!!!!!!!");
        System.out.println("Temporada " +sao.getTotalTemporadas());
        System.out.println("Episodios: " +sao.getTotalEpisodios());
        System.out.println("Duracao episodio " +sao.getDuracao());
    }
}
