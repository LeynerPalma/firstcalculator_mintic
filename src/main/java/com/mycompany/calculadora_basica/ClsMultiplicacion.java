package com.mycompany.calculadora_basica;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
//importo la fuciones a utilizar 
/**
 *
 * @author leiner
 */
public class ClsMultiplicacion {
    public ClsMultiplicacion() {
    }//hay que generar las exepciones
    public void multiplicacion(){
        DecimalFormat dc = new DecimalFormat("#.##");//me reduce el nuemero de decimales a solo 2
        String multi1 = JOptionPane.showInputDialog("Ingrese el primer número");
        String multi2 = JOptionPane.showInputDialog("Ingrese el segundo número");
        Double m1 = Double.parseDouble(multi1);
        Double m2 = Double.parseDouble(multi2);
        Double totalmulti = m1*m2;//realiza la operación 
        
        //muestra el resultado y me regresa al menu de opciones 
        JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + dc.format(totalmulti));
            ClsInicio inicio = new ClsInicio();
            inicio.inicio();
        
        
        
        
    
    }
}
