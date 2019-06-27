package br.com.prog2.rh.view;
import java.sql.Connection;
import br.com.prog2.rh.controller.EmpregadoController;
import br.com.prog2.rh.negocio.Empregado;
import br.com.prog2.rh.persistencia.ConnectionFactory;

public class Teste {
public static void main(String[] args) {
Connection con = ConnectionFactory.getConnection();
if(con != null){
System.out.println("OK");
ConnectionFactory.close(con);
}
Empregado emp = new Empregado();
EmpregadoController controller = new EmpregadoController();
emp.setCpf("11111");
emp.setNome("Maria da Silva");
emp.setIdade(25);
emp.setSalario(2500.0);
emp = controller.pesquisarPorCpf("11111");
if (emp != null) {
System.out.println("CPF: " + emp.getCpf());
System.out.println("Nome: " + emp.getNome());
System.out.println("Idade: " + emp.getIdade());
System.out.println("Salário: " + emp.getSalario());
}
}
}