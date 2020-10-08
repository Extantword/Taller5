package ejercicio9;

public class Nodo{

    private Estudiante estudiante;
    private Nodo liga;
    private String mensaje;

    public Nodo(Estudiante dato, Nodo liga){

        this.estudiante = estudiante;
        this.liga = liga;
    }

    public Nodo(Estudiante estudiante){

        this.estudiante = estudiante;

        this.liga = null;
    }

    public Estudiante getEstudiante(){
        return estudiante;
    }

    public Nodo getLiga(){
        return liga;
    }

    public void setDato(Estudiante estudiante){
        this.estudiante = estudiante;
    }

    public void setLiga(Nodo liga){
        this.liga = liga;
    }

}