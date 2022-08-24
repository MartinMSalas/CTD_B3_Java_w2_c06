package CTD_B3_Java_Clase11;

public class CuentaCorriente extends Cuenta{
    /*CTD_B3_Java_Clase11.Cuenta corriente: Poseen un saldo y, además, un monto autorizado para girar en
    descubierto. En este tipo de cuenta se pueden realizar dos operaciones:
            ○ Depositar efectivo: el cliente puede depositar la cantidad de dinero que desee.
            ○ Extraer efectivo: el cliente puede extraer dinero y utilizar su giro en descubierto en
    caso de que no tenga saldo suficiente.*/

    private double giroDescubierto;

    public CuentaCorriente(double saldo, Cliente cliente, double giroDescubierto) {
        super(saldo, cliente);
        this.giroDescubierto = giroDescubierto;
    }

    @Override
    public void extraerEfectivo(double monto) {
        if(monto<= (informarSaldo()+giroDescubierto)){
            if (monto <= getSaldo()){
                setSaldo(getSaldo()-monto);
            }

        }

    }
}
