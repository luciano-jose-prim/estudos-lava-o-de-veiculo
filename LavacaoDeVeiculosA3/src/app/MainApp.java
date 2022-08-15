/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import entity.Cliente;
import entity.Cor;
import entity.ECategoria;
import entity.Marca;
import entity.Modelo;
import entity.PessoaFisica;
import entity.PessoaJuridica;
import entity.Veiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @luciano
 */
public class MainApp {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner entrada = new Scanner(System.in);
        
        
        
        Marca m = new Marca();
        System.out.println("*** Cadastro da Marca ***");
        System.out.print("Id: ");
        m.setId(entrada.nextInt());
        System.out.print("Nome: ");
        m.setNome(entrada.next());
        
        Modelo modelo = new Modelo();
        System.out.println("*** Cadastro do Modelo ***");
        System.out.print("Id: ");
        modelo.setId(entrada.nextInt());
        System.out.print("Descricao: ");
        modelo.setDescricao(entrada.next());
        modelo.setMarca(m);
        
        Cor cor = new Cor();
        System.out.println("*** Cadastro da cor ***");
        System.out.print("Id: ");
        cor.setId(entrada.nextInt());
        System.out.print("Nome: ");
        cor.setNome(entrada.next());
        
        System.out.println("Selecione o tipo Categoria: \n"
                + "1 - PEQUENO \n2 - MEDIO\n3 - GRANDE\n4 - MOTO\n0 - PADRAO");
        int temp = entrada.nextInt();
        switch (temp) {
            case 1: modelo.setCategoria(ECategoria.PEQUENO);break;
            case 2: modelo.setCategoria(ECategoria.MEDIO);break;
            case 3: modelo.setCategoria(ECategoria.GRANDE);break;
            case 4: modelo.setCategoria(ECategoria.MOTO);break;
            case 0: modelo.setCategoria(ECategoria.PADRAO);break;
            default: modelo.setCategoria(ECategoria.PADRAO);
        }
        
        Cliente cliente = new PessoaFisica();
        System.out.println("*** Cadastro do Cliente ***");
        System.out.print("Id: ");
        cliente.setId(entrada.nextInt());
        System.out.print("Nome: ");
        cliente.setNome(entrada.next());
        System.out.print("Celular: ");
        cliente.setCelular(entrada.next());
        System.out.print("Email: ");
        cliente.setEmail(entrada.next());
        System.out.print("Data de Cadastro: ");
        String strTmp = entrada.next();
        cliente.setDataCadastro(sdf.parse(strTmp));
        if (cliente instanceof PessoaFisica) {
            System.out.print("CPF: ");
            ((PessoaFisica)cliente).setCpf(entrada.next());
            System.out.print("Data de Nasc: ");
            strTmp = entrada.next();
            ((PessoaFisica)cliente).setDataNascimento(sdf.parse(strTmp));
        } else {
            System.out.print("CNPJ: ");
            ((PessoaJuridica)cliente).setCnpj(entrada.next());
            System.out.print("IE: ");
            ((PessoaJuridica)cliente).setInscricaoEstadual(entrada.next());
        }
        
        Veiculo v1 = new Veiculo();
        System.out.println("*** Cadastro do Veiculo ***");
        System.out.print("Id: ");
        v1.setId(entrada.nextInt());
        System.out.print("Placa: ");
        v1.setPlaca(entrada.next());
        System.out.print("Observacao: ");
        v1.setObservacoes(entrada.next());
        
        v1.setCor(cor);
        v1.setModelo(modelo);
        v1.setCliente(cliente);
        
        
        Veiculo v2 = new Veiculo();
        System.out.println("*** Cadastro do Veiculo ***");
        System.out.print("Id: ");
        v2.setId(entrada.nextInt());
        System.out.print("Placa: ");
        v2.setPlaca(entrada.next());
        System.out.print("Observacao: ");
        v2.setObservacoes(entrada.next());
        
        v2.setCor(cor);
        v2.setModelo(modelo);
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
