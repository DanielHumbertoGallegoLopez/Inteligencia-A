/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeragente;
import jade.core.Agent;
import jade.core.Agent.*;
import jade.core.behaviours.SimpleBehaviour;

/**
 *
 * @author Daniel Gallego
 */
public class AgComportamientoSimple extends Agent{
    //Definicion de un comportamiento simple dentro de la clase
    class TareaSimple extends SimpleBehaviour{
        
        public void action(){
            for (int i=0;i<10;i++)
                System.out.println("Ciclo " + i);
        }
        
        public boolean done(){
            System.out.println("Terminado");
            return true;
        }
    }
    
    protected void setup(){
        System.out.println("Primer Agente con Comportamiento JADE");
        TareaSimple cl = new TareaSimple();
        this.addBehaviour(cl);
    }
}
