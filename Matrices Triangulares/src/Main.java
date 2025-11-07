import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    // DEFINIR

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el tamaño de las filas. Mayor que 0 pero menor de 50");

        int tamaño = scanner.nextInt();

    while(tamaño != 0){ // Si pone que el tamaño de filas es 0 se termina el programa

        if(tamaño<0 || tamaño >50){ // Si pone un número que no vale hace que lo vuelva a escribir

            System.out.println("Has introducido un número no válido");


        }else { // Si pone bien los datos se ejecuta el programa

            int matriz[][] = new int[tamaño][tamaño];
            boolean parteArriba = true;
            boolean parteAbajo = true;


            System.out.println("Introduce los " + tamaño * tamaño + " números");


            // MATRIZ TRIANGULAR
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j] = scanner.nextInt();

                    // COMPROBACIÓN DE TRIANGULAR
                    if (matriz[i][j] != 0 && j > i) {
                        parteArriba = false;
                    }
                    if (matriz[i][j] != 0 && j < i) {
                        parteAbajo = false;
                    }
                }
            }

            /*for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {

                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }*/


            // SALIDA
            if(parteArriba == true || parteAbajo == true){
                System.out.println("SÍ");
            }else{
                System.out.println("NO");
            }
        }












        // VUELVE A INTRODUCIR LOS DATOS PARA COMPROBAR SI TERMINA

        System.out.println("Introduce el tamaño de las filas. Mayor que 0 pero menor de 50");

        tamaño = scanner.nextInt();

        }
    }
}