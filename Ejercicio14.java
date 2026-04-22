import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Ejercicio14 extends Ejercicio {
    public Ejercicio14() {
        super("Eliminar Duplicados", "Quita los elementos repetidos de una lista.");
    }

    @Override
    public void ejecutar() {
        Integer[] arr = {1, 2, 3, 4, 2, 7, 8, 8};
        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
        JOptionPane.showMessageDialog(null, "Original: " + Arrays.toString(arr) +
                "\nSin duplicados: " + set);
    }
}