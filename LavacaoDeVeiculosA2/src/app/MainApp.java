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
import java.util.Scanner;

/**
 *
 * @author luciano
 */
public class MainApp {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Marca marca1 = new Marca();
        System.out.print("Id da marca: ");
        marca1.setId(entrada.nextInt());
        System.out.print("Nome da marca: ");
        marca1.setNome(entrada.next());

        Marca marca2 = new Marca("gol");
        System.out.print("Id da marca: ");
        marca2.setId(entrada.nextInt());
       

        Modelo modelo1 = new Modelo();
        System.out.print("Id do modelo: ");
        modelo1.setId(entrada.nextInt());
        System.out.print("Descrição do modelo: ");
        modelo1.setDescricao(entrada.next());
        modelo1.setMarca(marca2);

        Modelo modelo2 = new Modelo("vw", marca2);
        System.out.print("Id do modelo: ");
        modelo2.setId(entrada.nextInt());
        
        Cor cor1 = new Cor();
        System.out.print("Id da cor: ");
        cor1.setId(entrada.nextInt());
        System.out.print("Nome da cor: ");
        cor1.setNome(entrada.next());
        
        Cor cor2 = new Cor("preto");
        System.out.print("Id da cor: ");
        cor2.setId(entrada.nextInt());
        
        Veiculo veiculo1 = new Veiculo();
        System.out.print("Id do veículo: ");
        veiculo1.setId(entrada.nextInt());
        System.out.print("Placa do veículo: ");
        veiculo1.setPlaca(entrada.next());
        veiculo1.setCor(cor2);
        veiculo1.setModelo(modelo2);

        Veiculo veiculo2 = new Veiculo("MKD1206");
        System.out.print("Id do veículo: ");
        veiculo2.setId(entrada.nextInt());
        veiculo2.setCor(cor1);
        veiculo2.setModelo(modelo1);
        
        Veiculo veiculo3 = new Veiculo("JDK3021", modelo2);
        System.out.print("Id do veículo: ");
        veiculo3.setCor(cor2);
        veiculo3.setId(entrada.nextInt());
        

        imprimir(veiculo1);
        imprimir(veiculo2);
        imprimir(veiculo3);

    }

    private static void imprimir(Veiculo veiculo) {
        System.out.println("Dados do veículo");
        System.out.println("Id: " + veiculo.getId());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Modelo: " + veiculo.getModelo().getDescricao());
        System.out.println("Marca: " + veiculo.getModelo().getMarca().getNome());
        System.out.println("Cor: " + veiculo.getCor().getNome());
        System.out.println("--------------\n");
    }
}
