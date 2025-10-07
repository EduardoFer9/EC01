package pe.company.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.Collection;
import pe.company.dao.ventadao;
import pe.company.vo.ventavo;

@WebService(serviceName = "VentaWs")
public class ventaws {
    private ventadao ventadao = new ventadao();

    @WebMethod(operationName = "listarVentas")
    public Collection<ventavo> listarVentas() {
        return ventadao.findAll();
    }
}
