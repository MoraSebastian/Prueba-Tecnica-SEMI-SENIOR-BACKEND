import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int tamanoProtector = Integer.parseInt(sc.nextLine());
		int decrementar = tamanoProtector;
		int acumuladorDiagonal = 0;
		
		for (int i = 1; i<=tamanoProtector; i++){
		    acumuladorDiagonal += decrementar;
		    for(int j = 1; j <= tamanoProtector; j++ ){
		        if ( j < decrementar ){
		            System.out.print( 1 + " " );            
		        } else if( j == decrementar ){
		            System.out.print( decrementar + " " );        
		        } else{
		            System.out.print( 0 + " " );        
		        }
		    }
		    System.out.println();
		    decrementar-=1;
		}
		
		System.out.println(acumuladorDiagonal);
		
	}
}
