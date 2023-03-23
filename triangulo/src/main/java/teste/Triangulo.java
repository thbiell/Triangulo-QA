package teste;

public class Triangulo {
	String equilatero, isoceles, escaleno;
	public String test(int a, int b,int c) {
		if(a==b && a==c&& c ==b) {
			return "equilatero";
		}if(a == b || a == c || b == c) {
			return "isoceles";
		}else {
			return "escaleno";
		}
		
	}

}
