import javax.swing.JOptionPane;

public class Ejercicio7 extends Ejercicio {
    public Ejercicio7() {
        super("Encontrar Duplicados", "Busca números repetidos en una lista predefinida.");
    }

    @Override
    public void ejecutar() {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8};
        StringBuilder duplicados = new StringBuilder("Elementos duplicados:\n");

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicados.append(arr[j]).append("\n");
                }
            }
        }
        JOptionPane.showMessageDialog(null, duplicados.toString());
    }
}