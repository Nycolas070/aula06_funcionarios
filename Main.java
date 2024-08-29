package principal;

import java.util.Scanner;

import entidade.Clt;
import entidade.Funcionario;
import entidade.Pj;
import enums.Cargo;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Colocar o nome: ");
		String name = scn.next();
		System.out.println("Colocar seu salário");
		double salary = scn.nextDouble();
//		System.out.println("Colocar seu cargo pj ou clt");
//		String cargo = scn.next();
		
		System.out.println("Digite sua profissão [p]Professor, [C]Contador, [D]DEV: ");
		
		String choose = scn.next();
		
		if(choose.contains("p") ) {
			Pj pj = new Pj(name,salary,Cargo.PROFESSOR);
			Clt clt = new Clt(name,salary,Cargo.PROFESSOR);
			System.out.println("Clt ou Pj");
			String cargos = scn.next();			
			if(cargos.contains("Clt")) {
				System.out.println( clt + " CLT = " + clt.receber(salary));
			}else if(cargos.contains("Pj")) {
				System.out.println(pj + " = " + pj.receber1(salary));
			}
		}else if(choose.contains("c") ) {
			Funcionario funcionario = new Funcionario(name,salary,Cargo.CONTADOR);
		}else if(choose.contains("d")) {
			Funcionario funcionario = new Funcionario(name,salary,Cargo.DEV);
		}

		

		
		
	}

}