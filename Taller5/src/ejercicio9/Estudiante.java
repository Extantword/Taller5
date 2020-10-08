package ejercicio9;

public class Estudiante {

    private String tipoId;
    private int id;
    private String nombre;
    private double notas[];
    private double notaFinal;

    public Estudiante(int id, String tipoId, String nombre, double notas[]){

        this.id = id;
        this.tipoId = tipoId;
        this.nombre = nombre;
        this.notas = notas;
    }


    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void mostrar(){

        System.out.println("Nombre: " + nombre);

        System.out.println("Nota 1: " + notas[0]);
        System.out.println("Nota 2: " + notas[1]);
        System.out.println("Nota 3: " + notas[2]);

        System.out.println("Nota final: " + notaFinal);

        if(notaFinal > 2.96)
            System.out.println("Aprobó");
        else
            System.out.println("No aprobó");

    }
}
