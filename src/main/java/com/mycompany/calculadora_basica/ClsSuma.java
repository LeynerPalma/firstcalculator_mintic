package com.mycompany.calculadora_basica;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author leine
 */
public class ClsSuma {
    public ClsSuma() {
    } //hay que generar las exepciones
    public void suma(){
        DecimalFormat dc = new DecimalFormat("#.##");     
        String suma1 = JOptionPane.showInputDialog("Ingrese el primer digito a sumar");
        String suma2 = JOptionPane.showInputDialog("Ingrese el segundo digito a sumar");
        Double s1 = Double.parseDouble(suma1);
        Double s2 = Double.parseDouble(suma2);       
        Double totalsuma = s1 + s2;
        
        
        if (s1 == 0 && s2==0){
            JOptionPane.showMessageDialog(null, "El resultaddo de la operación es: 0");
            ClsInicio inicio = new ClsInicio();
            inicio.inicio();
        }
        
        else{
            JOptionPane.showMessageDialog(null,"El valor de la suma es: " + dc.format(totalsuma));
  
            ClsInicio inicio = new ClsInicio();
            inicio.inicio();
        
        }
        

    }
    
    
}
