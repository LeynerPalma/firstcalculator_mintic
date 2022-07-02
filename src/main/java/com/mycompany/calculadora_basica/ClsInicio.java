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
    
        String ininicio = "";
  
        
        do{ 
            ininicio = JOptionPane.showInputDialog(inicio);
            // hacer un switcase
            
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

                default -> ininicio = ".9231/*//8#";                   
            }
            
            if (ininicio.equals(".9231/*//8#")){
                JOptionPane.showMessageDialog(null,"Debe de ingresar una opción valida");
            }
        }
        while (ininicio.equals(".9231/*//8#"));
            
            
        
/**        
        
        if (ininicio.equals("1")){
           ClsSuma suma = new ClsSuma();
           suma.suma();
                   
        }
        
        else if (ininicio.equals("2")){
            ClsResta resta = new ClsResta();
            resta.resta();
        }
        
        else if (ininicio.equals("3")){
            ClsMultiplicacion multiplicacion = new ClsMultiplicacion();
            multiplicacion.multiplicacion();
        }
        
        else if (ininicio.equals("4")){
            ClsDivision division = new ClsDivision();
            division.division();
        }
        
        else if (ininicio.equals("5")){
            ClsPontencia potencia = new ClsPontencia();
            potencia.potencia();
        }
        
        else if (ininicio.equals("6")){
            ClsRcuadrada rcuadrada = new ClsRcuadrada();
            rcuadrada.rcuadrada();
        }  
**/
        //debo de hacer que me valide si meto algo que no sea numerioco en el rango y que vuelva amostrar el menu, puedo crear una variable y un condicioanl que si lo ingresado no está en un rango se falso y hacer eso mientras sea falso 
    }
}
