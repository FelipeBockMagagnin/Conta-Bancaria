/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;


import java.util.ArrayList;

/**
 *
 * @author Felpi
 */
public class ContaBancaria {
    
    private double saldo = 0;
    public  double limiteSaque = 1000;
    private double taxaSaque;
    public  String nomeCliente;
    private String cpfCliente;
    private String numero;  
    
    ArrayList<String> historico = new ArrayList();
    
    ContaBancaria(String nome, String telefone, String cpf){
        nomeCliente = nome;
        numero = telefone;
        cpfCliente = cpf;        
    }
    
    public String getTelefone(){
        return numero; 
    }
    
    void resumoConta(){
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Numero do telefone: " + numero);
        System.out.println("Cpf do cliente: " + cpfCliente);
    }
    
    void deposita(double valor){
        if(valor <= limiteSaque){
            saldo = saldo + valor;
            System.out.println("Foram depositados " + valor + " reias");
            historico.add("Foram depositados " + valor + " reias");
        } else {
            System.out.println("Não é possivel depositar valor acima de " + limiteSaque);
        }
        modificaTaxaSaque();
    }
    
    void saque(double valor){        
        modificaTaxaSaque();        
        if(valor <= saldo){
            this.saldo = saldo - valor;
            System.out.println("Saque de " + valor + " reais realizado com sucesso");
            historico.add("Saque de " + valor + " reais realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }        
    }
    
    void consultaHistorico(){       
        for(String s : historico){
            System.out.println(s);            
        }        
    }
    
    void verSaldo(){
        System.out.println("O saldo é: " + saldo);
    }
    
    void modificaTaxaSaque(){
        if(saldo >= 10000){
            taxaSaque = 4;
        } else if (saldo >= 1000){
            taxaSaque = 3.5;
        } else {
            taxaSaque = 3;
        }
    }    
}
