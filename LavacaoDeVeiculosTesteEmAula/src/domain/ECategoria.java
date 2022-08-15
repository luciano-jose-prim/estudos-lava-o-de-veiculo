/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package domain;

/**
 *
 * @author Aluno
 */
public enum ECategoria {
    PEQUENO("O veículo é de pequeno porte!"), MEDIO("O veículo é de médio porte!"), 
    GRANDE("O veículo é de grande porte!"), MOTO("O veículo é uma moto!"), PADRAO("O veículo é padrão!");
    
    private String descricao;
    
    private ECategoria(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
