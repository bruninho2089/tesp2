package br.unibh;


import java.math.BigDecimal;
import java.util.Date;

import br.unibh.entidades.Aluno;
import br.unibh.entidades.Professor;

public class AloMundo {

	public static Long numero;
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno(new Long(1), new Long (1234), "João", "987987987", new Date());
		Aluno a2 = new Aluno(new Long(2), new Long (5789), "João", "234234234", new Date());
		Aluno a3 = new Aluno(new Long(3), new Long (1357), "Pablo", "321654987", new Date());
		Aluno a4 = new Aluno(new Long(4),7193L,"Natã");
		Professor p1 = new Professor (new Long(5),"Tite","123456789", new BigDecimal(123456));
		Professor p2 = new Professor(new Long(6),"Cuca", "11058974125");

		System.out.println("BONUS ==== "+Professor.BONUS);
		System.out.println(Aluno.verificaMatricula("123123123"));
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(p1);
		System.out.println(p2);
		
		
		/*int i =0;
		
		while (i < 10) {
		
		System.out.println(i+1+ " Alo Mundo.");
		i++;
		
			}*/
		
		
	}
}
