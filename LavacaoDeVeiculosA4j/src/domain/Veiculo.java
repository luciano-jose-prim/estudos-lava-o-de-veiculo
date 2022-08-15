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
public class Veiculo {
private int id;
    private String placa;
    private String observacoes;
    
    private Modelo modelo;
    
    private Cliente cliente;
    
    private Cor cor;

    public Veiculo(int id, String placa, String observacoes, Modelo modelo, Cliente cliente, Cor cor) {
        this.id = id;
        this.placa = placa;
        this.observacoes = observacoes;
        this.modelo = modelo;
        this.cliente = cliente;
        this.cor = cor;
    }
    
    

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        this.cliente.add(this);
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Veiculo() {
    }

    public Veiculo(String placa) {
        this.placa = placa;
    }

    public Veiculo(String placa, Modelo modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Dados do Veiculo: \n");
        sb.append("Marca: ").append(this.getModelo().getMarca().getNome()).append("\n");
        sb.append("Modelo: ").append(this.getModelo().getDescricao()).append("\n");
        sb.append("Placa: ").append(this.getPlaca()).append("\n");
        sb.append("Cor: ").append(this.getCor().getNome()).append("\n\n");
        sb.append("Proprietario: \n").append("Nome: ").append(this.getCliente().getNome()).append("\n").
            //append(this.getCliente().getClass()).append("\n"). 
            append("Fone: ").append(this.getCliente().getCelular()).append("\n").
            append("Email: ").append(this.getCliente().getEmail()).append("\n\n");
            
        return sb.toString();
    }
    
}
