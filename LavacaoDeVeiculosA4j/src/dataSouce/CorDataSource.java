/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSouce;

import domain.Cor;
import domain.Marca;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author luciano
 */
public class CorDataSource {
    private static List<Cor> listaCores = new ArrayList<>();
    
    public static void criarLista() {
        adicionar(new Cor(1, "Vermelho"));
        adicionar(new Cor(2, "Cinza"));
        adicionar(new Cor(3, "Verde"));
        adicionar(new Cor(4, "Preto"));
        adicionar(new Cor(5, "Prata"));
        adicionar(new Cor(6, "Amarelo"));
        
    }
    
    public static Cor adicionar(Cor cor) {
        listaCores.add(cor);
        return cor;
    }
    
    public static List<Cor> getListaCores() {
        return listaCores;
    }
}
