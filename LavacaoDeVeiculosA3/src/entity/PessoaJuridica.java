/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.text.SimpleDateFormat;

/**
 *
 * @author mpisching
 */
public class PessoaJuridica extends Cliente{
    private String cnpj;
    private String inscricaoEstadual;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getDados());
        
        sb.append("\n");
        sb.append("CNPJ...................: ");
        sb.append(this.getCnpj());
        sb.append("\n");
        sb.append("Inscricao Estadual.....: ");
        sb.append(this.getInscricaoEstadual());   
        return sb.toString();
    }

    @Override
    public String getDados(String observacao) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getDados());
        sb.append("\n");
        sb.append("Observacoes:  ");
        sb.append(observacao);
        sb.append("\n");
        return sb.toString();
    }
    
}
