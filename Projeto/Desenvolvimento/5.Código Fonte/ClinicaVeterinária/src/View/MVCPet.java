package View;

import java.util.Date;
import java.util.Scanner;

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
import java.util.Scanner;

public class MVCPet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione o tipo de usuário para login:");
            System.out.println("1. Secretário");
            System.out.println("2. Veterinário");
            System.out.println("3. Dono do Pet");
            System.out.println("4. Sair");
            int userType = scanner.nextInt();
            scanner.nextLine(); 

            switch (userType) {
                case 1:
                    loginAsSecretary(scanner);
                    break;
                case 2:
                    loginAsVeterinarian(scanner);
                    break;
                case 3:
                    loginAsPetOwner(scanner);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void loginAsSecretary(Scanner scanner) {
        System.out.print("Digite o usuário do secretário: ");
        String user = scanner.nextLine();
        System.out.print("Digite a senha do secretário: ");
        String pass = scanner.nextLine();

        if ("admin".equals(user) && "admin".equals(pass)) {
            SecretarioController secretarioController = new SecretarioController(null, null);
            secretarioMenu(scanner, secretarioController);
        } else {
            System.out.println("Acesso negado!");
        }
    }

    private static void secretarioMenu(Scanner scanner, SecretarioController secretarioController) {
        while (true) {
            System.out.println("Menu do Secretário:");
            System.out.println("1. Manter Consulta (CRUD)");
            System.out.println("2. Manter Pet (CRUD)");
            System.out.println("3. Manter Usuário (CRUD)");
            System.out.println("4. Voltar");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    manageConsultations(scanner, secretarioController);
                    break;
                case 2:
                    managePets(scanner);
                    break;
                case 3:
                    manageUsers(scanner);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void manageConsultations(Scanner scanner, SecretarioController secretarioController) {
        while (true) {
            System.out.println("Menu de Consultas:");
            System.out.println("1. Agendar Consulta");
            System.out.println("2. Visualizar Consultas Agendadas");
            System.out.println("3. Cancelar Consulta");
            System.out.println("4. Remarcar Consulta");
            System.out.println("5. Voltar");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.println("Agendando Consulta...");
                    break;
                case 2:
                    System.out.println("Consultas Agendadas:");
                    break;
                case 3:
                    System.out.println("Cancelando Consulta...");
                    break;
                case 4:
                    System.out.println("Remarcando Consulta...");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void managePets(Scanner scanner) {
        while (true) {
            System.out.println("Menu de Pets:");
            System.out.println("1. Cadastrar Pet");
            System.out.println("2. Ver Pets Cadastrados");
            System.out.println("3. Atualizar Pet");
            System.out.println("4. Remover Pet");
            System.out.println("5. Voltar");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.println("Cadastrando Novo Pet...");
                    break;
                case 2:
                    System.out.println("Pets Cadastrados:");
                    break;
                case 3:
                    System.out.println("Atualizando Pet...");
                    break;
                case 4:
                    System.out.println("Removendo Pet...");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void manageUsers(Scanner scanner) {
        while (true) {
            System.out.println("Menu de Usuários:");
            System.out.println("1. Cadastrar Novo Usuário");
            System.out.println("2. Ver Usuários Cadastrados");
            System.out.println("3. Atualizar Usuário");
            System.out.println("4. Remover Usuário");
            System.out.println("5. Voltar");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.println("Cadastrando Novo Usuário...");
                    break;
                case 2:
                    System.out.println("Usuários Cadastrados:");
                    break;
                case 3:
                    System.out.println("Atualizando Usuário...");
                    break;
                case 4:
                    System.out.println("Removendo Usuário...");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void loginAsVeterinarian(Scanner scanner) {
        System.out.print("Digite o usuário do veterinário: ");
        String user = scanner.nextLine();
        System.out.print("Digite a senha do veterinário: ");
        String pass = scanner.nextLine();

        if ("user".equals(user) && "user".equals(pass)) {
            VeterinarioController veterinarioController = new VeterinarioController(null, null);
            veterinarianMenu(scanner, veterinarioController);
        } else {
            System.out.println("Acesso negado!");
        }
    }

    private static void veterinarianMenu(Scanner scanner, VeterinarioController veterinarioController) {
        while (true) {
            System.out.println("Menu do Veterinário:");
            System.out.println("1. Manter Visita (CRUD)");
            System.out.println("2. Gerenciar Vacina Aplicada");
            System.out.println("3. Voltar");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    manageVisits(scanner);
                    break;
                case 2:
                    manageVaccines(scanner);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void manageVisits(Scanner scanner) {
        while (true) {
            System.out.println("Menu de Visitas:");
            System.out.println("1. Agendar Visita");
            System.out.println("2. Ver Visitas Agendadas");
            System.out.println("3. Atualizar Visita");
            System.out.println("4. Cancelar Visita");
            System.out.println("5. Voltar");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.println("Agendando Visita...");
                    break;
                case 2:
                    System.out.println("Visitas Agendadas:");
                    break;
                case 3:
                    System.out.println("Atualizando Visita...");
                    break;
                case 4:
                    System.out.println("Cancelando Visita...");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void manageVaccines(Scanner scanner) {
        while (true) {
            System.out.println("Menu de Vacinas Aplicadas:");
            System.out.println("1. Aplicar Vacina");
            System.out.println("2. Ver Vacinas Aplicadas");
            System.out.println("3. Atualizar Informações de Vacina");
            System.out.println("4. Remover Vacina Aplicada");
            System.out.println("5. Voltar");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.println("Aplicando Vacina...");
                    break;
                case 2:
                    System.out.println("Vacinas Aplicadas:");
                    break;
                case 3:
                    System.out.println("Atualizando Informações de Vacina...");
                    break;
                case 4:
                    System.out.println("Removendo Vacina Aplicada...");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void loginAsPetOwner(Scanner scanner) {
        System.out.print("Digite o usuário do dono do pet: ");
        String user = scanner.nextLine();
        System.out.print("Digite a senha do dono do pet: ");
        String pass = scanner.nextLine();

        if ("user".equals(user) && "123456".equals(pass)) {
            DonoPetController donoPetController = new DonoPetController(null, null);
            petOwnerMenu(scanner, donoPetController);
        } else {
            System.out.println("Acesso negado!");
        }
    }

    private static void petOwnerMenu(Scanner scanner, DonoPetController donoPetController) {
        while (true) {
            System.out.println("Menu do Dono do Pet:");
            System.out.println("1. Manter Consulta");
            System.out.println("2. Voltar");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    manageOwnerConsultations(scanner, donoPetController);
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void manageOwnerConsultations(Scanner scanner, DonoPetController donoPetController) {
        while (true) {
            System.out.println("Menu de Consultas:");
            System.out.println("1. Agendar Consulta");
            System.out.println("2. Visualizar Consultas Agendadas");
            System.out.println("3. Cancelar Consulta");
            System.out.println("4. Remarcar Consulta");
            System.out.println("5. Voltar");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    System.out.println("Agendando Consulta...");
                    break;
                case 2:
                    System.out.println("Consultas Agendadas:");
                    break;
                case 3:
                    System.out.println("Cancelando Consulta...");
                    break;
                case 4:
                    System.out.println("Remarcando Consulta...");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
