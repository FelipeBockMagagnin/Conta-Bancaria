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
public class Pessoa {
  // atributos
  private String cpf;
  private String nome;
  private int idade;
  private boolean vivo = true;
  private int IDADE_MAX = 130;

  
  // métodos
  Pessoa(String nomeInicial, int idadeInicial) {
    // idade da pessoa no momento do registro
    idade = idadeInicial;
    nome = nomeInicial;
  }
  
  public void setCpf(String cpf) {
    // aqui teriamos que colocar um código que verifica se o cpf é valido!
    // (caso não seja válido, deverá informar o usuário e deixar cpf inalterado)
    // algo como:
    // if (validaCpf(cpf)) {
    //   this.cpf = cpf;
    // } else {
    //   System.out.println("CPF inválido!");
    // }
    // podemos verificar também se pessoa já possui um cpf, nesse caso, não
    // poderiamos alterar o cpf.
    this.cpf = cpf;
  }
  
  public String getCpf() {
    return cpf;
  }
  
  public int getIdade() {
    return idade;
  }
  
  public void setIdade(int idade) {
    if (idade > IDADE_MAX) {
      System.out.println("Idade máxima atingida!");
    } else {
      this.idade = idade;
    }
  }
  
  private boolean validaCpf(String cpfTentativa) {
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
