/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import dataSouce.ClienteDataSource;
import dataSouce.CorDataSource;
import dataSouce.MarcaDataSource;
import dataSouce.ModeloDataSource;
import dataSouce.OrdemServicoDataSource;
import dataSouce.ServicoDataSource;
import dataSouce.VeiculoDataSource;
import domain.Cliente;
import domain.Cor;
import domain.Marca;
import domain.Modelo;
import domain.ECategoria;
import domain.OrdemServico;
import domain.PessoaFisica;
import domain.PessoaJuridica;
import domain.Veiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author luciano
 */
public class MainApp {

    public static void main(String[] args) throws ParseException {
        
        CorDataSource.criarLista();
        MarcaDataSource.criarLista();
        ModeloDataSource.criarLista();
        ClienteDataSource.criarLista();
        VeiculoDataSource.criarLista();
        ServicoDataSource.criarLista();
        OrdemServicoDataSource.criarLista();
        
             imprimirOS(OrdemServicoDataSource.getListaOrdemServicos());
    }
    
    private static void imprimirOS(List<OrdemServico> listaOrdemServicos) {
        for (OrdemServico ordemServico: listaOrdemServicos) {
           JOptionPane.showInputDialog(ordemServico.getDados());
        }
        
    }
}
