package com.mycompany.calculadora_basica;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author leiner
 */
public class ClsResta {

    public ClsResta() {
    } // hay que generar las exepciones
   
    public void resta(){
        DecimalFormat dc = new DecimalFormat("#.##");//me permite solo 2 decimales
        String resta1 = JOptionPane.showInputDialog("Ingrese el primer numero");
        String resta2 = JOptionPane.showInputDialog("Ingrese el segundo numero");
        
        try{ //si no se genera la exepcion me ejecuta este codigo
        
        
            Double r1 = Double.parseDouble(resta1);
            Double r2 = Double.parseDouble(resta2);//paso de string a double
            Double totalresta = r1-r2;

            JOptionPane.showMessageDialog(null, "El valor de la resta es: " + dc.format(totalresta));
                ClsInicio inicio = new ClsInicio();
                inicio.inicio();

        }
        catch(NumberFormatException ex){//si se genera la exepción me muestra el mensaje y me tira al menu principal
            JOptionPane.showMessageDialog(null,"Debes de ingresar un valor numerico");
            ClsInicio inicio = new ClsInicio();
            inicio.inicio();
        }
        

    
    }
    
    
}
