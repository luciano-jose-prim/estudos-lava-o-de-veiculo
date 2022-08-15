/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSouce;

import domain.EStatus;
import domain.ItemOS;
import domain.OrdemServico;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luciano
 */
public class OrdemServicoDataSource {
     private static List<OrdemServico> listaOrdemServicos = new ArrayList<>();
    
    public static void criarLista() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        adicionar(new OrdemServico(1, sdf.parse("01/07/2022"), EStatus.ABERTA, 
                VeiculoDataSource.getListaVeiculos().get(0)));
        listaOrdemServicos.get(0).add(new ItemOS(ServicoDataSource.getListaServicos().get(2).getValor(), "", 
                 ServicoDataSource.getListaServicos().get(2)));
        listaOrdemServicos.get(0).add(new ItemOS(ServicoDataSource.getListaServicos().get(3).getValor(), "", 
                 ServicoDataSource.getListaServicos().get(3)));
        listaOrdemServicos.get(0).add(new ItemOS(ServicoDataSource.getListaServicos().get(4).getValor(), "", 
                 ServicoDataSource.getListaServicos().get(4)));
        
        adicionar(new OrdemServico(2, sdf.parse("01/07/2022"), EStatus.ABERTA, 
                VeiculoDataSource.getListaVeiculos().get(2)));
        listaOrdemServicos.get(1).add(new ItemOS(ServicoDataSource.getListaServicos().get(2).getValor(), "", 
                 ServicoDataSource.getListaServicos().get(2)));
        
         adicionar(new OrdemServico(3, sdf.parse("02/07/2022"), EStatus.ABERTA, 
                VeiculoDataSource.getListaVeiculos().get(3)));
        listaOrdemServicos.get(2).add(new ItemOS(ServicoDataSource.getListaServicos().get(3).getValor(), "", 
                 ServicoDataSource.getListaServicos().get(3)));
        
         adicionar(new OrdemServico(4, sdf.parse("02/07/2022"), EStatus.ABERTA, 
                VeiculoDataSource.getListaVeiculos().get(4)));
        listaOrdemServicos.get(3).add(new ItemOS(ServicoDataSource.getListaServicos().get(3).getValor(), "", 
                 ServicoDataSource.getListaServicos().get(3)));
        listaOrdemServicos.get(3).add(new ItemOS(ServicoDataSource.getListaServicos().get(4).getValor(), "", 
                 ServicoDataSource.getListaServicos().get(4)));
        
        adicionar(new OrdemServico(5, sdf.parse("04/07/2022"), EStatus.ABERTA, 
                VeiculoDataSource.getListaVeiculos().get(1)));
        listaOrdemServicos.get(4).add(new ItemOS(ServicoDataSource.getListaServicos().get(1).getValor(), "", 
                 ServicoDataSource.getListaServicos().get(1)));
         
    }
    
    public static OrdemServico adicionar(OrdemServico ordemServico) {
        listaOrdemServicos.add(ordemServico);
        return ordemServico;
    }
    
    public static List<OrdemServico> getListaOrdemServicos() {
        return listaOrdemServicos;
    }
}
