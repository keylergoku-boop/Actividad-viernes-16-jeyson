package actividad2;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/*EL  COSTO TOTAL DE LA COMPRA
EL COSTO DEL PRODUCTO MAS BARATO
EL COSTO DEL PRODUCTO MAS CARO */
public class metodos {

    public int[] calculosGod(int[] x) {
        
        DecimalFormat f = new DecimalFormat("#,###,###");

        int masbarato = x[0];
        int mascaro = x[0];
        int suma = 0, promedio = 0;
        int cant = 0;

        for (int i : x) {

            if (i < masbarato) {
                masbarato = i;
            }

            if (i > mascaro) {
                mascaro = i;
            }

            suma += i;
            cant++;
            promedio = suma / cant;

        }

        int[] valores = {suma,masbarato,mascaro};
        JOptionPane.showMessageDialog(null, "MAS BARATO$:                   " + f.format(masbarato)
                + "\nMAS CARO$                                      " + f.format(mascaro)
                + "\nCANTIDAD DE PRODUCTOS              " + cant
                + "\nPROMEDIO                                       " + f.format(promedio)
                + "\nSUMA TOTAL                                     " + f.format(suma));

        return valores;
    }
}
