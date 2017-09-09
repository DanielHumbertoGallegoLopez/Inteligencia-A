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
public class PrimerAgente extends Agent{
    public void setup(){
        System.out.println("Hola mundo soy el Agente " + getLocalName());
    }

}
