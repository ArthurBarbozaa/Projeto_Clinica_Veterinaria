package Controller;

import Model.Vacina;
import View.VacinaView;

public class VacinaController {
    private Vacina model;
    private VacinaView view;

    public VacinaController(Vacina model, VacinaView view) {
        this.model = model;
        this.view = view;
    }

    public void setVacinaNome(String nome) {
        model.setNome(nome);
    }

    public String getVacinaNome() {
        return model.getNome();
    }

    public void updateView() {
        view.printVacinaDetails(model.getNome(), model.getFuncao());
    }
}