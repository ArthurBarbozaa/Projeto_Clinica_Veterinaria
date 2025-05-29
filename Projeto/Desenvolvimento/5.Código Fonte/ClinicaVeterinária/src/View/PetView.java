package View;
public class PetView {
    public void printPetDetails(String petNome, String petRaca, int petIdade, String petSexo) {
        System.out.println("Pet: ");
        System.out.println("Nome: " + petNome);
        System.out.println("Raça: " + petRaca);
        System.out.println("Idade: " + petIdade);
        System.out.println("Sexo: " + petSexo);
    }
}