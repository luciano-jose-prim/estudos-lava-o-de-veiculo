/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Aluno
 */
public abstract class Cliente implements ICliente {
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
    
    public void add(Veiculo veiculo) {
        if (this.veiculos == null) {
            veiculos = new ArrayList<>();
        }
        this.veiculos.add(veiculo);
        veiculo.setCliente(this);
    }
    
    public void remove(Veiculo veiculo) {
        if (this.veiculos != null) {
            this.veiculos.remove(veiculo);
            veiculo.setCliente(null);
        }
    }

    @Override
   public String getDados() {
       
   }

    @Override
    public String getDados(String observacao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
