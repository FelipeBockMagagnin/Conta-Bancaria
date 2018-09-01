/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplovisibilidade;

/**
 *
 * @author darolt
 */
public class PessoaDesprotegida {
  // atributos
  String cpf;
  String nome;
  int idade;
  boolean vivo = true;

  // métodos
  PessoaDesprotegida(String nomeInicial, int idadeInicial) {
    // idade da pessoa no momento do registro
    idade = idadeInicial;
    nome = nomeInicial;
  }
  
  boolean validaCpf(String cpfTentativa) {
    /*
    if (cpfTentativa é válido) {
      cpf = cpfTentativa;
      return true;
    } else {
      return false;
    }
    */
    return true;
  }
  
}
