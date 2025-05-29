package View;
public class DonoPetView {
    public void printDonoPetDetails(String donoPetNome, int documento, int telefone, int id) {
        System.out.println("Dono do Pet: ");
        System.out.println("Nome: " + donoPetNome);
        System.out.println("Documento: " + documento);
        System.out.println("Telefone: " + telefone);
        System.out.println("ID: " + id);
    }
}