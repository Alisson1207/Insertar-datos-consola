public class Estudiante {
    String cedula;
    String nombre;
    Double b1;
    Double b2;

    public Estudiante(String cedula, String nombre, Double b1, Double b2) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.b1 = b1;
        this.b2 = b2;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getB1() {
        return b1;
    }

    public Double getB2() {
        return b2;
    }
}

