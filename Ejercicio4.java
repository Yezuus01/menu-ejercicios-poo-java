import javax.swing.JOptionPane;

public class Ejercicio4 extends Ejercicio {
    public Ejercicio4() {
        super("Invertir un Entero", "Toma un número y lo voltea (ej: 123 -> 321).");
    }

    @Override
    public void ejecutar() {
        try {
            String input = JOptionPane.showInputDialog("Ingrese un número entero:");
            if (input == null) return;
            int num = Integer.parseInt(input);
            int original = num;
            int invertido = 0;
            while (num != 0) {
                invertido = invertido * 10 + (num % 10);
                num /= 10;
            }
            JOptionPane.showMessageDialog(null, "Original: " + original + "\nInvertido: " + invertido);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.");
        }
    }
}