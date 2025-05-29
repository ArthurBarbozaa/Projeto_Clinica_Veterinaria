package Controller;

import Model.Pet;
import View.PetView;

public class PetController {
    private Pet model;
    private PetView view;

    public PetController(Pet model, PetView view) {
        this.model = model;
        this.view = view;
    }

    public void setPetNome(String nome) {
        model.setNome(nome);
    }

    public String getPetNome() {
        return model.getNome();
    }

    public void updateView() {
        view.printPetDetails(model.getNome(), model.getRaca(), model.getIdade(), model.getSexo());
    }
}