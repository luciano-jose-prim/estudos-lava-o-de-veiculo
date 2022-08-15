/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Aluno
 */
public class PessoaFisica extends Cliente {
    private String cpf;
    private Date dataNascimento;
    
    public PessoaFisica(int id, String nome, String celular, String email, Date dataCadastro, String cpf, Date dataNascimento) {
        super(id, nome, celular, email, dataCadastro);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    public PessoaFisica() {
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    @Override
    public String getDados() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.getDados());
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        sb.append("\n");
        sb.append("CPF...................: ");
        sb.append(this.getCpf());
        sb.append("\n");
        sb.append("Data de nascimento....: ");
        sb.append(sdf.format(this.dataNascimento));
          
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
