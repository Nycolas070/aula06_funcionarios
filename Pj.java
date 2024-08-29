package entidade;

import enums.Cargo;

//import entidade.Funcionario;
public class Pj extends Funcionario {


	public Pj(String nome, double salario, Cargo cargo) {
		super(nome, salario, cargo);
		// TODO Auto-generated constructor stub
	}

	private double adicional;
	
	public  double receber1(double money ) {
		adicional = money;
		return receber(adicional) * 0.90;
	}
}