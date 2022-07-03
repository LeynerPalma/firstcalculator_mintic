package com.mycompany.calculadora_basica;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author leiner
 */
public class ClsPontencia {
    public ClsPontencia() {
    }
    public void potencia (){
        DecimalFormat dc = new DecimalFormat("#.##");//me deja solo 2 decimales 
        String pote1 = JOptionPane.showInputDialog("Ingrese el primer numero");//solicito los numero a trabajar 
        String pote2 = JOptionPane.showInputDialog("Ingresa el segundo numero");
        
        try{//si no se genera la exepcion me ejecuta el codigo
        
            Double p1 = Double.parseDouble(pote1);//paso de string a double
            Double p2 = Double.parseDouble(pote2);
            Double totalpotencia = Math.pow(p1, p2);//con este metodo saco la potencia del primer numero
            JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + dc.format(totalpotencia));
                    ClsInicio inicio = new ClsInicio();
                    inicio.inicio();//luego del mensaje muestro el menu de inicio 
        }
        catch(NumberFormatException ex){//si se ejecuta la exepcion me muestra el sms y me tira al menu principal
            JOptionPane.showMessageDialog(null,"Debes de ingresar un valor numerico");
            ClsInicio inicio = new ClsInicio();
            inicio.inicio();

        }
    }
}
