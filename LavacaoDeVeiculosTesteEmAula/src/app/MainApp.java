/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import domain.Cor;
import domain.Marca;
import domain.Modelo;
import domain.Veiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author luciano
 */
public class MainApp {

    public static void main(String[] args) {
        Marca marca1 = new Marca();
        marca1.setId(Integer.parseInt(JOptionPane.showInputDialog("Id da marca1: ")));
        marca1.setNome((JOptionPane.showInputDialog("Nome da marca1: ")));

        Marca marca2 = new Marca("gol");
        marca2.setId(Integer.parseInt(JOptionPane.showInputDialog("Id da marca2: ")));
        
        Marca marca3 = new Marca(100, "corsa");
        
        Modelo modelo1 = new Modelo();
        modelo1.setId(Integer.parseInt(JOptionPane.showInputDialog("Id do modelo1: ")));
        modelo1.setDescricao((JOptionPane.showInputDialog("Descrição do modelo1: ")));
        modelo1.setMarca(marca2);

        Modelo modelo2 = new Modelo("carro", marca3);
        modelo2.setId(Integer.parseInt(JOptionPane.showInputDialog("Id do modelo2: ")));
        
        Modelo modelo3 = new Modelo(200, "carro", new Marca("honda"));
        
        Cor cor1 = new Cor();
        cor1.setId(Integer.parseInt(JOptionPane.showInputDialog("Id da cor1: ")));
        cor1.setNome((JOptionPane.showInputDialog("Nome da cor1: ")));
        
        Cor cor2 = new Cor("cinza");
        cor2.setId(Integer.parseInt(JOptionPane.showInputDialog("Id da cor2: ")));
        
        Cor cor3 = new Cor(300, "preto");
        
       

        Veiculo veiculo1 = new Veiculo();
        veiculo1.setId(Integer.parseInt(JOptionPane.showInputDialog("Id do veículo1: ")));
        veiculo1.setPlaca((JOptionPane.showInputDialog("Placa do veículo1: ")));
        veiculo1.setModelo(modelo2);
        veiculo1.setCor(cor3);

        Veiculo veiculo2 = new Veiculo("MKF2302");
        veiculo2.setId(Integer.parseInt(JOptionPane.showInputDialog("Id do veículo2: ")));
        veiculo2.setModelo(modelo3);
        veiculo2.setCor(cor1);
        
        Veiculo veiculo3 = new Veiculo("MLD3190", modelo3);
        veiculo3.setId(Integer.parseInt(JOptionPane.showInputDialog("Id do veículo3: ")));
        veiculo3.setCor(cor2);
        
        Veiculo veiculo4 = new Veiculo("MTD1276", modelo1, cor2);
        veiculo4.setId(Integer.parseInt(JOptionPane.showInputDialog("Id do veículo4: ")));
        
        Veiculo veiculo5 = new Veiculo(500, "MRI9856", modelo2, cor1);
        

        imprimir(veiculo1);
        imprimir(veiculo2);
        imprimir(veiculo3);
        imprimir(veiculo4);
        imprimir(veiculo5);

    }

    private static void imprimir(Veiculo veiculo) {
        JOptionPane.showMessageDialog(null,""
                + "Dados do veículo: \nId " + veiculo.getId() + "\n" 
                + "Placa: " + veiculo.getPlaca() + "\n"
                + "Modelo: " + veiculo.getModelo().getDescricao() + "\n"
                + "Marca: " +  veiculo.getModelo().getMarca().getNome() + "\n"
                + "Cor: " + veiculo.getCor().getNome());
        
    }
    
}
