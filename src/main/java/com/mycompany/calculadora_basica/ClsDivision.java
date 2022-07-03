package com.mycompany.calculadora_basica;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
//importo las funciones a tulizar 
/**
 *
 * @author leiner
 */
public class ClsDivision {

    public ClsDivision() {
    }
    
    public void division (){
        DecimalFormat dc = new DecimalFormat("#.##"); //esto solo me deja 2 decimales 
        JOptionPane.showMessageDialog(null, "Recuerda que no puedes dividir entre (0)");//mensaje de notificación
        String division1 = JOptionPane.showInputDialog("Ingresa el primer numero");
        String division2 = JOptionPane.showInputDialog("Ingresa el segundo numero");
        Double d1 = Double.parseDouble(division1);
        Double d2 = Double.parseDouble(division2);
        //valido que el segundo numero no sea un cero        
        if (d2 == 0){
            JOptionPane.showMessageDialog(null, "Lo lamento, pero no es posible dividir entre 0");
           //me tira un sms y me devuelve al menu de opciones si se ingresa un 0
            ClsInicio inicio = new ClsInicio();
            inicio.inicio();
        }
        
        else{
            Double totaldivision = d1/d2;
            JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + dc.format(totaldivision));
             //esto hace la operación de la división y luego de mostrar el resultado me devuelve al menu de opciones
                ClsInicio inicio = new ClsInicio();
                inicio.inicio();
        }
    
    
    }
    
}
