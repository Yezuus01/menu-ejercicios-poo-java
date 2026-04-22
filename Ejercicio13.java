import javax.swing.JOptionPane;

public class Ejercicio13 extends Ejercicio {
    public Ejercicio13() {
        super("Contar Carácter", "Cuenta cuántas veces aparece una letra específica en una frase.");
    }

    @Override
    public void ejecutar() {
        String str = JOptionPane.showInputDialog("Ingrese la frase:");
        String charInput = JOptionPane.showInputDialog("Ingrese el carácter a buscar:");

        if (str != null && charInput != null && !charInput.isEmpty()) {
            char ch = charInput.charAt(0);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) count++;
            }
            JOptionPane.showMessageDialog(null, "El carácter '" + ch + "' aparece " + count + " veces.");
        }
    }
}