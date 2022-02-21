package cuentas;

/**
 * Programa principal que incluye el método main y el método operativa_cuenta
 * Desde aquí se se realizarán las acciones para interactuar con las distintas clases.
 * 
 * @author renzo
 *
 */
public class Main {
	
	/**
	 * Método Main
	 * Se declara y genera la cuenta y el saldo actual.
	 * Imprime en pantalla un mensaje con el saldo actual de la cuenta.
	 * Ejecuta el método operativa_cuenta
	 *
	 */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, 0.0f);
    }
    
    /**
     * En esté método se pretende realizar las operaciones de ingresar y retirar dinero de una cuenta y se indica mediante
     * un mensaje si se ha realizado la operación o ha ocurrido un fallo.
     * @param cuenta Cuenta sobre la que se van a realizar las operaciones
     * @param cantidad Importe con el que se va a operar. (tipo float)
     */
    //TODO modoficar el tipo de la variable cantidad, en el resto del programa se utiliza double para los valores decimales.
    
	private static void operativa_cuenta(CCuenta cuenta, float cantidad) {
		try {
            cuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
