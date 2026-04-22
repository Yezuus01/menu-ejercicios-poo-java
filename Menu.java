import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Menu {
    private ArrayList<Ejercicio> ejercicios = new ArrayList<>();

    public void agregarEjercicio(Ejercicio ej) {
        ejercicios.add(ej);
    }

    public void iniciar() {
        int opcion = -1;
        while (opcion != 0) {
            StringBuilder sb = new StringBuilder("--- MENÚ DE EJERCICIOS ---\n");
            for (int i = 0; i < ejercicios.size(); i++) {
                sb.append((i + 1)).append(". ").append(ejercicios.get(i).getNombre()).append("\n");
            }
            sb.append("0. Salir\n\nSeleccione una opción:");

            String input = JOptionPane.showInputDialog(null, sb.toString());
            if (input == null) break;

            try {
                opcion = Integer.parseInt(input);
                if (opcion > 0 && opcion <= ejercicios.size()) {
                    ejercicios.get(opcion - 1).ejecutar();
                } else if (opcion != 0) {
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
            }
        }
    }
}
