import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ciudades {

    public static void main(String[] args) {

        Queue<String> colaCiudades = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar una ciudad");
            System.out.println("2. Mostrar todas las ciudades");
            System.out.println("3. Buscar una ciudad");
            System.out.println("4. Eliminar una ciudad");
            System.out.println("5. Salir del programa");
            System.out.println("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre de la ciudad: ");
                    String nuevaCiudad = scanner.nextLine();
                    if (colaCiudades.contains(nuevaCiudad)) {
                        System.out.println("ERROR. " + nuevaCiudad + " ya está registrada. No se admiten duplicados.");
                    } else {
                        colaCiudades.add(nuevaCiudad);
                        System.out.println("Ciudad añadida correctamente.");
                    }
                    break;
                case 2:
                    if (colaCiudades.isEmpty()) {
                        System.out.println("No hay ciudades registradas.");
                    } else {
                        System.out.println("Ciudades: ");
                        for (String ciudad : colaCiudades) {
                            System.out.println("- " + ciudad);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Introduce el nombre de la ciudad para buscar: ");
                    String buscarCiudad = scanner.nextLine();
                    if (colaCiudades.contains(buscarCiudad)) {
                        System.out.println("Correcto, la ciudad está registrada.");
                    } else {
                        System.out.println("Error, la ciudad no está registrada.");
                    }
                    break;
                case 4:
                    System.out.println("Introduce nombre de la ciudad a eliminar: ");
                    String eliminarCiudad = scanner.nextLine();
                    if (colaCiudades.contains(eliminarCiudad)) {
                        colaCiudades.remove(eliminarCiudad);
                        System.out.println("La ciudad " + eliminarCiudad + " se ha eliminado correctamente.");
                    } else {
                        System.out.println("ERROR, la ciudad " + eliminarCiudad + " no está registrada.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida.\n");
            }
        }        
    }
}
