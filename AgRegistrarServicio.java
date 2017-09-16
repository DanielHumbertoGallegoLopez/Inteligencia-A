/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeragente;

import jade.core.Agent;
import jade.domain.FIPAException;
import jade.domain.DFService;
import jade.domain.FIPAAgentManagement.ServiceDescription;
import jade.domain.FIPAAgentManagement.DFAgentDescription;

/**
 *
 * @author Daniel Gallego
 */
public class AgRegistrarServicio  extends Agent{
    public String servicio;
    
    protected void setup(){
        Object [] arg2 = getArguments();
        servicio = (String) arg2[0];
        System.out.println("El nombre de este agente es : " + this.getLocalName()+ "Yo doy el servicio " + servicio);
        registrerService();
    }
    
    private void registrerService(){
        DFAgentDescription dfd = new DFAgentDescription();
        dfd.setName(this.getAID());
        
        ServiceDescription sd = new ServiceDescription();
        sd.setType(servicio);
        sd.setName(servicio);
        
        dfd.addServices(sd);
        try{
            DFService.register(this, dfd);
        }
        catch(FIPAException ex){
            System.err.println("El Agente : "+ getLocalName() + "No he podido registrar el servicio : " + ex.getMessage());
        }
    }
    
}
