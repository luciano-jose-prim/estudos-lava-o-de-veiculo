/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author luciano
 */
public class ItemOS {
    private double valorServico;
    private String observacoes;
    
    private Servico servico;
    
    private OrdemServico ordemServico;

    public ItemOS(double valorServico, String observacoes, Servico servico) {
        this.valorServico = valorServico;
        this.observacoes = observacoes;
        this.servico = servico;
    }
    
    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }
    

}
