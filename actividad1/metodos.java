package actividad1;

import javax.swing.JOptionPane;

public class metodos {

    public double[] calcular(double[] x) {

        double numeromayor = x[0];
        double numeromenor = 0;
        int cantidadN = 0;
        double sumatotal = 0;
        double comodin = x[0];

        for (double i : x) {

            if (i > numeromayor) {

                numeromayor = i;
            }

            if (i < comodin) {
                comodin = i;
                numeromenor = comodin;
            }

            cantidadN++;

            sumatotal += i;

        }

        double promedi = sumatotal / cantidadN;
        double[] valores = { promedi, numeromayor, numeromenor };

        JOptionPane.showMessageDialog(null, "numero mas alto    " + numeromayor
                + "\nnumero menos " + numeromenor
                + "\nPROMEDIO  " + promedi);

        return valores;
    }
}