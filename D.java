import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int numero = Math.abs(Integer.parseInt(sc.nextLine()));
	    int tamNumero = Integer.toString( numero ).length();
	   
		double cuadrado = Math.pow(numero, 2);
		System.out.println( cuadrado );
		int tamCuadrado = Integer.toString( (int) cuadrado ).length() ;
		
		String ultimoDigitoCStr = Integer.toString((int) cuadrado);
		String ultimoDigitoChar = ultimoDigitoCStr.substring( tamCuadrado - tamNumero, tamCuadrado );
		int ultimoDigitoInt = Integer.parseInt(String.valueOf(ultimoDigitoChar));
		System.out.println( ultimoDigitoChar );
		if ( ultimoDigitoInt == numero ){
		    System.out.println("SI");
		}else{
		    System.out.println("NO");
		}
		
	}
}
