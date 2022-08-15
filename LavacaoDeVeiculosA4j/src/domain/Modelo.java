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
public class Modelo {
    private int id;
    private String descricao;
    
    private ECategoria categoria;
    
    private Marca marca;

    public ECategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(ECategoria categoria) {
        this.categoria = categoria;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo() {
    }

    public Modelo(String descricao, Marca marca) {
        this.descricao = descricao;
        this.marca = marca;
    }

    public Modelo(int id, String descricao, ECategoria categoria, Marca marca) {
        this.id = id;
        this.descricao = descricao;
        this.categoria = categoria;
        this.marca = marca;
    }
    
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Modelo...........: ").append(this.getDescricao()).append(" [").
                append(this.getCategoria().getDescricao()).append("]\n");
        sb.append("Marca............: ").append(this.getMarca().getNome()).append("\n");
        return sb.toString();
    }
}
