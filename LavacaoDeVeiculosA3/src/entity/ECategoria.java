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
public enum ECategoria {
    PEQUENO(1, "Pequeno"), MEDIO(2, "Médio"), GRANDE(3, "Grande"), MOTO(4, "Moto"), PADRAO(0, "Padrão");
    
    private int valor;
    private String descricao;
    
    private ECategoria(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
    
    
}
