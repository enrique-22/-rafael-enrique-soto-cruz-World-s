/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafaelenriquesotocruz;

/**
 *
 * @author rafa
 */
public class BaroqueWorks implements raza {

    @Override
    public String nombre() {
        int fock;
        fock = poder();
        
        return "BaroqueWorks"+fock ;
    }

    private int poder() {
        return 10;
    }
    
}
