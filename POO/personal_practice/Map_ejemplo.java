package personal_practice;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Map_ejemplo{
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Map<String, Double> inventory = new HashMap<>();
        int option;

        System.out.println("===BIENVENIDO AL SISTEMA DE INVENTARIO===");

        do {
            System.out.println("\n¿Qué deseas hacer?");
            System.out.println("1. Agregar o actualizar producto");
            System.out.println("2. Buscar el precio de un producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar inventario completo");
            System.out.println("5. Salir");
            System.out.print("Por favor elige una opción: ");
            option = read.nextInt();
            read.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Ingresa el nombre del producto: ");
                    String name = read.nextLine().toLowerCase();
                    System.out.print("Ingresa el precio: ");
                    double price = read.nextDouble();
                    inventory.put(name, price);
                    System.out.println("Producto guardado exitosamente");
                    read.nextLine();
                    read.nextLine();
                    break;

                case 2:
                    System.out.print("¿Qué producto estás buscando?: ");
                    String search = read.nextLine().toLowerCase();
                    if (inventory.containsKey(search)) {
                        System.out.println("El precio de " + search + " es: $" + inventory.get(search));
                        read.nextLine();
                    } else {
                        System.out.println("ERROR: El producto no existe en el inventario");
                    }
                    break;

                case 3:
                    System.out.print("¿Qué producto deseas eliminar?: ");
                    String tRemove = read.nextLine().toLowerCase();
                    if (inventory.remove(tRemove) != null) {
                        System.out.println("Producto eliminado exitosamente");
                        read.nextLine();

                    } else {
                        System.out.println("ERROR: Producto no encontrado");
                    }
                    break;

                case 4:
                    System.out.println("\n===LISTA DE PRODUCTOS ACTUAL===");
                    if (inventory.isEmpty()) {
                        System.out.println("ERROR: La lista de productos está vacía");
                    } else {
                        for (var entry : inventory.entrySet()) {
                            System.out.println("* Producto: " + entry.getKey() + " | Precio: $" + entry.getValue());
                        }
                        read.nextLine();
                    }
                    break;

                case 5:
                    System.out.println("¡Gracias por usar este programa. Que tengas un buen día!");
                    break;

                default:
                    System.out.println("ERROR: Opción inválida, intenta de nuevo");
                    read.nextLine();
            }
        } while (option != 5);

        read.close();
    }
}
