import javax.swing.JOptionPane;

public class Ejercicio10 extends Ejercicio {
    public Ejercicio10() {
        super("Serie de Fibonacci", "Genera la secuencia hasta el número de términos indicado.");
    }

    @Override
    public void ejecutar() {
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos términos desea generar?"));
            StringBuilder sb = new StringBuilder("Serie: ");
            int a = 0, b = 1;

            for (int i = 0; i < n; i++) {
                sb.append(a).append(i < n - 1 ? ", " : "");
                int sig = a + b;
                a = b;
                b = sig;
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
        }
    }
}