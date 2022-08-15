/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import domain.Cliente;
import domain.Cor;
import domain.Marca;
import domain.Modelo;
import domain.ECategoria;
import domain.PessoaFisica;
import domain.PessoaJuridica;
import domain.Veiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author luciano
 */
public class MainApp {

    public static void main(String[] args) throws ParseException {
        
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         
        Marca m1 = new Marca();
        m1.setId(Integer.parseInt(JOptionPane.showInputDialog("**Cadastro da Marca 1**" + "\n" + "Id... ")));
        m1.setNome((JOptionPane.showInputDialog("**Cadastro da Marca 1**" + "\n" + "Nome da marca... ")));
        
        Marca m2 = new Marca();
        m2.setId(Integer.parseInt(JOptionPane.showInputDialog("**Cadastro da Marca 2**" + "\n" + "Id... ")));
        m2.setNome((JOptionPane.showInputDialog("**Cadastro da Marca 2**" + "\n" + "Nome da marca... ")));
        
        Modelo mod1 = new Modelo();
        mod1.setId(Integer.parseInt(JOptionPane.showInputDialog("**Cadastro do Modelo 1**" + "\n" + "Id...: ")));
        mod1.setDescricao((JOptionPane.showInputDialog("**Cadastro do Modelo 1**" + "\n" + "Descrição... ")));
        mod1.setMarca(m2);
        
        int temp1;
         temp1 = Integer.parseInt(
                 JOptionPane.showInputDialog("Selecione o tipo Categoria: \n"
                + "1 - PEQUENO \n2 - MEDIO\n3 - GRANDE\n4 - MOTO\n0 - PADRAO"));
        switch (temp1) {
            case 1: mod1.setCategoria(ECategoria.PEQUENO);break;
            case 2: mod1.setCategoria(ECategoria.MEDIO);break;
            case 3: mod1.setCategoria(ECategoria.GRANDE);break;
            case 4: mod1.setCategoria(ECategoria.MOTO);break;
            case 0: mod1.setCategoria(ECategoria.PADRAO);break;
            default: mod1.setCategoria(ECategoria.PADRAO);
        }
        
        Modelo mod2 = new Modelo();
        mod2.setId(Integer.parseInt(JOptionPane.showInputDialog("**Cadastro do Modelo 2**" + "\n" + "Id...: ")));
        mod2.setDescricao((JOptionPane.showInputDialog("**Cadastro do Modelo 2**" + "\n" + "Descrição... ")));
        mod2.setMarca(m1);
        
          int temp2;
         temp2 = Integer.parseInt(
                 JOptionPane.showInputDialog("Selecione o tipo Categoria: \n"
                + "1 - PEQUENO \n2 - MEDIO\n3 - GRANDE\n4 - MOTO\n0 - PADRAO"));
        switch (temp2) {
            case 1: mod2.setCategoria(ECategoria.PEQUENO);break;
            case 2: mod2.setCategoria(ECategoria.MEDIO);break;
            case 3: mod2.setCategoria(ECategoria.GRANDE);break;
            case 4: mod2.setCategoria(ECategoria.MOTO);break;
            case 0: mod2.setCategoria(ECategoria.PADRAO);break;
            default: mod2.setCategoria(ECategoria.PADRAO);
        }

        Cor c1 = new Cor();
        c1.setId(Integer.parseInt(JOptionPane.showInputDialog("**Cadastro da Cor 1**" + "\n" + "Id... ")));
        c1.setNome((JOptionPane.showInputDialog("**Cadastro da Cor 1**" + "\n" + "Nome... ")));
        
        Cor c2 = new Cor();
        c2.setId(Integer.parseInt(JOptionPane.showInputDialog("**Cadastro da Cor 2**" + "\n" + "Id... ")));
        c2.setNome((JOptionPane.showInputDialog("**Cadastro da Cor 2**" + "\n" + "Nome... ")));
        
        Cliente cliente = new PessoaFisica();
        cliente.setId(Integer.parseInt(JOptionPane.showInputDialog("**Cadastro do Cliente**" + "\n" + "Id...")));
        cliente.setNome(JOptionPane.showInputDialog("**Cadastro do Cliente**" + "\n" + "Nome..."));
        cliente.setCelular(JOptionPane.showInputDialog("**Cadastro do Cliente**" + "\n" + "Celular..."));
        cliente.setEmail(JOptionPane.showInputDialog("**Cadastro do Cliente**" + "\n" + "Email..."));
        String strTmp = JOptionPane.showInputDialog("**Cadastro do Cliente**" + "\n" + "Data de cadastro...");
        cliente.setDataCadastro(sdf.parse(strTmp));
        if (cliente instanceof PessoaFisica) {
            ((PessoaFisica)cliente).setCpf(JOptionPane.showInputDialog("CPF..."));
            strTmp = JOptionPane.showInputDialog("Data de nascimento...");
            ((PessoaFisica)cliente).setDataNascimento(sdf.parse(strTmp));
        } else {
            ((PessoaJuridica)cliente).setCnpj(JOptionPane.showInputDialog("CNPJ..."));
            ((PessoaJuridica)cliente).setInscricaoEstadual(JOptionPane.showInputDialog("IE..."));
        }
       
        Veiculo v1 = new Veiculo();
        v1.setId(Integer.parseInt(JOptionPane.showInputDialog("**Cadastro do Veículo 1**" + "\n" + "Id... ")));
        v1.setPlaca((JOptionPane.showInputDialog("**Cadastro do Veículo 1**" + "\n" + "Placa... ")));
        v1.setObservacoes((JOptionPane.showInputDialog("**Cadastro do Veículo 1**" + "\n" + "Observação... ")));
        v1.setModelo(mod2);
        v1.setCor(c1);
        v1.setCliente(cliente);
        
        Veiculo v2 = new Veiculo();
        v2.setId(Integer.parseInt(JOptionPane.showInputDialog("**Cadastro do Veículo 2**" + "\n" + "Id... ")));
        v2.setPlaca((JOptionPane.showInputDialog("**Cadastro do Veículo 2**" + "\n" + "Placa... ")));
        v2.setObservacoes((JOptionPane.showInputDialog("**Cadastro do Veículo 2**" + "\n" + "Observação... ")));
        v2.setModelo(mod1);
        v2.setCor(c2);
        v2.setCliente(cliente);
     
        imprimir(cliente);
    }

    private static void imprimir(Cliente c) {
        System.out.println("*** Dados do cliente e seus veículos ****");
        System.out.println(c.getDados());
    }
    
    private static void imprimir(Veiculo v) {
        JOptionPane.showMessageDialog(null, v.getDados());
    }
}
