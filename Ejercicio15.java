import javax.swing.JOptionPane;

public class Ejercicio15 extends Ejercicio {
    public Ejercicio15() {
        super("Suma de Dígitos", "Suma cada cifra de un número (ej: 123 -> 1+2+3 = 6).");
    }

    @Override
    public void ejecutar() {
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            int original = num;
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            JOptionPane.showMessageDialog(null, "La suma de los dígitos de " + original + " es: " + sum);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el número.");
        }
    }
}