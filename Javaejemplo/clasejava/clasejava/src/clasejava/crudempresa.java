/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasejava;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erach
 */
public class crudempresa {
    
    private final List<empresa> empresas = new ArrayList<>();
    private int proximoId = 1; // Para asignar identificadores únicos a las empresas

    // Operación de Crear (Create)
    public void crearEmpresa(empresa nuevaEmpresa) {
        nuevaEmpresa.setId(proximoId); // Asigna un nuevo identificador único
        empresas.add(nuevaEmpresa);
        proximoId++; // Incrementa el contador de identificadores
    }

    // Operación de Leer (Read) por ID
    public empresa obtenerEmpresaPorId(int id) {
        for (empresa e : empresas) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null; // Retorna null si no se encuentra la empresa
    }

    // Operación de Actualizar (Update) por ID
    public void actualizarEmpresa(int id, empresa nuevaEmpresa) {
        for (empresa e : empresas) {
            if (e.getId() == id) {
                e.setNombre(nuevaEmpresa.getNombre());
                e.setDireccion(nuevaEmpresa.getDireccion());
                e.setIdentificacionFiscal(nuevaEmpresa.getIdentificacionFiscal());
                e.setSectorActividad(nuevaEmpresa.getSectorActividad());
                e.setEmpleados(nuevaEmpresa.getEmpleados());
                e.setIngresosAnuales(nuevaEmpresa.getIngresosAnuales());
                e.setSitioWeb(nuevaEmpresa.getSitioWeb());
                e.setContactoPrincipal(nuevaEmpresa.getContactoPrincipal());
                e.setNumeroTelefono(nuevaEmpresa.getNumeroTelefono());
            }
        }
    }

    // Operación de Borrar (Delete) por ID
    public void eliminarEmpresa(int id) {
        empresas.removeIf(e -> e.getId() == id);
    }

    // Operación de Listar (List)
    public List<empresa> listarEmpresas() {
        return empresas;
    }
}
