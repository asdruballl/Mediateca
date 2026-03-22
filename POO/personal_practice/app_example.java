package personal_practice;

import java.util.Scanner;

public class app_example {
    public static void limpiarpantalla() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static double pagarServicio(String nombre, double monto, double saldo) {
        if (monto > saldo) {
            System.out.println("Transaccion declinada. Fondos insuficientes");
            return saldo;
        } else {
            System.out.println("Transaccion exitosa");

        }
        return saldo - monto;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        String cuenta = "asdrubal";
        String password = "1234";
        String historial = "--- Inicio de actividad ---\n";
        String nTransaccion = "";
        double saldo = 0.00;
        boolean loginexitoso = false;
        boolean nuevatransaccion = false;
        System.out.println("===Bienvenido a Cash Bank===");
        do {
            System.out.print("Ingresa tu usuario: ");
            String tCuenta = rd.nextLine().trim();
            System.out.print("Ingresa tu contraseña: ");
            String tPassword = rd.nextLine().trim();
            if (tCuenta.equals(cuenta) && tPassword.equals(password)) {
                System.out.println("Bienvenido " + cuenta);
                System.out.print("Que deseas hacer hoy? ");
                loginexitoso = true;
            } else {
                limpiarpantalla();
                System.out.print("Usuario o contraseña incorrecta, intente nuevamente.");
            }
        }
        while (!loginexitoso);
        do {
            System.out.println("======================");
            System.out.println("1. Realizar depósito");
            System.out.println("2. Realizar retiro");
            System.out.println("3. Ver saldo");
            System.out.println("4. Pagar servicios");
            System.out.println("5. Historial");
            System.out.println("======================");
            int opcion = rd.nextInt();
            rd.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("\tDepósito");
                    System.out.println("================================");
                    System.out.println("Ingrese cantidad a depositar: ");
                    double tSaldo = rd.nextDouble();
                    rd.nextLine();
                    System.out.println("Deposito realizado exitosamente");
                    System.out.println("Nuevo saldo: $" + (saldo += tSaldo));
                    System.out.println("=================================");
                    historial += " + Deposito: $" + tSaldo + " Saldo: $" + saldo + "\n";
                    break;

                case 2:
                    System.out.println("\tRetiro");
                    System.out.println("===============================");
                    System.out.println("Ingrese la cantidad a retirar: ");
                    double tCantidad = rd.nextDouble();
                    rd.nextLine();
                    if (tCantidad > saldo) {
                        System.out.println("Saldo insuficiente.");
                        break;
                    } else {
                        System.out.println("Retiro realizado exitosamente");
                        System.out.println("Nuevo saldo: $" + (saldo - tCantidad));
                        System.out.println("==============================");
                        saldo -= tCantidad;
                        historial += "- Retiro: $" + tCantidad + " Saldo: $" + saldo + "\n";
                    }
                    break;

                case 3:
                    System.out.println("\tSaldo");
                    System.out.println("==================================================");
                    System.out.println("El saldo actual de su  cuenta es de: $" + saldo);
                    System.out.println("==================================================");
                    break;

                case 4:
                    System.out.println("\tServicios");
                    System.out.println("========================================");
                    System.out.println("Ingrese el servicio a pagar: ");
                    System.out.println("1. Spotify");
                    System.out.println("2. Netflix");
                    System.out.println("3. Energia electrica");
                    System.out.println("4. Universidad");
                    System.out.println("=========================================");
                    int tServicio = rd.nextInt();
                    rd.nextLine();
                    System.out.print("Ingrese monto a pagar: ");
                    double tMonto = rd.nextDouble();
                    rd.nextLine();
                    double saldoAnterior = saldo;
                    saldo = pagarServicio("Servicio", tMonto, saldo);
                    if (saldo < saldoAnterior) {
                        historial += "- Pago: $" + tMonto + " Saldo: $" + saldo + "\n";
                        System.out.println("Pago de servicio: -$" + tMonto + " * Saldo: $" + saldo + "\n");
                    }
                    break;

                case 5:
                    System.out.println("\tHistorial");
                    System.out.println("==========================");
                    System.out.println(historial);
                    System.out.println("==========================");
                    break;

                default:
                    System.out.println("Seleccion incorrecta, intente nuevamente");
                    break;

            }
            System.out.println("Deseas hacer otra transaccion?: (Y/N");
            nTransaccion = rd.nextLine().trim().toLowerCase();
            if (nTransaccion.equals("n")) {
                nuevatransaccion = true;
                System.out.println("Gracias por usar Cash Bank");
            }
        }
        while (!nuevatransaccion);
    }
}

