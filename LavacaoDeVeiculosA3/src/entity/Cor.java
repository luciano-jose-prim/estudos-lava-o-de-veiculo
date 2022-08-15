/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author mpisching
 */
public class Cor {
    private int id;//atributo de classe
    private String nome;
    
    public int getId() {
        return id;
    }
            
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cor() { //sobrecarga de métodos - overloading
    }

    public Cor(String nome) {
        this.nome = nome;
    }
    
}
