/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataSouce;

import domain.Cliente;
import domain.PessoaFisica;
import domain.PessoaJuridica;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luciano
 */
public class ClienteDataSource {
     private static List<Cliente> listaClientes = new ArrayList<>();
    
    public static void criarLista() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        adicionar(new PessoaFisica(1, "Luky", "999999999", "luky@gmail.com", 
                sdf.parse("22/10/2020"), "123.456.789-99", sdf.parse("16/05/1991")));
        adicionar(new PessoaFisica(2, "Paty", "996544321", "Paty.Py@gmail.com", 
                sdf.parse("02/07/2022"), "987.012.456-53", sdf.parse("02/07/1993")));
        adicionar(new PessoaFisica(3, "Pe.Marcelo", "999352240", "Padre.Marcelo@gmail.com", 
                sdf.parse("07/05/2022"), "900.174.309-22", sdf.parse("21/03/1985")));
        adicionar(new PessoaJuridica(4, "FF Supermercado", "32729097", "FF@Supermercado.com.br", 
                sdf.parse("05/08/2021"), "33.654.123/4422-19", "29184730"));
        adicionar(new PessoaJuridica(5, "Femsa", "32728300", "Femsa@CocaCola.com.br", 
                sdf.parse("09/12/2020"), "67.925.030/7622-20", "46934231"));
        
    }
    
    public static Cliente adicionar(Cliente cliente) {
        listaClientes.add(cliente);
        return cliente;
    }
    
    public static List<Cliente> getListaClientes() {
        return listaClientes;
    }    
}
