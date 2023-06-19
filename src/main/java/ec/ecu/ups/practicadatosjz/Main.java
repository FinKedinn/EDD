package ec.ecu.ups.practicadatosjz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("=== Agenda ===");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese el teléfono del contacto: ");
                    String telefono = scanner.next();
                    agenda.agregarContacto(nombre, telefono);
                    System.out.println("Contacto agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.next();
                    Contacto<String> contactoEncontrado = agenda.buscarContacto(nombreBuscar);
                    if (contactoEncontrado != null) {
                        System.out.println("Contacto encontrado:");
                        System.out.println("Nombre: " + contactoEncontrado.nombre);
                        System.out.println("Teléfono: " + contactoEncontrado.telefono);
                    } else {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    String nombreEliminar = scanner.next();
                    agenda.eliminarContacto(nombreEliminar);
                    System.out.println("Contacto eliminado correctamente.");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }

            System.out.println();
        } while (opcion != 4);

        scanner.close();
    }
}
