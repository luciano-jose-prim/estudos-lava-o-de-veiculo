/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author mpisching
 */
public class PessoaFisica extends Cliente{
    private String cpf;
    private Date dataNascimento;



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
//        sb.append("ID....................: ");
//        sb.append(this.getId());
//        sb.append("\n");
//        sb.append("Nome..................: ");
//        sb.append(this.getNome());
//        sb.append("\n");
//        sb.append("Email.................: ");
//        sb.append(this.getEmail());
//        sb.append("\n");
//        sb.append("Celular...............: ");
//        sb.append(this.getCelular());
//        sb.append("\n");
//        sb.append("Data de cadastro......: ");

        sb.append(super.getDados());
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        sb.append(sdf.format(this.getDataCadastro()));
        sb.append("\n");
        sb.append("CPF...................: ");
        sb.append(this.getCpf());
        sb.append("\n");
        sb.append("Data de nascimento....: ");
        sb.append(sdf.format(this.dataNascimento));
        
//        sb.append("\n");
//        sb.append("Veiculos do cliente: \n");
//        int cont = 0;
//        if (this.getVeiculos() != null) {
//            for (Veiculo v: this.getVeiculos()) {
//                sb.append(++cont);
//                sb.append(" - ");
//                sb.append(v.getPlaca());
//                sb.append(" - ");
//                sb.append(v.getCor().getNome());
//                sb.append(" - ");
//                sb.append(v.getModelo().getDescricao());
//                sb.append(" - ");
//                sb.append(v.getModelo().getCategoria().getDescricao());
//                sb.append(" - ");
//                sb.append(v.getModelo().getMarca().getNome());
//                sb.append("\n");
//            }
//        } else {
//            sb.append("Não há veículos registrados...");
//        }
        
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
