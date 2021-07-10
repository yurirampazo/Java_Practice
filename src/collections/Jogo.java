package collections;

public class Jogo {
 private String name;
 private String descricao;

    public Jogo(String name, String descricao) {
        this.name = name;
        this.descricao = descricao;
    }

    public Jogo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
