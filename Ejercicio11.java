import javax.swing.JOptionPane;

public class Ejercicio11 extends Ejercicio {
    public Ejercicio11() {
        super("Verificar Número Primo", "Revisa si un número es solo divisible por 1 y por sí mismo.");
    }

    @Override
    public void ejecutar() {
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            boolean isPrime = num > 1;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, num + (isPrime ? " es primo." : " no es primo."));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.");
        }
    }
}