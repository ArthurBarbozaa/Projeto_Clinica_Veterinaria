package Controller;

import Model.Usuario;
import View.UsuarioView;

public class UsuarioController {
    private Usuario model;
    private UsuarioView view;

    public UsuarioController(Usuario model, UsuarioView view) {
        this.model = model;
        this.view = view;
    }

    public void setUsuarioLogin(int login) {
        model.setLogin(login);
    }

    public int getUsuarioLogin() {
        return model.getLogin();
    }

    public void setUsuarioSenha(int senha) {
        model.setSenha(senha);
    }

    public int getUsuarioSenha() {
        return model.getSenha();
    }

    public void updateView() {
        view.printUsuarioDetails(model.getLogin(), model.getSenha());
    }
}
