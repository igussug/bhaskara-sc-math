package matematica;
import java.util.Scanner;

public class bhaskara {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os valores de a, b e c:");
		
		double a = sc.nextDouble();
		double b = sc.nextDouble(); //Valores de a/b/c, depositados
		double c = sc.nextDouble(); 
		
		double delta; //Resultado da equa��o b�-4ac
		double x1,x2; //x1 = resultado "somado", x2 = resultado "subtraido"
		
		delta = Math.pow(b, 2.0) - 4 * a * c; //Equa��o usada para encontrar o valor de delta
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a); //"Positivo"
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a); //"Subtra��o"
		
		System.out.println("O valor de delta �: " + delta); //Saida de delta
		System.out.println("O valor de x positivo �: " + x1); //Saida de x
		System.out.println("O valor de x subtraido �: " + x2); //Saida de x
		
		sc.close();
		}
}