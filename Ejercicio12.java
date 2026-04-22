import javax.swing.JOptionPane;

public class Ejercicio12 extends Ejercicio {
    public Ejercicio12() {
        super("Factorial de un Número", "Calcula el producto de todos los números desde 1 hasta N.");
    }

    @Override
    public void ejecutar() {
        try {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            JOptionPane.showMessageDialog(null, "El factorial de " + num + " es: " + factorial);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en el dato.");
        }
    }
}