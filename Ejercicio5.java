import javax.swing.JOptionPane;

public class Ejercicio5 extends Ejercicio {
    public Ejercicio5() {
        super("Mayor de Tres Números", "Compara tres números y encuentra el más grande.");
    }

    @Override
    public void ejecutar() {
        try {
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Número 1:"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Número 2:"));
            int n3 = Integer.parseInt(JOptionPane.showInputDialog("Número 3:"));

            int mayor = (n1 > n2) ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);

            JOptionPane.showMessageDialog(null, "El mayor de los tres es: " + mayor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en los datos ingresados.");
        }
    }
}