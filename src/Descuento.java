
package extra_boletin3_1;

import java.util.Scanner;


public class Extra_boletin3_1 {


    public static void main(String[] args) {
        // TODO code application logic here
        float compra,rebaja,prcfinal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte el precio:");
        compra = sc.nextFloat();
        System.out.println("Inserte la rebaja a realizar:");
        rebaja = sc.nextFloat();
        prcfinal = -(rebaja*compra/100-compra);
        System.out.println("precio rebajado = "+prcfinal+" €");

    }

}