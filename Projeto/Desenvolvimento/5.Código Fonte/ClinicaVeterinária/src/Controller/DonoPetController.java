package Controller;

import Model.DonoPet;
import View.DonoPetView;

public class DonoPetController {
    private DonoPet model;
    private DonoPetView view;

    public DonoPetController(DonoPet model, DonoPetView view) {
        this.model = model;
        this.view = view;
    }

    public void setDonoPetNome(String nome) {
        model.setNome(nome);
    }

    public String getDonoPetNome() {
        return model.getNome();
    }

    public void updateView() {
        view.printDonoPetDetails(model.getNome(), model.getDocumento(), model.getTelefone(), model.getId());
    }
}