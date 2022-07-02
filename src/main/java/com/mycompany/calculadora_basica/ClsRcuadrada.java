package com.mycompany.calculadora_basica;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author leine
 */
public class ClsRcuadrada {

    public ClsRcuadrada() {
    }
    
    public void rcuadrada(){
        DecimalFormat dc = new DecimalFormat("#.##");
        String cuadra1 = JOptionPane.showInputDialog("Ingrese el numero");
        Double rc1 = Double.parseDouble(cuadra1);
        
        
        
        if(rc1 <0){
            JOptionPane.showMessageDialog(null,"Lo lamento pero no se puede sacar raiz a numero negativos");
            ClsMenu menu = new ClsMenu();
            menu.iniciarmenu();
            
            ClsInicio inicio = new ClsInicio();
            inicio.inicio();
        }
        else{
            Double raiz = Math.sqrt(rc1);
            JOptionPane.showMessageDialog(null, "El resultado del calculo es: " + dc.format(raiz));
            
                ClsInicio inicio = new ClsInicio();
                inicio.inicio();
        }
    }
    
}
