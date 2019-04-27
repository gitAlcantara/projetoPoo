/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principalpacote;

import java.util.List;
import poo.com.atividades.sistema.Funcionario;

public class Cadastro {

  List<Funcionario> colaborador = new java.util.ArrayList();
  
  public Cadastro() {}
  
  public void cadastraFuncionario(Funcionario funcionario) { 
      colaborador.add(funcionario); }
  

  public void listarFuncionario()
  {
    for (int i = 0; i < colaborador.size(); i++) {
      System.out.println("------------------------------------------------");
      System.out.println("Nome: " + ((Funcionario)colaborador.get(i)).getNome());
      System.out.println("Idade: " + ((Funcionario)colaborador.get(i)).getIdade());
      System.out.println("Codigo: " + ((Funcionario)colaborador.get(i)).getCodigo());
      System.out.println("Setor: " + ((Funcionario)colaborador.get(i)).getSetor());
      System.out.println("------------------------------------------------");
    }
  }
  
  public void excluiFuncionario(int cod) {
    for (int i = 0; i < colaborador.size(); i++) {
      if (((Funcionario)colaborador.get(i)).getCodigo() == cod) {
        colaborador.remove(i);
      }
    }
  }

    void setCodigo(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNome(String next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setIdade(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setSetor(String next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void cadastraFuncionario(Cadastro funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
  

   