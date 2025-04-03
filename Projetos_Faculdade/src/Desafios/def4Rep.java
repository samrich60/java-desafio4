package Desafios;

import java.util.Locale;
import java.util.Scanner;

public class def4Rep {

	public static void main(String[] args) {

		 	Scanner sc = new Scanner(System.in);
	        Locale.setDefault(Locale.US);
	        
	        System.out.print("Digite seu salário: ");
	        
	        while (true) {	
	       
	        	double salario = sc.nextDouble();
	        	
	        	if (salario <= 0) {
	                System.out.println("\nSalario não pode ser negativo!");
	                System.out.print("Digite novamente: ");
	                continue;
	                
	        }
	        
	        	double aumento = 0;
	        	double percentualAumento = 0;

	        	if (salario <= 280) {
	        		percentualAumento = 20;
	        		aumento = salario * 0.20;
	        	} else if (salario > 280 && salario <= 700) {
	        		percentualAumento = 15;
	        		aumento = salario * 0.15;
	        	} else if (salario > 700 && salario <= 1500) {
	        		percentualAumento = 10;
	        		aumento = salario * 0.10;
	        	} else {
	        		percentualAumento = 5;
	        		aumento = salario * 0.05;
	        	}

	        	double salarioNovo = salario + aumento;

	        	double infla = salario * 0.038;

	        	double aumentoReal = aumento - infla;

	        	System.out.println("\n--- Resultado do Reajuste ---");
	        	System.out.printf("Salário antes do reajuste: R$ %.2f\n", salario);
	        	System.out.printf("Percentual de aumento aplicado: %.0f%%\n", percentualAumento);
	        	System.out.printf("Valor do aumento: R$ %.2f\n", aumento);
	        	System.out.printf("Novo salário após o aumento: R$ %.2f\n", salarioNovo);
	        	System.out.printf("Valor do aumento real (descontando a inflação de 3,8%%): R$ %.2f\n", aumentoReal);

	        	break;
	        }
	        		
	        sc.close();
	        
	}

}
