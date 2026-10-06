public class Profesor extends Persona {
    private String asignatura;

    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        this.asignatura = asignatura;
    }

    @Override
    public void presentarse() {
        System.out.println("Buenos días, soy el profesor " + getNombre() + ", tengo " + getEdad() + " años y dicto la asignatura de " + asignatura + ".");
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}