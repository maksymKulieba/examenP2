package alumnos;

import alumno.Alumno;
import java.util.Scanner;

/**
 *
 * @author maksy
 * @version 1.0
 * @since 21/05/2021
 */
public class Alumnos {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Alumno[] lstAlumnos = new Alumno[5];

        IntroduceNotas(lstAlumnos, entrada);

        MuestraResultados(lstAlumnos);

    }

    /**
     *
     * @param lstAlumnos
     * Muestra los resultados que se han establecido
     */
    public static void MuestraResultados(Alumno[] lstAlumnos) {
        double sumaDeMedias = 0;

        System.out.println("Los datos introducidos son los siguientes:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno " + i);
            System.out.println("Nombre: " + lstAlumnos[i].getNombre());
            System.out.println("Nota media: " + lstAlumnos[i].getNotaMedia());
            System.out.println("----------------------------");
            sumaDeMedias += lstAlumnos[i].getNotaMedia();
        }
        System.out.println("La media global de la clase es " + sumaDeMedias / 5);
    }

    /**
     *
     * @param lstAlumnos
     * @param entrada
     * @throws NumberFormatException
     */
    public static void IntroduceNotas(Alumno[] lstAlumnos, Scanner entrada) throws NumberFormatException {
        String nombreIntroducido;
        double notaIntroducida;

        System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");
        for (int i = 0; i < 5; i++) {

            lstAlumnos[i] = new Alumno();
            System.out.println("Alumno " + i);
            System.out.print("Nombre: ");
            nombreIntroducido = entrada.nextLine();
            //(alum[i]).nombre = nombreIntroducido;
            System.out.print("Nota media: ");
            notaIntroducida = Double.parseDouble(entrada.nextLine());
            //alum[i].notaMedia = notaIntroducida;

            lstAlumnos[i].AsignarNota(nombreIntroducido, notaIntroducida, 10);

        }
    }
}
