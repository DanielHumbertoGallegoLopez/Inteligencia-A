/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeragente;
import jade.core.Agent;

/**
 *
 * @author Daniel Gallego
 */
public class AgHolaMundo extends Agent{
    protected void setup(){
        Object [] listaparametros = getArguments();
        String primerArgumento = (String) listaparametros[0]; 
        String segundoArgumento = (String) listaparametros[1];
        System.out.println("Hola mundo soy el primer agente " + getLocalName() 
                + " Argumento 1 : " + primerArgumento 
                + " Argumento 2: " + segundoArgumento);
    }
}
