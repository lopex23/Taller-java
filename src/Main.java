public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Sebastian", 20, "Ingeniería de Sistemas");


        Profesor profesor1 = new Profesor("Camila", 42, "Programación Orientada a Objetos");

        estudiante1.presentarse();
        profesor1.presentarse();
    }
}