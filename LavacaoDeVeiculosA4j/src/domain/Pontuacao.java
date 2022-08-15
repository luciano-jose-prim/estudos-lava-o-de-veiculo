/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import exceptions.ExceptionLavacao;

/**
 *
 * @author luciano
 */
public class Pontuacao {
       private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public int adicionar(int qtd) {
        this.quantidade += qtd;
        return this.quantidade;
    }
    
    public int subtrair(int qtd) throws ExceptionLavacao{
        if (qtd <= this.quantidade) {
            this.quantidade -= qtd;
        } else {
            throw new ExceptionLavacao("Não há pontos suficientes para retirada!");
        }
        return this.quantidade;
    }
    
    public int saldo() {
        return this.quantidade;
    }
    
}
