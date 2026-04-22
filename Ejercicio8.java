import javax.swing.JOptionPane;
import java.util.Arrays;

public class Ejercicio8 extends Ejercicio {
    public Ejercicio8() {
        super("Verificar Anagramas", "Revisa si dos palabras tienen las mismas letras.");
    }

    @Override
    public void ejecutar() {
        String s1 = JOptionPane.showInputDialog("Primera palabra:");
        String s2 = JOptionPane.showInputDialog("Segunda palabra:");

        if (s1 == null || s2 == null) return;

        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean esAnagrama = Arrays.equals(arr1, arr2);
        JOptionPane.showMessageDialog(null, esAnagrama ? "Son anagramas." : "No son anagramas.");
    }
}
