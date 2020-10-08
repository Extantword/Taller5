package ejercicio9;

public class Lista {

    private Nodo cabeza;

    public Lista(){
        cabeza = null;
    }

    public Lista(Nodo cabeza){
        this.cabeza = cabeza;
    }

    public void insertar(Estudiante estudiante){

        Nodo auxNodo = new Nodo(estudiante);

        if(cabeza == null){
            cabeza = auxNodo;
        }else{
            auxNodo.setLiga(cabeza.getLiga());
            cabeza.setLiga(auxNodo);
        }
    }

    public void mostrar(){

        Nodo auxNodo = cabeza;

        while(auxNodo != null){
            System.out.println("\n-------------------");
            auxNodo.getEstudiante().mostrar();
            auxNodo = auxNodo.getLiga();
        }

        System.out.print("\n");

    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void calcularFinal(){

        Nodo auxNodo = cabeza;

        while(auxNodo != null){

            double notaFinal = auxNodo.getEstudiante().getNotas()[0] * 0.25
                             + auxNodo.getEstudiante().getNotas()[1] * 0.25
                             + auxNodo.getEstudiante().getNotas()[2] * 0.5;

            auxNodo.getEstudiante().setNotaFinal(notaFinal);

            auxNodo = auxNodo.getLiga();
        }
    }

    public double calcularPromedio(){

        Nodo auxNodo = cabeza;

        double promedio = 0;

        int num = 0;

        while(auxNodo != null){

            num++;

            promedio += auxNodo.getEstudiante().getNotaFinal();

            auxNodo = auxNodo.getLiga();
        }

        return promedio / num;

    }

}
