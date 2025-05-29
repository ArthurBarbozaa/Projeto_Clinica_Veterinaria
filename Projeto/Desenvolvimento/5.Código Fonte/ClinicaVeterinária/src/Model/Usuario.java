package Model;

public class Usuario {
    private int login;
    private int senha;
    private boolean cadastrado = false;

    public Usuario(int login, int senha) {
        this.login = login;
        this.senha = senha;
    }

    public void acessarConsulta() {
    }

    public boolean isCadastrado() {
        return cadastrado;
    }

    public void setCadastrado(boolean cadastrado) {
        this.cadastrado = cadastrado;
    }

    // Get e Set
    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}