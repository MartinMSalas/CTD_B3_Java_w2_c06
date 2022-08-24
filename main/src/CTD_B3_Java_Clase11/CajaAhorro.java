package CTD_B3_Java_Clase11;

public class CajaAhorro extends Cuenta{
    /*Caja de ahorro: Poseen un saldo y además una tasa de interés. En este tipo de cuenta
    se pueden realizar tres operaciones:
            ○ Depositar efectivo: el cliente puede depositar la cantidad de dinero que desee.
            ○ Extraer efectivo: el cliente puede extraer dinero sin excederse de su saldo.
            ○ Cobrar interés: el cliente puede cobrar los intereses que su caja de ahorro le otorga
    mensualmente.*/

    private double tasaInteres;

    public CajaAhorro(double saldo, Cliente cliente, double tasaInteres) {
        super(saldo, cliente);
        this.tasaInteres=tasaInteres;
    }


    public void cobrarInteres(){
        depositar(tasaInteres*informarSaldo());
    }

}
