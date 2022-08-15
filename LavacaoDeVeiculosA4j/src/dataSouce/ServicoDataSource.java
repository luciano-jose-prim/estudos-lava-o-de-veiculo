/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSouce;

import domain.ECategoria;
import domain.Servico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luciano
 */
public class ServicoDataSource {
     private static List<Servico> listaServicos = new ArrayList<>();
    
    public static void criarLista() {
        adicionar(new Servico(1, "LAVAÇÂO POR FORA", 50.0, ECategoria.PADRAO));
        adicionar(new Servico(2, "LAVAÇÂO COMPLETA", 80.0, ECategoria.MEDIO));
        adicionar(new Servico(3, "LAVAÇÂO COMPLETA E COM CERA", 100.0, ECategoria.GRANDE));
        adicionar(new Servico(4, "LAVAÇÂO MOTOR", 100.0, ECategoria.PADRAO));
        adicionar(new Servico(5, "IMPERMEABILIZAÇÃO DE BANCOS", 40.0, ECategoria.PADRAO));
       
    }
    
    public static Servico adicionar(Servico servico) {
        listaServicos.add(servico);
        return servico;
    }
    
    public static List<Servico> getListaServicos() {
        return listaServicos;
    }
}
