package View;
import java.util.Date;

import Model.EstadoConsulta;

public class ConsultaView {
    public void printConsultaDetails(int data, Date horario, EstadoConsulta estadoConsulta) {
        System.out.println("Consulta: ");
        System.out.println("Data: " + data);
        System.out.println("Horário: " + horario);
        System.out.println("Estado: " + estadoConsulta);
    }
}