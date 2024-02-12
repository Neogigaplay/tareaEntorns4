/**
 * La clase CCuenta representa una cuenta bancaria con información del titular,
 * número de cuenta,saldo y tipo de interés de la cuenta.
 */

 public class CCuenta {

  // Atributos de la clase

    /**
   * Nombre del titular.
   */
    private String nombre; //Atributo titular de la cuenta
  /**
   * Número de cuenta.
   */
    private String cuenta; // Atributo número de cuenta
  /**
   * Saldo actual.
   */
    private double saldo; // Atributo saldo actual
  /**
   * Tipo de interés de la cuenta.
   */
    private double tipoInterés; //Atributo tipo de interés de la cuenta

     //Contructores

  /**
   * Constructor por defecto de la clase CCuenta.
   */
    public CCuenta()
    {
    }
  /**
   * Constructor que inicializa la cuenta con información específica.
   *
   * @param nom    Nombre del titular.
   * @param cue    Número de cuenta.
   * @param sal    Saldo inicial.
   * @param tipo   Tipo de interés asociado.
   */
    public CCuenta(String nom, String cue, double sal, double tipo) //Constructor que inicializa la cuenta con información específica.
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
        setTipoInterés(tipo);
    }

  // Métodos de la clase
  /**
   * Devuelve el estado del saldo de la cuenta.
   *
   * @return Saldo actual de la cuenta.
   */
    public double estado()
    {
        return getSaldo();
    }
  /**
   * Permite ingresar una cantidad en la cuenta.
   *
   * @param cantidad Cantidad a ingresar que tiene que ser un valor positivo.
   * @throws Exception Se lanza una excepción si se ingresa una cantidad negativa.
   */
    public void ingresar(double cantidad) throws Exception //Permite ingresar una cantidad en la cuenta.
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
  /**
   * Permite retirar una cantidad de la cuenta.
   *
   * @param cantidad Cantidad a retirar que tiene que ser un valor positivo.
   * @throws Exception Se lanza una excepción si se retira una cantidad negativa
   *                   o si no hay el suficiente saldo.
   */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
  // Métodos de acceso a los atributos

  /**
   * Obtiene el nombre del titular.
   *
   * @return Nombre del titular.
   */
    public String getNombre() {
        return nombre;
    }
  /**
   * Establece el nombre del titular.
   *
   * @param nombre Nuevo nombre del titular.
   */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  /**
   * Obtiene el número de cuenta.
   *
   * @return Número de cuenta.
   */
    public String getCuenta() {
        return cuenta;
    }
  /**
   * Establece el número de cuenta.
   *
   * @param cuenta Nuevo número de cuenta.
   */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
  /**
   * Obtiene el saldo actual.
   *
   * @return Saldo actual de la cuenta.
   */
    public double getSaldo() {
        return saldo;
    }
  /**
   * Establece el saldo de la cuenta.
   *
   * @param saldo Nuevo saldo de la cuenta.
   */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
  /**
   * Obtiene el tipo de interés de la cuenta.
   *
   * @return Tipo de interés.
   */
    public double getTipoInterés() {
        return tipoInterés;
    }
  /**
   * Establece el tipo de interés de la cuenta.
   *
   * @param tipoInterés Nuevo tipo de interés.
   */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
