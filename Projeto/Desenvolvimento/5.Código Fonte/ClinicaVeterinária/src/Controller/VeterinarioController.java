package Controller;

import Model.Veterinario;
import View.VeterinarioView;

public class VeterinarioController {
    private Veterinario model;
    private VeterinarioView view;

    public VeterinarioController(Veterinario model, VeterinarioView view) {
        this.model = model;
        this.view = view;
    }

    public void setVeterinarioNome(String nome) {
        model.setNome(nome);
    }

    public String getVeterinarioNome() {
        return model.getNome();
    }

    public void updateView() {
        view.printVeterinarioDetails(model.getNome(), model.getId());
    }
}