package Controller;

import Model.Secretario;
import Model.Usuario;
import View.SecretarioView;

public class SecretarioController {
    private Secretario model;
    private SecretarioView view;

    public SecretarioController(Secretario model, SecretarioView view) {
        this.model = model;
        this.view = view;
    }

    public boolean login(String user, String pass) {
        return model.acessarUsuario(user, pass);
    }

    public void cadastrarUsuario(Usuario usuario) {
    	   model.cadastrarUsuario(usuario);
    		usuario.setCadastrado(true);
    }

    public void setSecretarioNome(String nome) {
        model.setNome(nome);
    }

    public String getSecretarioNome() {
        return model.getNome();
    }

    public void setSecretarioId(int id) {
        model.setId(id);
    }

    public int getSecretarioId() {
        return model.getId();
    }

    public void updateView() {
        view.printSecretarioDetails(model.getNome(), model.getId());
    }
}
