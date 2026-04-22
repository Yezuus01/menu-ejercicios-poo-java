import javax.swing.JOptionPane;

public class Ejercicio2 extends Ejercicio {
    public Ejercicio2() {
        super("Verificar Palíndromo", "Revisa si una palabra se lee igual al derecho y al revés.");
    }

    @Override
    public void ejecutar() {
        String str = JOptionPane.showInputDialog("Ingrese una palabra:");
        if (str != null) {
            String reversed = new StringBuilder(str).reverse().toString();
            String mensaje = str.equalsIgnoreCase(reversed) ? "Es un palíndromo." : "No es un palíndromo.";
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
}