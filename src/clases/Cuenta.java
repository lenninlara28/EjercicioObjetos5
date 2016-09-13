/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author hp 14
 */
public class Cuenta {
    private int Numero_De_Cuenta;
    private int NIT;
    private int Saldo_Actual;
    private int Interes_Actual;
    
    public Cuenta (int n_cuenta,int nit,int saldo_actual,int interes){
        this.Numero_De_Cuenta=n_cuenta;
        this.NIT=nit;
        this.Saldo_Actual=saldo_actual;
        this.Interes_Actual=interes;
    }

    public int getNumero_De_Cuenta() {
        return Numero_De_Cuenta;
    }

    public void setNumero_De_Cuenta(int Numero_De_Cuenta) {
        this.Numero_De_Cuenta = Numero_De_Cuenta;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public int getSaldo_Actual() {
        return Saldo_Actual;
    }

    public void setSaldo_Actual(int Saldo_Actual) {
        this.Saldo_Actual = Saldo_Actual;
    }

    public int getInteres_Actual() {
        return Interes_Actual;
    }

    public void setInteres_Actual(int Interes_Actual) {
        this.Interes_Actual = Interes_Actual;
    }
    
    
}
