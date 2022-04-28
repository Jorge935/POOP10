/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author alumno
 */
public class Cuenta {
    private double saldo;
    private int retiros;
    public Cuenta() {
        retiros = 3;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double monto) throws ExcesoMontoException{
        if(monto < 20000){
            saldo += monto;
        }else
            throw new ExcesoMontoException();
        System.out.println("Depositando... $" + monto);
        try{
            Thread.sleep(1500);
        }catch(InterruptedException e){
            System.out.println("Error en sleep"+e.getMessage());
        }
        
        
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException, ExcesoRetirosException{
        if(saldo >= monto && retiros > 0){
            saldo -= monto;
            retiros -= 1;
        }
            
        else if(retiros > 0) {
            throw new SaldoInsuficienteException();
        }else{
            throw new ExcesoRetirosException();
        }
        System.out.println("Retirando... $" + monto);
        try{
            Thread.sleep(1500);
        }catch(InterruptedException e){
            System.out.println("Error en sleep"+e.getMessage());
        }
    }
    
}
