package modelo;

// Clase para guardar los datos del paciente
public class Paciente {
    private int id;
    private String nombre;
    private int edad;
    private String motivo;
    private double temperatura;
    private int frecuenciaCardiaca;
    private int nivelDolor;
    private String clasificacion;

    public Paciente() {
    }

    public Paciente(String nombre, int edad, String motivo, double temperatura, 
                    int frecuenciaCardiaca, int nivelDolor) {
        this.nombre = nombre;
        this.edad = edad;
        this.motivo = motivo;
        this.temperatura = temperatura;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.nivelDolor = nivelDolor;
        this.clasificacion = calcularClasificacion();
    }

    // Metodo que calcula si es rojo, amarillo o verde
    private String calcularClasificacion() {
        if (nivelDolor >= 8 || frecuenciaCardiaca >= 120 || temperatura >= 39.0) {
            return "Emergencia (Rojo)";
        } else if ((nivelDolor >= 5 && nivelDolor <= 7) || 
                   (frecuenciaCardiaca >= 100 && frecuenciaCardiaca <= 119) || 
                   (temperatura >= 37.5 && temperatura <= 38.9)) {
            return "Atención Prioritaria (Amarillo)";
        } else {
            return "Atención Normal (Verde)";
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClasificacion() {
        return clasificacion;
    }
}
