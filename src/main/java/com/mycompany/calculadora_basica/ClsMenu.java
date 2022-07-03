package com.mycompany.calculadora_basica;
import javax.swing.JOptionPane;
/**
 *
 * @author leiner
 */
public class ClsMenu {

    public ClsMenu() {
    }
    
    // metodos vacios sin parametros
    // metodos vacios con parametros
    // metodos retorna un valor no recive parametros
    // metodos retorna un valor y recive parametros
    
    @SuppressWarnings("empty-statement")
    public void iniciarmenu(){
        
        try{//si la exepcion no se activa se ejecuta esto
            String menu = """
                               Bienvenido a tu calculadora

                            Elige una de las siguientes opciones

                            1. Ingresar a la calculadora
                            2. Salir
                        """;
//creo las variable una del menu a mostrar al usuario y la otra para tomar el valor ingresado por el user
            String inmenu = "";      
            //debo buscar la forma de que al ingresar el 2 tire un sms y salga del programa

            do{ //mostrar el menu siempre que la opcion no sea valida 
                inmenu = JOptionPane.showInputDialog(menu);

                switch (inmenu){//si es un 2 se cierra el programa 
                    case "2" -> {
                       JOptionPane.showMessageDialog(null,"Espero verte pronto, hasta luego");
                    }

                    case "1" ->{//si es 1 me muestra el menu de opciones
                        ClsInicio inicio = new ClsInicio();
                        inicio.inicio();
                    }

                default -> inmenu = "pds4s4w";//si no es ninguna de las 2 la variable toma este valor de prueba
                }

                if (inmenu.equals("pds4s4w")){//si la variable es igual a valor de prueba me saca sms par una opcion valida
                    JOptionPane.showMessageDialog(null, "Debes de ingresar una opción valida");
                }

            } while (inmenu.equals("pds4s4w"));//miestras lo que se ingrese no es lo solicitado me muestra el menu
        }
        catch(NullPointerException ex){//si el user da en cancel y no en con el 2 no se genera error solo muestra el sms y se cierra el programa 
            JOptionPane.showMessageDialog(null,"Hasta luego, espero verte pronto");
        }
        
        
       
      
    }
}
