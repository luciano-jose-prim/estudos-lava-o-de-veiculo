/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author luciano
 */
public class ExceptionLavacao extends Exception {
   
    public ExceptionLavacao() {
        
    }
    
    public ExceptionLavacao(String msg) {
        super(msg);
    }
}
