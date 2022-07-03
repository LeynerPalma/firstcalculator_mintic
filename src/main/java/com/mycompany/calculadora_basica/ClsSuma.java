package com.mycompany.calculadora_basica;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;


/**
 *
 * @author leiner
 */
public class ClsSuma {
    public ClsSuma() {
    } //hay que generar las exepciones
    public void suma(){
        DecimalFormat dc = new DecimalFormat("#.##"); //Esto solo me deja 2 decimales    
        String suma1 = JOptionPane.showInputDialog("Ingrese el primer digito a sumar");
        String suma2 = JOptionPane.showInputDialog("Ingrese el segundo digito a sumar");
        
        
        //se maneja la exepcion si el valor ingresado no es un numero 
        try{
            Double s1 = Double.parseDouble(suma1);//pasa del string al double
            Double s2 = Double.parseDouble(suma2);       
            Double totalsuma = s1 + s2;
        
            if (s1 == 0 && s2==0){//maneja el error si se trata de sumar dos ceros 
                JOptionPane.showMessageDialog(null, "El resultaddo de la operación es: 0");
                ClsInicio inicio = new ClsInicio();
                inicio.inicio();
            }

            else{//si todo lo anterior no es verdadero entonces me suma los dos valores
                JOptionPane.showMessageDialog(null,"El valor de la suma es: " + dc.format(totalsuma));

                ClsInicio inicio = new ClsInicio();
                inicio.inicio();//luego de dar el resultado me ejecuta el menu principal
            }
        
        } catch(NumberFormatException ex){//si el usuario ingresa algo que no es un numero genera la expecion me muestra el sms y me saca el menu principal
                JOptionPane.showMessageDialog(null,"Debes de ingresar un valor numerico");
                ClsInicio inicio = new ClsInicio();
                inicio.inicio();

            }

    }
    
    
}
