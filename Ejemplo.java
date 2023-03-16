package Depuracion;
//Pide dos numeros por pantalla y hace una operación diferente con ellos

import java.util.Scanner;

public class Ejemplo {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, suma, resta, prod, divEntera, resto, potEntera;
		double  divReal,potencia;
		System.out.println("introduce a y b");
		//Nos permite acceder a los metodos, porque es publico
		a=LeerTeclado.readInteger();
		b=LeerTeclado.readInteger();
		suma=a+b;
		resta=a-b;
		prod=a*b;
		divEntera=a/b;
		resto=a%b;
		//double son 64 bit
		divReal=(double)a/b;
		//Realiza una potencia
		potencia=Math.pow(a, b);
		//Eleva un número a otro
		potEntera=power(a, b);s
		double f=factorial(a); //llamamos a un método estático que calcula el factorial de a
		
		
		System.out.println("suma="+suma);
		System.out.println("resta="+resta);
		System.out.println("producto="+prod);
		System.out.println("cociente division entera="+divEntera+" y resto="+resto);
		System.out.println("cociente division real="+divReal);
		System.out.println("Potencia de a elevado a b="+potEntera);
		System.out.println("Potencia de a elevado a b="+potencia);
		
		
		//Cálculo de la potencia
		System.out.println("Potencia de a elevado a b mediante método3="+potEntera);
	}
	
	static double factorial (int num) {
		double fact=1;
		for (int i=1; i<=num; i++)
			fact*=i;
		return fact;
	}
	
	static int power(int a, int b) {
		int aux=1;
		//se decide cuantas vueltas se da en el i
		for(int i=0; i<b; i++) {
			aux=aux*a;
		}
		return aux;
	}
	
	public void CargarValores(){
	   System.out.println("Me llamo pepi");
	  
		
	}
	
	public void valor(){
		  
	}
}
