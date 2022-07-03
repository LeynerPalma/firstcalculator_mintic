package com.mycompany.calculadora_basica;
import javax.swing.JOptionPane;
/**
 *
 * @author leine
 */
public class ClsInicio {

    public ClsInicio() {   
    }
    
    public void inicio(){
    //En un string creo el menu principal de la calculadora
        String inicio = """
                            Seleccione la operación a realizar

                        1. Suma
                        2. Resta
                        3. Multiplicación
                        4. Divición
                        5. Potencia
                        6. Raíz cuadrada
                        7. Salir                    
                        """;
    // crep string para guardar la opcion del usuario
        String ininicio = "";
  
        // simpre me va a mostrar el menu mientras 
        do{ 
            ininicio = JOptionPane.showInputDialog(inicio);
            // esto valida si el numero ingresado por el usuario corresponde a la operación él la agecuta segun el numero ingresado.
            
            switch (ininicio) {
                case "1" -> {
                    ClsSuma suma = new ClsSuma();
                    suma.suma();
                }
                
                case "2" -> {
                    ClsResta resta = new ClsResta();
                    resta.resta();
                }
                
                case "3" -> {
                    ClsMultiplicacion multiplicacion = new ClsMultiplicacion();
                    multiplicacion.multiplicacion();
                }
                
                case "4" -> {
                    ClsDivision division = new ClsDivision();
                    division.division();
                }
                
                case "5" -> {
                    ClsPontencia potencia = new ClsPontencia();
                    potencia.potencia();
                }
                
                case "6" -> {
                    ClsRcuadrada rcuadrada = new ClsRcuadrada();
                    rcuadrada.rcuadrada();
                }
                
                case "7" -> {
                    JOptionPane.showMessageDialog(null,"Espero verte pronto, hasta luego");
                }
//esto lo puese como solo como ejemplo.
                default -> ininicio = ".9231/*//8#";                   
            }
            // sms si el usuario ingresa algo que no sea lo solicitado 
            if (ininicio.equals(".9231/*//8#")){
                JOptionPane.showMessageDialog(null,"Debe de ingresar una opción valida");
            }
        } //miestras la variable sea igual a "eso que está ahí" me va a mostrar un sms de error y me va a mostrar de nuevo el menu principal 
        while (ininicio.equals(".9231/*//8#"));
            
            
        
 
    }
}
