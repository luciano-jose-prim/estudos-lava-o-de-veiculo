/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import exceptions.ExceptionLavacao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author luciano
 */
public class OrdemServico {
    private long numero;
    private double total;
    private Date agenda;
    private double desconto;
    
    private EStatus status;
    
    private Veiculo veiculo;
    
    private List<ItemOS> itensOS;
    
    public OrdemServico() {
        this.itensOS = new ArrayList<>();
    }
    
    public OrdemServico(long numero, Date agenda, EStatus status, Veiculo veiculo) {
        this();
        this.numero = numero;
        this.agenda = agenda;
        this.status = status;
        this.veiculo = veiculo;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getAgenda() {
        return agenda;
    }

    public void setAgenda(Date agenda) {
        this.agenda = agenda;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public EStatus getStatus() {
        return status;
    }

    public void setStatus(EStatus status) {
        this.status = status;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    
    public List<ItemOS> getItensOS() {
        return itensOS;
    }
    
    public void add(ItemOS itemOS) {
        this.itensOS.add(itemOS);
        itemOS.setOrdemServico(this);
    }
    
    public void remove(ItemOS itemOs) throws ExceptionLavacao {
        if(!this.itensOS.remove(itemOs)) {
            throw new ExceptionLavacao("O item não existe");
        }
    }
    
    public double calcularServico(){
        this.total = 0;
        for (ItemOS itemOS : itensOS) {
            this.total += itemOS.getValorServico();
        }
        this.total -= this.desconto;
        return this.total;
    }
    
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getVeiculo().getDados());
        sb.append("Servicos: ").append("\n");
        for (ItemOS itemOS: getItensOS()) {
            sb.append("Nome........: " ).append(itemOS.getServico().getDescricao()).append("\n");
            sb.append("Valor.......: " ).append(itemOS.getValorServico()).append("\n");
        }
        sb.append("Total da OS: ").append(this.calcularServico()).append("\n----------------------------------");
        return sb.toString();
    }
    
    
}
