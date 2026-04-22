import javax.swing.JOptionPane;

public class Ejercicio6 extends Ejercicio {
    public Ejercicio6() {
        super("Intercambiar Números", "Intercambia dos valores sin usar una variable temporal.");
    }

    @Override
    public void ejecutar() {
        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor A:"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor B:"));

            String antes = "Antes: a = " + a + ", b = " + b;

            // Lógica aritmética del PDF
            a = a + b;
            b = a - b;
            a = a - b;

            String despues = "Después: a = " + a + ", b = " + b;
            JOptionPane.showMessageDialog(null, antes + "\n" + despues);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error en los datos.");
        }
    }
}