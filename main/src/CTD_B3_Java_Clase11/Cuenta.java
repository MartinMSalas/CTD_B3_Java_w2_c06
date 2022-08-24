package CTD_B3_Java_Clase11;

public class Cuenta {
//    CUENTAS: Permiten depositar, extraer efectivo e informar saldo. Una cuenta tiene un
  //  cliente asociado.
    private double saldo;
    private Cliente cliente;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cuenta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void depositar(double monto){
        saldo += monto;
    }
    public void extraerEfectivo (double monto){
        if(saldo>=monto){
            saldo -= monto;
        }
        else {
            System.out.println("Su saldo es insuficiente");
        }
    }
    public double informarSaldo(){
        return saldo;
    }


}
