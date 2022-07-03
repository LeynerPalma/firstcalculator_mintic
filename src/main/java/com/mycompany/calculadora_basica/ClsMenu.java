/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora_basica;
import javax.swing.JOptionPane;
/**
 *
 * @author leine
 */
public class ClsMenu {

    public ClsMenu() {
    }
    
    // metodos vacios sin parametros
    // metodos vacios con parametros
    // metodos retorna un valor no recive parametros
    // metodos retorna un valor y recive parametros
    
    @SuppressWarnings("empty-statement")
    public void iniciarmenu(){//creo el menu de incio de la calculadora por si quiere salir y no hacer nada o sí si quiere usar el software
        String menu = """  
                           Bienvenido a tu calculadora

                        Elige una de las siguientes opciones

                        1. Ingresar a la calculadora
                        2. Salir
                    """;
        
        String inmenu = "";      
        //creo variable para almacenar el dato ingresado por el usuario
       
        do{ 
            inmenu = JOptionPane.showInputDialog(menu);//me muestra el menu mientras la opción ingresada sea falsa
            
            switch (inmenu){
                case "2" -> {//si es un 2 me cierra el software y se despide 
                   JOptionPane.showMessageDialog(null,"Espero verte pronto, hasta luego");
                }
                
                case "1" ->{//si es 1 me muestra el menu de opciones de inicio para lanzar la aplicación 
                    ClsInicio inicio = new ClsInicio();
                    inicio.inicio();
                }
                // si el valor ingresado no es ninguno de los valores ya dados me muestra error y me tira el mismo menu
            default -> inmenu = "pds4s4w";
            }
            
            if (inmenu.equals("pds4s4w")){
                JOptionPane.showMessageDialog(null, "Debes de ingresar una opción valida");
            }
            
        } while (inmenu.equals("pds4s4w"));
        
        
       
      
    }
}
