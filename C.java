import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int noCasosPrueba = Math.abs(Integer.parseInt(sc.nextLine()));
		String entradas[] = new String[noCasosPrueba];
		
		for ( int i = 0; i < noCasosPrueba; i++ ){
		    entradas[i] = sc.nextLine();
		}
		
		for ( int i = 0; i < noCasosPrueba; i++ ){
		    String[] entradasSeparadas = entradas[i].split(" ");
		    int x = Math.abs(Integer.parseInt(entradasSeparadas[0]));
		    int y = Math.abs(Integer.parseInt(entradasSeparadas[1]));
		    
		    int multi = x*y;
		    if ( Integer.toString(multi).length() == 5){
		        System.out.println("NO");
		    }else{
		        System.out.println("SI");
		    }
		    
		}
		
		
	}
}
