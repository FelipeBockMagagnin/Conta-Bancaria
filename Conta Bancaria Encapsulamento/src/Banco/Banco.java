package Banco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Felpi
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        
        Scanner scan = new Scanner(System.in);
        
        String nome, cpf, numero;
        int idade, input;
        boolean finalizar = false;
   
        System.out.print("Digite seu nome: ");
        nome = scan.next();
        System.out.print("Digite sua idade: ");
        idade = scan.nextInt();
        System.out.println("Digite seu numero de telefone: ");
        numero = scan.next();
        
        //pessoa criada com sucesso
        Pessoa pessoa = new Pessoa(nome, idade);
        
        
        System.out.print("Escreva seu cpf (sem caracteres especiais): ");
        cpf = scan.next();
        
        pessoa.setCpf(cpf);                
        
        ContaBancaria conta = new ContaBancaria(nome,numero,pessoa.getCpf());
        System.out.println("Conta criada com sucesso");
        
        while(!finalizar){            
            System.out.println("Que operaçao deseja realizar");
            System.out.println("1 - depositar");
            System.out.println("2 - saque");
            System.out.println("3 - consultaHistorico");
            System.out.println("4 - verSaldo");
            System.out.println("5 - modificaTaxaSaque");
            System.out.println("0 - finalizar programa");
            input = scan.nextInt();
            
            switch(input){
                case 0:
                    System.out.println("Obrigado por utilizar nossos serviços");
                    finalizar = true;
                    break;
                case 1:
                    System.out.println("Quanto deseja depositar?");
                    double deposito;
                    deposito = scan.nextDouble();
                    conta.deposita(deposito);
                    break;
                case 2:
                    System.out.println("Quanto deseja sacar?");
                    double saque;
                    saque = scan.nextDouble();
                    conta.saque(saque);
                    break;
                case 3:
                    conta.consultaHistorico();
                case 4:
                    conta.verSaldo();
                case 5:
                    conta.modificaTaxaSaque();
            }
        }            
    }   
}
