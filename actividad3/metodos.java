package actividad3;

import javax.swing.JOptionPane;

public class metodos {
    // profe me dio flojera hacerlo de tipo retorno
    public void calculosgoticos(int[] x) {

        int mayortiempo = x[0];
        int menortiempo = x[0];
        int suma = 0, promedio = 0;
        int cant = 0;

        for (int i : x) {

            if (i > mayortiempo) {
                mayortiempo = i;
            }

            if (i < menortiempo) {
                menortiempo = i;
            }
            suma += i;
            cant++;
            promedio = suma / cant;
        }

        JOptionPane.showMessageDialog(null, "MAYOR TIEMPO       " + mayortiempo
                + "\nMENOR TIEMPO                                       " + menortiempo
                + "\nSUMA TOTAL TIEMPOS                         " + suma
                + "\nCANTIDAD DE PARTICIPANTES          " + cant
                + "\nPROMEDIO                                                 " + promedio

        );
    }
}
