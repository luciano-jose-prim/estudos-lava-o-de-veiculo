/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.Date;

/**
 *
 * @author Aluno
 */
public class PessoaJuridica extends Cliente {
    private String cnpj;
    private String inscricaoEstadual;

    public PessoaJuridica(String cnpj, String inscricaoEstadual) {
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public PessoaJuridica(int id, String nome, String celular, String email, Date dataCadastro, String cnpj, String inscricaoEstadual) {
        super(id, nome, celular, email, dataCadastro);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    
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
