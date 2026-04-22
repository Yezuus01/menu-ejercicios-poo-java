import javax.swing.JOptionPane;
import java.util.Arrays;

public class Ejercicio9 extends Ejercicio {
    public Ejercicio9() {
        super("Segundo Más Grande", "Encuentra el segundo valor más alto en un arreglo.");
    }

    @Override
    public void ejecutar() {
        int[] arr = {1, 5, 2, 9, 3, 7}; // Datos del PDF
        Arrays.sort(arr);
        int segundo = arr[arr.length - 2];

        JOptionPane.showMessageDialog(null, "Arreglo: " + Arrays.toString(arr) +
                "\nEl segundo más grande es: " + segundo);
    }
}
