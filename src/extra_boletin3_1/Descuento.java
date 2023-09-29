
package extra_boletin3_1;

import java.util.Scanner;

class Extra_boletin3_1 {


    public static void main(String[] args) {


        float compra,rebaja,prcfinal;

        //Imputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el precio:");
        compra = sc.nextFloat();
        System.out.println("Inserte la rebaja a realizar:");
        rebaja = sc.nextFloat();

        //Operaciones
        prcfinal = -(rebaja*compra/100-compra);
        System.out.println("precio rebajado = "+prcfinal+" €");
        System.out.println("UwU");
    }

}