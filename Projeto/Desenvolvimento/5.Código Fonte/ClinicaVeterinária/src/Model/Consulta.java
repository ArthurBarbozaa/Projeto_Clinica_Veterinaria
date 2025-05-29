package Model;

import java.util.Date;

public class Consulta {
    private int data;
    private Date horario;
    private EstadoConsulta estadoConsulta;

    public Consulta(int data, Date horario, EstadoConsulta estadoConsulta) {
        this.data = data;
        this.horario = horario;
        this.estadoConsulta = estadoConsulta;
    }

    public void agendarConsulta() {
        estadoConsulta = EstadoConsulta.AGENDADO;
    }

    public void reagendarConsulta(int novaData, Date novoHorario) {
        this.data = novaData;
        this.horario = novoHorario;
        this.estadoConsulta = EstadoConsulta.AGENDADO;
    }

    public void cancelarConsulta() {
        this.estadoConsulta = EstadoConsulta.CANCELADO;
    }

    // Get e Set
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public EstadoConsulta getEstadoConsulta() {
        return estadoConsulta;
    }

    public void setEstadoConsulta(EstadoConsulta estadoConsulta) {
        this.estadoConsulta = estadoConsulta;
    }
}
