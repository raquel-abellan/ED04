package cuentas;

/**
 * La clase CCuenta describe los atributos y metodos de las cuentas bancarias
 * que utilizaremos en este programa
 * 
 * @author Raquel Abellan Sanchez
 */
public class CCuenta {

    // atributos
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Metodo constructor vacio
     */
    public CCuenta() {
    }

    /**
     * Metodo constructor con parametros
     *
     * @param nombre del titular de la cuenta
     * @param cuenta iban
     * @param saldo de la cuenta en euros
     * @param tipoInteres de la cuenta
     */
    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    /**
     * Metodo para sumar una cantidad de dinero a una cuenta bancaria
     *
     * @param cantidad de dinero a ingresar
     * @throws Exception avisa de que no es posible ingresar cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo para restar una cantidad dinero de una cuenta bancaria
     * 
     * @param cantidad de dinero a retirar
     * @throws Exception avisa de que no es posible retirar una cantidad negativa
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getSaldo() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * obtener nombre nombre del titular
     * 
     * @return nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * cambiar nombre del titular
     * @param nombre del titular
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * obtener cuenta iban
     * @return cuenta iban
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * cambiar cuenta iban
     * @param cuenta iban
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * obtener saldo de la cuenta
     * @return saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * cambiar saldo de la cuenta en euros
     * @param saldo  de la cuenta en euros
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * obtener tipo de interes de la cuenta en euros
     * @return tipo de interes de la cuenta en euros
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * cambiar tipo de interes de la cuenta
     * @param tipoInterés  de la cuenta
     */
    public void setTipoInteres(double tipoInterés) {
        this.tipoInteres = tipoInterés;
    }

}


