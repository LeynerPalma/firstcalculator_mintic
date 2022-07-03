package com.mycompany.calculadora_basica;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author leiner
 */
public class ClsRcuadrada {

    public ClsRcuadrada() {
    }
    
    public void rcuadrada(){
        DecimalFormat dc = new DecimalFormat("#.##");//solo me deja 2 decimales
        String cuadra1 = JOptionPane.showInputDialog("Ingrese el numero");//solicito el numero para el proceso
        
        try{
            Double rc1 = Double.parseDouble(cuadra1);//si no se genera la axepcion me cambia del string al double



            if(rc1 <0){//si el valor ingresado es negativo me indica que no se puede sacar raiz a numeros negativos
                JOptionPane.showMessageDialog(null,"Lo lamento pero no se puede sacar raiz a numero negativos");

                ClsInicio inicio = new ClsInicio();
                inicio.inicio();//me tira el menu principal 
            }
            else{//con la funcion Math calculo la raiz cuadrada del numero y me lo muestra en pantalla con solo 2 decimales
                Double raiz = Math.sqrt(rc1);
                JOptionPane.showMessageDialog(null, "El resultado del calculo es: " + dc.format(raiz));

                    ClsInicio inicio = new ClsInicio();
                    inicio.inicio();//me tira al menu de inicio
                }
               
        }
        catch(NumberFormatException ex){//si se genera la exepcion me muestra el sms y me tira al menu de inicio 
            JOptionPane.showMessageDialog(null,"Debes de ingresar un valor numerico");
            ClsInicio inicio = new ClsInicio();
            inicio.inicio();

            }
    }
    
}
