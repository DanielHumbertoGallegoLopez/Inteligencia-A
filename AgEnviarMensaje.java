/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeragente;

import jade.core.*;
import jade.core.behaviours.*;
import jade.lang.acl.*;

/**
 *
 * @author Daniel Gallego
 */
public class AgEnviarMensaje extends Agent{
    
    class ComportEnvia extends SimpleBehaviour{
        String nameAgent;
        public ComportEnvia (String n) {nameAgent = n;}
        
        public void action() {
            doWait(20000);
            ACLMessage acl = new ACLMessage(ACLMessage.REQUEST);
            AID agrec = new AID(nameAgent,AID.ISLOCALNAME);
            acl.addReceiver(agrec);
            acl.setContent(" Mensaje1 ");
            send(acl);
        }
        
        public boolean done() {
            return true;
        }
    }
    
    protected void setup(){
        Object [] listaparametros = getArguments();
        String nameAgenteR = (String) listaparametros[0];
        System.out.println(" Hola Mundo soy el primer Agente " + getLocalName());
        ComportEnvia ce = new ComportEnvia(nameAgenteR);
        addBehaviour(ce);
    }
}
