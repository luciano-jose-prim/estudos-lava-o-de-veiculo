/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author luciano
 */
public class Relatorio {
    public String imprimir(Cliente cliente) {
        StringBuilder sb = new StringBuilder();
        if (cliente instanceof PessoaFisica) {
            sb.append("**** PESSOA FÍSICA ****").append("\n");
        } else {
            sb.append("**** PESSOA JURIDICA ****").append("\n");
        }
        sb.append(cliente.getDados());
        return sb.toString();
    }
}
