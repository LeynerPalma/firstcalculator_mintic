package com.mycompany.calculadora_basica;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author leine
 */
public class ClsResta {

    public ClsResta() {
    } // hay que generar las exepciones
   
    public void resta(){
        DecimalFormat dc = new DecimalFormat("#.##");
        String resta1 = JOptionPane.showInputDialog("Ingrese el primer numero");
        String resta2 = JOptionPane.showInputDialog("Ingrese el segundo numero");
        Double r1 = Double.parseDouble(resta1);
        Double r2 = Double.parseDouble(resta2);
        Double totalresta = r1-r2;
        
        JOptionPane.showMessageDialog(null, "El valor de la resta es: " + dc.format(totalresta));
            ClsInicio inicio = new ClsInicio();
            inicio.inicio();

    
    }
    
    
}
