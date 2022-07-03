package com.mycompany.calculadora_basica;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
//importo las funciones a utilizar 

/**
 *
 * @author leiner
 */
public class ClsPontencia {
    public ClsPontencia() {
    }
    public void potencia (){
        DecimalFormat dc = new DecimalFormat("#.##");//me reduce el numero de decimales a solo dos 
        String pote1 = JOptionPane.showInputDialog("Ingrese el primer numero");
        String pote2 = JOptionPane.showInputDialog("Ingresa el segundo numero");
        Double p1 = Double.parseDouble(pote1);// paso los string a souble 
        Double p2 = Double.parseDouble(pote2);
        Double totalpotencia = Math.pow(p1, p2);//utilizo el Math que ya esta integrado en java y la funcion pow para calcular la potencia entre 1 numero multiplicado por la contidad de veces del otro 
        JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + dc.format(totalpotencia)); //me muestra el resultado y me muestra el menu principa 
                ClsInicio inicio = new ClsInicio();
                inicio.inicio();
    }
}
