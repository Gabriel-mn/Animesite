package br.com.gabriel.modelos;
//SUPERCLASSE
public class Videos {
    private String nome;
    private double duracao;
    private String dataLancamento;
    private String descricao;
    private String autor;
    private String genero;
    private int avaliacao;
    private int totalAvaliacao;
    private int totalVisualizacao;
    public int totalVisualizacao() {return totalVisualizacao++;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public double getDuracao() {return duracao;}
    public void setDuracao(double duracao) {this.duracao = duracao;}
    public String getDataLancamento() {return dataLancamento;}
    public void setDataLancamento(String dataLancamento) {this.dataLancamento = dataLancamento;}
    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}
    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}
    public String getGenero() {return genero;}
    public void setGenero(String genero) {this.genero = genero;}
    public void avalia(int nota) {
        avaliacao += nota;
        totalAvaliacao++;
    }
    public int pegaMedia() {return avaliacao / totalAvaliacao;}
    public int getClassificacao() {
        if (totalVisualizacao() > 500 && this.avaliacao/totalAvaliacao>10) {
            return 10;
        } else
            return 6;
    }
}
