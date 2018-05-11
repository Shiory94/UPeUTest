/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.upeutest;

import com.sun.xml.internal.ws.spi.db.BindingContextFactory;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Alumno
 */
public class Prueba {
    
    private static final Logger LOGGER =Logger.getLogger(Prueba.class.getName());
    public static void main(String[] args) {
//        System.out.println("Hola Mundo");
           LOGGER.info("Hpña mundo");
           LOGGER.log(Level.FINE, "Hola mundo");
    }
}
  
