package com.mycompany.calculadora_basica;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author leine
 */
public class ClsDivision {

    public ClsDivision() {
    }
    
    public void division (){
        DecimalFormat dc = new DecimalFormat("#.##");
        JOptionPane.showMessageDialog(null, "Recuerda que no puedes dividir entre (0)");
        String division1 = JOptionPane.showInputDialog("Ingresa el primer numero");
        String division2 = JOptionPane.showInputDialog("Ingresa el segundo numero");
        Double d1 = Double.parseDouble(division1);
        Double d2 = Double.parseDouble(division2);
               
        if (d2 == 0){
            JOptionPane.showMessageDialog(null, "Lo lamento, pero no es posible dividir entre 0");
           
            ClsInicio inicio = new ClsInicio();
            inicio.inicio();
        }
        
        else{
            Double totaldivision = d1/d2;
            JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + dc.format(totaldivision));
            
                ClsInicio inicio = new ClsInicio();
                inicio.inicio();
        }
    
    
    }
    
}
