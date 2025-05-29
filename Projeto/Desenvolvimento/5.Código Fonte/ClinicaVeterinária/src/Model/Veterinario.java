package Model;
public class Veterinario {
    private String nome;
    private int id;
    private static final String ADMIN_USER = "user";
    private static final String ADMIN_PASS = "user";
    public Veterinario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public boolean acessarUsuario(String user, String pass) {
        return ADMIN_USER.equals(user) && ADMIN_PASS.equals(pass);
    }


    // Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}