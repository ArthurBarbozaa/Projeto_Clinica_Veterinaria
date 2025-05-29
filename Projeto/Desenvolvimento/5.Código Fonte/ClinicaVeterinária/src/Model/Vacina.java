package Model;
public class Vacina {
    private String nome;
    private int funcao;

    public Vacina(String nome, int funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    // Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFuncao() {
        return funcao;
    }

    public void setFuncao(int funcao) {
        this.funcao = funcao;
    }
}