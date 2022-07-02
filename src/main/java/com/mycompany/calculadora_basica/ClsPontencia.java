package com.mycompany.calculadora_basica;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author leine
 */
public class ClsPontencia {
    public ClsPontencia() {
    }
    public void potencia (){
        DecimalFormat dc = new DecimalFormat("#.##");
        String pote1 = JOptionPane.showInputDialog("Ingrese el primer numero");
        String pote2 = JOptionPane.showInputDialog("Ingresa el segundo numero");
        Double p1 = Double.parseDouble(pote1);
        Double p2 = Double.parseDouble(pote2);
        Double totalpotencia = Math.pow(p1, p2);
        JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + dc.format(totalpotencia));
                ClsInicio inicio = new ClsInicio();
                inicio.inicio();
    }
}