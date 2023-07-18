public class Ejercicio3 {
    public static void main(String[] args) {

        CuentaBancaria[] CBU = new CuentaBancaria[4];
        CBU[0] = new CuentaBancaria(11000101, 1245011);
        CBU[1] = new CuentaBancaria(11000102, 1234121);
        CBU[2] = new CuentaBancaria(11000103, 6213221);
        CBU[3] = new CuentaBancaria(11000104, 6312331);

        int SaldoMasAlto = 0;

        for (CuentaBancaria cbanc : CBU) {
            if (cbanc.getSaldo() > SaldoMasAlto) {
                SaldoMasAlto = cbanc.getSaldo();
            }
        }

        System.out.println("El Saldo mas alto es de: " + SaldoMasAlto);
    }


}

class CuentaBancaria {
    private
    int NumeroCuenta;
    int Saldo;
    public
    CuentaBancaria(int N,int S){
        NumeroCuenta = N;
        Saldo = S;
    }
    int getNumeroCuenta() {
        return NumeroCuenta;
    }
    int getSaldo() {
        return Saldo;
    }
}

