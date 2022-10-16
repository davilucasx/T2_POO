package principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		float sal, imp = 0, aum = 0, novoSal = 0;
		int loop,op;
		Scanner sc = new Scanner(System.in);
		
		do{
		System.out.println("------------------------------------");
		System.out.println("menu de opções");
		System.out.println("[1] imposto");
		System.out.println("[2] novo salario");
		System.out.println("[3] classificação");
		System.out.println("[4] finalizar o programa");
		System.out.println("digite a opção desejda: ");
		op = sc.nextInt();
		if(op > 4 || op < 1) {
			System.out.println("opção invalida!");
		}
			if(op == 1) {
				System.out.println("didigite o seu salario: ");
				sal = sc.nextFloat();
				if(sal < 500) {
					imp = sal * 5/100;
				}
					if(sal>= 500 && sal <= 950) {
						imp = sal *10/100;
					}
						if(sal > 950) {
							imp = sal * 15/100;
						}
						System.out.println("o imposto é " + imp);
					}
		if(op == 2) {
			System.out.println("digite o seu salario: ");
			sal = sc.nextFloat();
			if(sal > 1500) {
				aum = 25;
			}
				if(sal >= 750 && sal <= 1500) {
					aum = 50;
				}
					if(sal >= 450 && sal < 750) {
						aum = 75;
					}
						if(sal < 450) {
							aum = 100;
						}
						novoSal = sal + aum;
						System.out.println(" o novo salario é " + novoSal);
		}
		if(op == 3) {
			System.out.println("digite o seu salario: ");
			sal = sc.nextFloat();
			if(sal <= 700){
				System.out.println("mal remunerado");
			}
		   
			else {
				System.out.println("bem remunerado");
			}
		}
		if(op == 4) {
			System.out.println("programa finalizado!");
			
		}
		System.out.println("------------------------------------");
		System.out.println("[1] Para repetir o programa novamente \n[2] Para finalizar o programa");
		loop = sc.nextInt();
		}
		while(loop == 1);
	}
}