import javax.swing.JOptionPane;

public class Ejercicio1 extends Ejercicio {
    public Ejercicio1() {
        super("Invertir una Cadena", "Invierte el texto ingresado por el usuario.");
    }

    @Override
    public void ejecutar() {
        String str = JOptionPane.showInputDialog("Ingrese el texto a invertir:");
        if (str != null) {
            String reversed = new StringBuilder(str).reverse().toString();
            JOptionPane.showMessageDialog(null, "Original: " + str + "\nInvertida: " + reversed);
        }
    }
}