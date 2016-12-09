package tecnico.atividade.presencial;

public class Smartphone {
    private String nome;
    private Contatos contatos;
    private Jogos jogos;
    
    public Smartphone() {
        this.nome = "";
        this.contatos = new Contatos();
        this.jogos = new Jogos();        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contatos getContatos() {
        return contatos;
    }

    public void setContatos(Contatos contatos) {
        this.contatos = contatos;
    }

    public Jogos getJogos() {
        return jogos;
    }

    public void setJogos(Jogos jogos) {
        this.jogos = jogos;
    }
    
    public String toString() {
        return "O celular de " + this.nome + " possui " + contatos.getQuantidadeContatos() + " contatos em sua lista, com " + contatos.getContatosIndispensaveis() +
                " contatos indispensáveis, e o principal é o(a) " + contatos.getContatoPrincipal() + " dele(a). Há também " + jogos.getQuantidadeJogos() + " jogos, e o melhor é o " 
                + jogos.getMelhorJogo() + " com gênero " + jogos.getGeneroMelhorJogo() + ".";
    }

}
