/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

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

        Marca marca2 = new Marca();
        marca2.setId(Integer.parseInt(JOptionPane.showInputDialog("Id da marca2: ")));
        marca2.setNome((JOptionPane.showInputDialog("Nome da marca2: ")));
        
        Marca marca3 = new Marca();
        marca3.setId(Integer.parseInt(JOptionPane.showInputDialog("Id da marca3: ")));
        marca3.setNome((JOptionPane.showInputDialog("Nome da marca3: ")));

        Modelo modelo1 = new Modelo();
        modelo1.setId(Integer.parseInt(JOptionPane.showInputDialog("Id do modelo1: ")));
        modelo1.setDescricao((JOptionPane.showInputDialog("Descrição do modelo1: ")));
        modelo1.setMarca(marca2);

        Modelo modelo2 = new Modelo();
        modelo2.setId(Integer.parseInt(JOptionPane.showInputDialog("Id do modelo2: ")));
        modelo2.setDescricao((JOptionPane.showInputDialog("Descrição do modelo2: ")));
        modelo2.setMarca(marca3);
        
        Modelo modelo3 = new Modelo();
        modelo3.setId(Integer.parseInt(JOptionPane.showInputDialog("Id do modelo3: ")));
        modelo3.setDescricao((JOptionPane.showInputDialog("Descrição do modelo3: ")));
        modelo3.setMarca(marca1);

        Veiculo veiculo1 = new Veiculo();
        veiculo1.setId(Integer.parseInt(JOptionPane.showInputDialog("Id do veículo1: ")));
        veiculo1.setPlaca((JOptionPane.showInputDialog("Placa do veículo1: ")));
        veiculo1.setModelo(modelo2);

        Veiculo veiculo2 = new Veiculo();
        veiculo2.setId(Integer.parseInt(JOptionPane.showInputDialog("Id do veículo2: ")));
        veiculo2.setPlaca((JOptionPane.showInputDialog("Placa do veículo2: ")));
        veiculo2.setModelo(modelo1);
        
        Veiculo veiculo3 = new Veiculo();
        veiculo3.setId(Integer.parseInt(JOptionPane.showInputDialog("Id do veículo3: ")));
        veiculo3.setPlaca((JOptionPane.showInputDialog("Placa do veículo3: ")));
        veiculo3.setModelo(modelo3);
        
        Veiculo veiculo4 = new Veiculo();
        veiculo4.setId(Integer.parseInt(JOptionPane.showInputDialog("Id do veículo4: ")));
        veiculo4.setPlaca((JOptionPane.showInputDialog("Placa do veículo4: ")));
        veiculo4.setModelo(modelo3);
        
        Veiculo veiculo5 = new Veiculo();
        veiculo5.setId(Integer.parseInt(JOptionPane.showInputDialog("Id do veículo5: ")));
        veiculo5.setPlaca((JOptionPane.showInputDialog("Placa do veículo5: ")));
        veiculo5.setModelo(modelo2);

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
                + "Marca: " +  veiculo.getModelo().getMarca().getNome() + "\n");
        
    }
}
