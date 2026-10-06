public class Estudiante extends Persona {
    private String programa;

    public Estudiante(String nombre, int edad, String programa) {
        super(nombre, edad);
        this.programa = programa;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy el estudiante " + getNombre() + ", tengo " + getEdad() + " años y estudio el programa de " + programa + ".");
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
}