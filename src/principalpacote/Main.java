/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalpacote;

/**
 *
 * @author WINDOWS
 */
public class Main {
  
    public static void main(String[] args) { 
      java.util.Scanner in = new java.util.Scanner(System.in);
    Cadastro cadastro = new Cadastro();
    int opcao = 5;
    while (opcao != 0) {
      System.out.println("Escolha");
      System.out.println("1 - Para Cadastrar");
      System.out.println("2 - Para Deletar");
      System.out.println("3 - Para Listar");
      System.out.println("0 - Para Sair");
      opcao = in.nextInt();
      switch (opcao) {
      case 1: 
       poo.com.atividades.sistema.Funcionario funcionario= new poo.com.atividades.sistema.Funcionario();
        System.out.println("----------------------------------------");
        System.out.println("Codigo: ");
        funcionario.setCodigo(in.nextInt());
        System.out.println("Nome: ");
        funcionario.setNome(in.next());
        System.out.println("Idade: ");
        funcionario.setIdade(in.nextInt());
        System.out.println("Setor: ");
        funcionario.setSetor(in.next());
        System.out.println("----------------------------------------");
        cadastro.cadastraFuncionario(funcionario);
        break;
      case 2: 
        System.out.println("----------------------------------------");
        System.out.println(" digite o Codigo do Funcionarioque deseja excluir");
        cadastro.excluiFuncionario(in.nextInt());
        System.out.println("----------------------------------------");
        break;
      case 3: 
        cadastro.listarFuncionario();
      }
    }
  }
}

