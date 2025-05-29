package Model;

public class Secretario {
    private String nome;
    private int id;
    private static final String ADMIN_USER = "admin";
    private static final String ADMIN_PASS = "admin";

    public Secretario(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public boolean acessarUsuario(String user, String pass) {
        return ADMIN_USER.equals(user) && ADMIN_PASS.equals(pass);
    }

    public void cadastrarUsuario(Usuario usuario) {
    	usuario.setCadastrado(true);
    }

    public void cadastrarPet(Pet pet) {
    	//pet.setCadastrado(true);
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
