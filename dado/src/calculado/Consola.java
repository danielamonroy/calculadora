/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculado;

import java.util.Scanner;

public class Consola {
 public static void main(String[] args)
 {
     Calculado miCalculadoConsola= new Calculado();
     Scanner miEscaner= new Scanner(System.in);
     int op=0;
     do
     {
         do
         {
     System.out.println("Seleccione la operacion:" );
     System.out.println("1. SUMAR");
     System.out.println("2. RESTAR");
     System.out.println("3. MULTIPLICAR");
     System.out.println("4. DIVIDIR");
     op=miEscaner.nextInt();
         }while (op<1|| op>4);
      System.out.println("INGRESE EL PRIMER NUMERO");
      miCalculadoConsola.numero1=miEscaner.nextDouble();
       System.out.println("INGRESE EL SEGUNDO NUMERO");
       miCalculadoConsola.numero2=miEscaner.nextDouble();
        System.out.println("LA RESPUESTA ES");
        switch(op){
            case 1:
              System.out.println(miCalculadoConsola.sumar());  
                   break;
            case 2:
              System.out.println(miCalculadoConsola.restar());  
                   break;
                   case 3:
              System.out.println(miCalculadoConsola.multiplicar());  
                   break;
                   case 4:
              System.out.println(miCalculadoConsola.dividir());  
                   break;
        
                
                }
        System.out.println("presione 5 para elegir otra opcion");
        op=miEscaner.nextInt();
            }while(op==5);
    }
}
    
     
    
