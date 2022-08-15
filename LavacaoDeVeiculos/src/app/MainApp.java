/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import domain.Marca;
import domain.Modelo;
import domain.Veiculo;




/**
 *
 * @author Aluno
 */
public class MainApp {
    public static void Main(String[] args) {
        Marca marca = new Marca();
        marca.setId(1);
        marca.setNome("Chevrolet");
        
        Modelo modelo = new Modelo();
        modelo.setId(1);
        modelo.setDescricao("Sedã");
        modelo.setMarca(marca);
        
        Veiculo veiculo = new Veiculo();
        veiculo.setId(1);
        veiculo.setPlaca("MDT1A87");
        veiculo.setModelo(modelo);
        
    }
    
}
