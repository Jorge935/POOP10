/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String[] mensajes ={"elemento1","elemento2","elemento3"};
        System.out.println("mensajes = "+ mensajes.length);
        try{
            for(int i = 0; i <= mensajes.length; i++){
                System.out.println(mensajes[i]);
            }    
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error desbordamiento de memoria");
            System.out.println(e.getMessage());
        }
        
        System.out.println("Hola mundo después de try catch");
        System.out.println("########Finally#########");
        try{
            float x = 10/0;
            
            System.out.println("x = " + x); 
        }catch(ArithmeticException ae){
            System.out.println("Error" + ae.getMessage());
        }finally{
            System.out.println("Sin importar lo que pase, el bloque finally se ejecuta");
        }
        
        System.out.println("########Finally2#########");
        try{
            float x = 10/2;
            
            System.out.println("x = " + x); 
        }catch(ArithmeticException ae){
            System.out.println("Error" + ae.getMessage());
        }finally{
            System.out.println("Sin importar lo que pase, el bloque finally se ejecuta");
        }

        System.out.println("########Anidación catchs#########");
        try{
            float y = 3/0;
            System.out.println(y);
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Error" + e.getMessage());
        }finally{
            System.out.println("El bloque finally siempre se ejecuta");
        }
        
        System.out.println("########Propagación excepciones#########");
        try{
            float division = miMetodo(14,0);
            System.out.println("división: " + division);  
        }catch(ArithmeticException ae){
            System.out.println("Error! "+ae.getMessage());
        }
        /**
        float div = miMetodo(14,0);
        System.out.println("########Propagaciòn excepciones#########");
        miMetodo2("www",123456,22.4f);
        * */
        
        Cuenta cuenta = new Cuenta();
        System.out.println("Saldo "+cuenta.getSaldo());
        try {
            cuenta.depositar(2000);
            cuenta.depositar(20000);
        } catch (ExcesoMontoException ex) {
            System.err.println("Error "+ex.getMessage());
        }
        System.out.println("Saldo $"+cuenta.getSaldo());
        try {
            cuenta.retirar(1000);
            System.out.println("Saldo $"+cuenta.getSaldo());
            cuenta.retirar(20);
            System.out.println("Saldo $"+cuenta.getSaldo());
            cuenta.retirar(10);
            System.out.println("Saldo $"+cuenta.getSaldo());
            cuenta.retirar(10);
            System.out.println("Saldo $"+cuenta.getSaldo());
        } catch (SaldoInsuficienteException ex) {
            //Logger.getLogger(POOP10.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Error "+ex.getMessage());
        }catch (ExcesoRetirosException ex){
            System.err.println("Error "+ex.getMessage());
        }
        
        
    }
    private static float miMetodo(int a, int b) throws ArithmeticException{
         return a/b;
    }

    private static void miMetodo2(String www, int i, float f) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
    
}
