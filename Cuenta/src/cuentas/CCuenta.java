package cuentas;

/**
 * En esta clase se muestran todos los métodos de la clase CCuenta
 * Constructor sobrecargado, uno sin parámetros y otro con los parámetros nombre, cuenta, saldo y tipo de interés.
 * Sus parámetros están encapsulados.
 * Se puede consultar el estado, ingresar y retirar mediante sus correspondientes métodos.
 * 
 * @author renzo
 *
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    /**
     * Construye una CCuenta con valores nulos
     */
    public CCuenta()
    {
    }
    
    /**
     * Construye una CCuenta con los parámetros especificos
     * @param nom nombre del titular de la cuenta
     * @param cue nuemro de la cuenta
     * @param sal saldo en la cuenta
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
        setTipoInteres(tipo);
    }
    
    /**
     * Comprueba el estado actual de la cuenta
     * @return saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Recibe la cantidad que hay que incrementar al saldo actual de la cuenta
     * @param cantidad Saldo a incrementar
     * @throws Exception Devuelve el mensaje si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Recibe la cantidad que hay que restar del saldo actual
     * @param cantidad Saldo a restar
     * @throws Exception devuelve un mensaje si la cantidad a retirar es 0 o negativa y otro mensaje distinto si la cantidad a
     * retirar es superior a la actual en cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private double getTipoInteres() {
		return tipoInteres;
	}

	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
