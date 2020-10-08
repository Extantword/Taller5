package ejercicio9;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Ejercicio9 {

    Lista estudiantes = new Lista();

    public void menu(){

        Scanner sc = new Scanner(System.in);
        int opcion = 0;


       // estudiantes.insertar(new Estudiante(1193, "C.C", "Juan", new double[]{1, 2, 3}));

        do {


            System.out.println("¿Que desea hacer?");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Ver datos y notas de los estudiantes");
            System.out.println("3. Ver promedio de las notas");
            System.out.println("4. Salir");

            System.out.print(">");
            opcion = sc.nextInt();

            switch (opcion){

                case 1:

                    guardarEstudiante();
                    break;

                case 2:

                    verDatos();
                    break;

                case 3:

                    verPromedio();
                    break;

                case 4:

                    System.out.println("\nSaliendo del sistema de almacenamiento de notas...");
                    break;

                default:

                    System.out.println("\nHa ingresado una opción no válida. Intentelo de nuevo\n");
                    menu();


            }



        }while((opcion != 4));

    }

    public void guardarEstudiante(){

        Scanner sc = new Scanner(System.in);

        String tipoId;
        int id;
        String nombre;
        double notas[] = new double[3];

        System.out.println("Ingrese nombre del estudiante: ");
        nombre = sc.nextLine();

        System.out.println("Ingrese tipo de identificación (C.C o T.I)");
        tipoId = sc.nextLine();

        System.out.println("Ingrese número de identificación: ");
        id = sc.nextInt();

        for(int i = 0; i < 3; i++){
            System.out.println("Ingrese nota " + (i + 1) + " del estudiante");
            notas[i] = sc.nextDouble();
        }

        estudiantes.insertar(new Estudiante(id, tipoId, nombre, notas));

        System.out.println("\nEl estudiante fue ingresado exitosamente\n");

        estudiantes.calcularFinal();

    }

    public void verDatos(){

      //  System.out.println("Mostrando");

        if(estudiantes.getCabeza() != null){
            estudiantes.mostrar();
        }else{
            System.out.println("\nNo se han ingresado estudiantes!\n");
        }

    }

    public void verPromedio(){

        if(estudiantes.getCabeza() != null){
            System.out.println("\nPromedio de las notas: " + estudiantes.calcularPromedio() + "\n");
        }else{
            System.out.println("\nNo se han ingresado estudiantes!\n");
        }

    }



    public static void main(String[] args){

        System.out.println("Bienvenido al sistema de almacenamiento notas");
        Ejercicio9 ejercicio = new Ejercicio9();
        ejercicio.menu();

    }
}
