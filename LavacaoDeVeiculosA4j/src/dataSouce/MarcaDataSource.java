/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSouce;

import domain.Marca;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author luciano
 */
public class MarcaDataSource {
    private static List<Marca> listaMarcas = new ArrayList<>();
    
    public static void criarLista() {
        adicionar(new Marca(1, "Ferrari"));
        adicionar(new Marca(2, "Toyota"));
        adicionar(new Marca(3, "Chevrolet"));
        adicionar(new Marca(4, "Volkswagen"));
        adicionar(new Marca(5, "Hyundai"));
        adicionar(new Marca(6, "Honda"));
         
    }
    
    public static Marca adicionar(Marca marca) {
        listaMarcas.add(marca);
        return marca;
    }
    
    public static List<Marca> getListaMarcas() {
        return listaMarcas;
    }
}
