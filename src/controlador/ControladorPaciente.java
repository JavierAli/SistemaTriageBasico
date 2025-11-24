package controlador;

import dao.PacienteDAO;
import modelo.Paciente;
import util.Validador;
import java.util.List;

// Controlador con la logica del sistema
public class ControladorPaciente {
    private PacienteDAO pacienteDAO;

    public ControladorPaciente() {
        pacienteDAO = new PacienteDAO();
        pacienteDAO.crearTabla();
    }

    // Guardar paciente nuevo
    public String guardarPaciente(String nombre, String edad, String motivo,
                                  String temperatura, String frecuencia, String dolor) {
        // validar
        String error = Validador.validarPaciente(nombre, edad, motivo, temperatura, frecuencia, dolor);
        if (error != null) {
            return error;
        }

        // crear objeto
        Paciente paciente = new Paciente(
            nombre.trim(),
            Integer.parseInt(edad),
            motivo.trim(),
            Double.parseDouble(temperatura),
            Integer.parseInt(frecuencia),
            Integer.parseInt(dolor)
        );

        // guardar
        if (pacienteDAO.insertar(paciente)) {
            return "Paciente guardado exitosamente";
        } else {
            return "Error al guardar el paciente en la base de datos";
        }
    }

    // Actualizar paciente
    public String actualizarPaciente(int id, String nombre, String edad, String motivo,
                                     String temperatura, String frecuencia, String dolor) {
        // validar
        String error = Validador.validarPaciente(nombre, edad, motivo, temperatura, frecuencia, dolor);
        if (error != null) {
            return error;
        }

        // crear objeto con nuevos datos
        Paciente paciente = new Paciente(
            nombre.trim(),
            Integer.parseInt(edad),
            motivo.trim(),
            Double.parseDouble(temperatura),
            Integer.parseInt(frecuencia),
            Integer.parseInt(dolor)
        );
        paciente.setId(id);

        // actualizar
        if (pacienteDAO.actualizar(paciente)) {
            return "Paciente actualizado exitosamente";
        } else {
            return "Error al actualizar el paciente en la base de datos";
        }
    }

    // Eliminar
    public boolean eliminarPaciente(int id) {
        return pacienteDAO.eliminar(id);
    }

    // Listar todos
    public List<Paciente> listarPacientes() {
        return pacienteDAO.listarTodos();
    }

    // Buscar
    public List<Paciente> buscarPacientes(String nombre) {
        return pacienteDAO.buscarPorNombre(nombre);
    }
}
