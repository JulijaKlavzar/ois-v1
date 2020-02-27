public class Gravitacija {
    public static void main(String[] args) {
        System.out.println("OIS je zakon!");
    }

    private static double pospesek(double visina) {
        final double konstanta = 6.674 * Math.pow(10, -11);
		final double masa = 5.972 * Math.pow(10, 24);
		final double polmer = 6.371 * Math.pow(10, 6);
		
		return (konstanta * masa) / ((polmer + visina) * (polmer + visina)); 
	}
}
