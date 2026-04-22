import javax.swing.JOptionPane;

public class Ejercicio16 extends Ejercicio {
    public Ejercicio16() {
        super("Número Armstrong", "Verifica si el número es igual a la suma de sus dígitos al cubo.");
    }

    @Override
    public void ejecutar() {
        try {
            String input = JOptionPane.showInputDialog("Ingrese un número (ejemplo: 153):");
            if (input == null) return;

            int num = Integer.parseInt(input);
            int originalNum = num;
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, 3);
                num /= 10;
            }

            if (originalNum == sum) {
                JOptionPane.showMessageDialog(null, originalNum + " es un número Armstrong.");
            } else {
                JOptionPane.showMessageDialog(null, originalNum + " no es un número Armstrong.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Por favor ingrese un número entero.");
        }
    }
}