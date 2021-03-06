import java.util.*;

public class Gravitacija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double visina = sc.nextDouble();
        
        polnIzpis(visina);
    }
    
    public static void polnIzpis(double nadmorskaVisina) {
        System.out.println("Nadmorska višina: " + nadmorskaVisina + "Pospešek: " + pospesek(nadmorskaVisina));
    }

    private static double pospesek(double visina) {
        final double konstanta = 6.674 * Math.pow(10, -11);
		final double masa = 5.972 * Math.pow(10, 24);
		final double polmer = 6.371 * Math.pow(10, 6);
		
		return (konstanta * masa) / ((polmer + visina) * (polmer + visina)); 
	}
}