
import java.util.Date;

import Controller.ConsultaController;
import Controller.DonoPetController;
import Controller.PetController;
import Controller.SecretarioController;
import Controller.UsuarioController;
import Controller.VeterinarioController;
import Model.Consulta;
import Model.DonoPet;
import Model.EstadoConsulta;
import Model.Pet;
import Model.Secretario;
import Model.Usuario;
import Model.Vacina;
import Model.Veterinario;

public class MVCPet {
    public static void main(String[] args) {
        // Pet
        Pet pet = new Pet("Athena", "Yorkshire", 8, "Femea");
        PetView petView = new PetView();
        PetController petController = new PetController(pet, petView);
        petController.updateView();


        //DonoPet
        DonoPet donoPet = new DonoPet("João", 123456789, 987654321, 1);
        DonoPetView donoPetView = new DonoPetView();
        DonoPetController donoPetController = new DonoPetController(donoPet, donoPetView);
        donoPetController.updateView();

        //Secretario
        Secretario secretario = new Secretario("Ana", 2);
        SecretarioView secretarioView = new SecretarioView();
        SecretarioController secretarioController = new SecretarioController(secretario, secretarioView);
        secretarioController.updateView();

        //Veterinario
        Veterinario veterinario = new Veterinario("Dr. Pedro", 3);
        VeterinarioView veterinarioView = new VeterinarioView();
        VeterinarioController veterinarioController = new VeterinarioController(veterinario, veterinarioView);
        veterinarioController.updateView();

        // Vacina
        Vacina vacina = new Vacina("Antirrábica", 1);
        VacinaView vacinaView = new VacinaView();
        vacinaView.printVacinaDetails(vacina.getNome(), vacina.getFuncao());

        // Consulta
        Consulta consulta = new Consulta(20240620, new Date(), EstadoConsulta.AGENDADO);
        ConsultaView consultaView = new ConsultaView();
        ConsultaController consultaController = new ConsultaController(consulta, consultaView);
        consultaController.updateView();

        // Usuario
        Usuario usuario = new Usuario(1001, 123456);
        UsuarioView usuarioView = new UsuarioView();
        UsuarioController usuarioController = new UsuarioController(usuario, usuarioView);
        usuarioController.updateView();
    }
}