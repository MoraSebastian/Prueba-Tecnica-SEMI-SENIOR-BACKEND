import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String coordenada1Entrada = sc.nextLine();
		String coordenada2Entrada = sc.nextLine();
		
		String[] coordenada1Separadas = coordenada1Entrada.split(" ");
		String[] coordenada2Separadas = coordenada2Entrada.split(" ");
		
		float x1 = Float.parseFloat(coordenada1Separadas[0]);
		float y1 = Float.parseFloat(coordenada1Separadas[1]);
		int r1 = Math.abs(Integer.parseInt(coordenada1Separadas[2]));
		
		float x2 = Float.parseFloat(coordenada2Separadas[0]);
		float y2 = Float.parseFloat(coordenada2Separadas[1]);
		int r2 = Math.abs(Integer.parseInt(coordenada2Separadas[2]));
		
		double distanciaEntreCoordenadas = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );
		if (distanciaEntreCoordenadas <= (r1 + r2) ){
		    System.out.println("SI");
		}else{
		    System.out.println("NO");
		}
	}
}
