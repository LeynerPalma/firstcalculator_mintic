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
    public void iniciarmenu(){
        String menu = """
                           Bienvenido a tu calculadora

                        Elige una de las siguientes opciones

                        1. Ingresar a la calculadora
                        2. Salir
                    """;
        
        String inmenu = "";      
        //debo buscar la forma de que al ingresar el 2 tire un sms y salga del programa
       
        do{ 
            inmenu = JOptionPane.showInputDialog(menu);
            
            switch (inmenu){
                case "2" -> {
                   JOptionPane.showMessageDialog(null,"Espero verte pronto, hasta luego");
                }
                
                case "1" ->{
                    ClsInicio inicio = new ClsInicio();
                    inicio.inicio();
                }
                
            default -> inmenu = "pds4s4w";
            }
            
            if (inmenu.equals("pds4s4w")){
                JOptionPane.showMessageDialog(null, "Debes de ingresar una opción valida");
            }
            
        } while (inmenu.equals("pds4s4w"));
        
        
       
      
    }
}
