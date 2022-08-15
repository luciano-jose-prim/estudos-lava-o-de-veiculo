/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSouce;

import domain.Veiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luciano
 */
public class VeiculoDataSource {
     private static List<Veiculo> listaVeiculos = new ArrayList<>();
    
    public static void criarLista() {
        adicionar(new Veiculo(1, "MKL-1234", "Semi-novo", ModeloDataSource.getListaModelos().get(0), 
                ClienteDataSource.getListaClientes().get(0),CorDataSource.getListaCores().get(1)));
        
        adicionar(new Veiculo(2, "ANA-9876", "Novo", ModeloDataSource.getListaModelos().get(1), 
                ClienteDataSource.getListaClientes().get(1),CorDataSource.getListaCores().get(2)));
        
        adicionar(new Veiculo(3, "LUA-4390", "Parachoque amassado", ModeloDataSource.getListaModelos().get(2), 
                ClienteDataSource.getListaClientes().get(2),CorDataSource.getListaCores().get(3)));
        
        adicionar(new Veiculo(4, "LHJ-4321", "Semi-novo", ModeloDataSource.getListaModelos().get(3), 
                ClienteDataSource.getListaClientes().get(3),CorDataSource.getListaCores().get(4)));
        
        adicionar(new Veiculo(5, "NAA-6769", "Novo", ModeloDataSource.getListaModelos().get(4), 
                ClienteDataSource.getListaClientes().get(4),CorDataSource.getListaCores().get(5)));
        
        adicionar(new Veiculo(6, "RTA-8969", "Semi-Novo", ModeloDataSource.getListaModelos().get(4), 
                ClienteDataSource.getListaClientes().get(4),CorDataSource.getListaCores().get(1)));
    }
    
    public static Veiculo adicionar(Veiculo veiculo) {
        listaVeiculos.add(veiculo);
        return veiculo;
    }
    
    public static List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }
}
