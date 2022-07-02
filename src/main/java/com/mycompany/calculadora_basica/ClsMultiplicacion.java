package com.mycompany.calculadora_basica;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author leine
 */
public class ClsMultiplicacion {
    public ClsMultiplicacion() {
    }//hay que generar las exepciones
    public void multiplicacion(){
        DecimalFormat dc = new DecimalFormat("#.##");
        String multi1 = JOptionPane.showInputDialog("Ingrese el primer número");
        String multi2 = JOptionPane.showInputDialog("Ingrese el segundo número");
        Double m1 = Double.parseDouble(multi1);
        Double m2 = Double.parseDouble(multi2);
        Double totalmulti = m1*m2;
        
        
        JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + dc.format(totalmulti));
            ClsInicio inicio = new ClsInicio();
            inicio.inicio();
        
        
        
        
    
    }
}
