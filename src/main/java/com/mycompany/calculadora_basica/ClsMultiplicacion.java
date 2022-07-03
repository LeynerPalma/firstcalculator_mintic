package com.mycompany.calculadora_basica;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author leiner
 */
public class ClsMultiplicacion {
    public ClsMultiplicacion() {
    }//hay que generar las exepciones
    public void multiplicacion(){
        DecimalFormat dc = new DecimalFormat("#.##");//esto deja solo 2 decimales 
        String multi1 = JOptionPane.showInputDialog("Ingrese el primer número");
        String multi2 = JOptionPane.showInputDialog("Ingrese el segundo número");
        
        try{//si no se ejecuta la exepcion me correo el codigo 
        
        
            Double m1 = Double.parseDouble(multi1);//paso de string a double 
            Double m2 = Double.parseDouble(multi2);
            Double totalmulti = m1*m2;//hago la multiplicación


            JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + dc.format(totalmulti));
                ClsInicio inicio = new ClsInicio();//muestro el resultado y ejecuta el menu principal 
                inicio.inicio();
        }
        catch(NumberFormatException ex){//si se genera la exepcion me muestra un sms y me tira al menu principal 
            JOptionPane.showMessageDialog(null,"Debes de ingresar un valor numerico");
            ClsInicio inicio = new ClsInicio();
            inicio.inicio();
        }    
    }
}
