package Model;
public class DonoPet {
    private String nome;
    private int documento;
    private int telefone;
    private int id;
    private static final String ADMIN_USER = "pet";
    private static final String ADMIN_PASS = "pet";

    public DonoPet(String nome, int documento, int telefone, int id) {
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
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

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}