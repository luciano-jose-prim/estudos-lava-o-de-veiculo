/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Aluno
 */
public class Cor {
    int id;
    String nome;

    public Cor() {
    }

    public Cor(String nome) {
        this.nome = nome;
    }

    public Cor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
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
    
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("id...").append(this.id).append("\n");
        sb.append("Nome...").append(this.nome).append("\n");
        return sb.toString();
    }
}
