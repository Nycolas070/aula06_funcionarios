package entidade;

import enums.Cargo;

//import entidade.Funcionario;
public class Clt extends Funcionario {


	public Clt(String nome, double salario, Cargo cargo) {
		super(nome, salario, cargo);
		// TODO Auto-generated constructor stub
	}

	private double convenio;
	
	public double convenio1(double money) {
		convenio = money;
		return receber( convenio) ;
	}
}