import javax.swing.JOptionPane;

public class Ejercicio3 extends Ejercicio {
    public Ejercicio3() {
        super("Contar Vocales y Consonantes", "Cuenta cuántas hay en una frase.");
    }

    @Override
    public void ejecutar() {
        String str = JOptionPane.showInputDialog("Ingrese una frase:");
        if (str == null) return;

        int vocales = 0, consonantes = 0;
        String temp = str.toLowerCase();
        for (int i = 0; i < temp.length(); i++) {
            char ch = temp.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) vocales++;
                else consonantes++;
            }
        }
        JOptionPane.showMessageDialog(null, "Frase: " + str + "\nVocales: " + vocales + "\nConsonantes: " + consonantes);
    }
}