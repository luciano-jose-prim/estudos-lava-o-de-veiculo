/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSouce;

import domain.ECategoria;
import domain.Modelo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luciano
 */
public class ModeloDataSource {
    private static List<Modelo> listaModelos = new ArrayList<>();
    
    public static void criarLista() {
        adicionar(new Modelo(1, "488 Pista", ECategoria.PADRAO, MarcaDataSource.getListaMarcas().get(0)));
        adicionar(new Modelo(2, "Corrolla", ECategoria.MEDIO, MarcaDataSource.getListaMarcas().get(1)));
        adicionar(new Modelo(3, "Astra", ECategoria.MEDIO, MarcaDataSource.getListaMarcas().get(2)));
        adicionar(new Modelo(4, "Amarok", ECategoria.GRANDE, MarcaDataSource.getListaMarcas().get(3)));
        adicionar(new Modelo(5, "Tucson", ECategoria.GRANDE, MarcaDataSource.getListaMarcas().get(4)));
        adicionar(new Modelo(6, "City", ECategoria.MEDIO, MarcaDataSource.getListaMarcas().get(5)));
    }
    
    public static Modelo adicionar(Modelo modelo) {
        listaModelos.add(modelo);
        return modelo;
    }
    
    public static List<Modelo> getListaModelos() {
        return listaModelos;
    }
}
