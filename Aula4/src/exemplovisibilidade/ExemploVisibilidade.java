/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplovisibilidade;

/**
 * @author darolt
 */
public class ExemploVisibilidade {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    PessoaDesprotegida pessoa1 = new PessoaDesprotegida("Maria", 1);
    
    pessoa1.cpf = "0914"; // cpf inválido
    pessoa1.cpf = "000.000.000-00"; // outro cpf inválido
    
    pessoa1.validaCpf("000.000.000-00");
    
    // em todos os cenários podemos alterar o nome de uma pessoa?
    pessoa1.nome = "João";
    
    pessoa1.idade = 650; // idade não-realística
    
    // cpf, nome, idade e validaCpf são visíveis fora da classe
    
    
    Pessoa pessoa = new Pessoa("Carlos", 2);
    // cpf é privado, não pode ser acessado fora da classe Pessoa
    //pessoa.cpf = "123.456.789-10";
    // usamos um Setter (método que atribui valores a atributos de um objeto)
    pessoa.setCpf("123.456.789-10");
    // usamos um Getter (método que retorna um atributo que normalmente é privado)
    System.out.println(pessoa.getCpf());
    
    //pessoa.idade = 10;
    pessoa.setIdade(10);
    pessoa.setIdade(150);
    
/* 
 * Palavras reservadas para definir visibilidade:
 *             | Class | Package | Subclass | Subclass | World
 *             |       |         |(same pkg)|(diff pkg)| 
 * ————————————+———————+—————————+——————————+——————————+————————
 * public      |   +   |    +    |    +     |     +    |   +     
 * ————————————+———————+—————————+——————————+——————————+————————
 * protected   |   +   |    +    |    +     |     +    |         
 * ————————————+———————+—————————+——————————+——————————+————————
 * default     |   +   |    +    |    +     |          |    
 * ————————————+———————+—————————+——————————+——————————+————————
 * private     |   +   |         |          |          |      
 */
    
  }
  
}
