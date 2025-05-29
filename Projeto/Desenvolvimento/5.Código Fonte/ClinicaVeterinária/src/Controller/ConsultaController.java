package Controller;
import java.util.Date;
import Model.Consulta;
import Model.EstadoConsulta;
import View.ConsultaView;

public class ConsultaController {
    private Consulta model;
    private ConsultaView view;

    public ConsultaController(Consulta model, ConsultaView view) {
        this.model = model;
        this.view = view;
    }

    public void setConsultaData(int data) {
        model.setData(data);
    }

    public int getConsultaData() {
        return model.getData();
    }

    public void setConsultaHorario(Date horario) {
        model.setHorario(horario);
    }

    public Date getConsultaHorario() {
        return model.getHorario();
    }

    public void setConsultaEstado(EstadoConsulta estado) {
        model.setEstadoConsulta(estado);
    }

    public EstadoConsulta getConsultaEstado() {
        return model.getEstadoConsulta();
    }

    public void updateView() {
        view.printConsultaDetails(model.getData(), model.getHorario(), model.getEstadoConsulta());
    }
}
