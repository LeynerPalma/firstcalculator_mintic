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
    //creo el menú
        
        try{//si no se genera la exepcion me ejecuta el programa
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
//creo la variable del menu y para tomar el valor ingresado por el cliente
            String ininicio = "";

//siempre me muestra el menu de opciones y segun el valor ingresado me ejecuta esa funcion 
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

                    default -> ininicio = ".9231/*//8#";    //si ninguna de la opcion es valida la variable
                    //toma este valor de prueba 
                }

                if (ininicio.equals(".9231/*//8#")){//si la variable vale lo de prueba tira sms y muestra el menu
                    JOptionPane.showMessageDialog(null,"Debe de ingresar una opción valida");
                }
            }
            while (ininicio.equals(".9231/*//8#")); //y esto se ejecuta simpre que es variable no tenga una opcion valida 
        
    }
    catch(NullPointerException ex){//si user cierra ´por cancel y no por el 7 se genra la exepcion tira sms y se cierra el porgrama 
            JOptionPane.showMessageDialog(null,"Hasta luego, espero verte pronto");
        }
    
    
            
            
        
 
    }
}
