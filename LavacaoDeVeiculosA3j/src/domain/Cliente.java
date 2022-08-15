/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Aluno
 */
public abstract class Cliente implements ICliente{
     private int id;
    private String nome;
    private String celular;
    private String email;
    private Date dataCadastro;
    
    private List<Veiculo> veiculos;

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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }
    
    public void add(Veiculo veiculo) {
        if (this.veiculos == null) {
            this.veiculos = new ArrayList<>();
        }
        this.veiculos.add(veiculo);
        
    }
    
    public void remove(Veiculo veiculo) {
        if (this.veiculos != null) {
            this.veiculos.remove(veiculo);
        }
    }
    
    @Override
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID....................: ");
        sb.append(this.getId());
        sb.append("\n");
        sb.append("Nome..................: ");
        sb.append(this.getNome());
        sb.append("\n");
        sb.append("Email.................: ");
        sb.append(this.getEmail());
        sb.append("\n");
        sb.append("Celular...............: ");
        sb.append(this.getCelular());
        sb.append("\n");
        sb.append("Data de cadastro......: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sb.append(sdf.format(this.getDataCadastro()));
        
        sb.append("\n");
        sb.append("Veiculos do cliente: \n");
        int cont = 0;
        if (this.getVeiculos() != null) {
            for (Veiculo v: this.getVeiculos()) {
                sb.append(++cont);
                sb.append(" - ");
                sb.append(v.getPlaca());
                sb.append(" - ");
                sb.append(v.getCor().getNome());
                sb.append(" - ");
                sb.append(v.getModelo().getDescricao());
                sb.append(" - ");
                sb.append(v.getModelo().getCategoria().getDescricao());
                sb.append(" - ");
                sb.append(v.getModelo().getMarca().getNome());
                sb.append("\n");
            }
        } else {
            sb.append("Não há veículos registrados...");
        }
        
        return sb.toString();
    }    
    
}
