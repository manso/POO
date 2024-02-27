//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
//::                                                                         ::
//::     Antonio Manuel Rodrigues Manso                                      ::
//::                                                                         ::
//::     I N S T I T U T O    P O L I T E C N I C O   D E   T O M A R        ::
//::     Escola Superior de Tecnologia de Tomar                              ::
//::     e-mail: manso@ipt.pt                                                ::
//::     url   : http://orion.ipt.pt/~manso                                  ::
//::                                                                         ::
//::     This software was build with the purpose of investigate and         ::
//::     learning.                                                           ::
//::                                                                         ::
//::                                                               (c)2024   ::
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//////////////////////////////////////////////////////////////////////////////
package codigoaula01;

import java.util.Scanner;

/**
 * Created on 20/02/2024, 14:23:14
 *
 * @author manso - computer
 */
public class Code11_decisaoMultipla1 {

    //teclado
    static Scanner keyb = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Introduza um número : ");
        int i = keyb.nextInt();
        if (i < 0) {
            System.out.println("Negativo");
        } else if (i == 0) {
            System.out.println("Nulo");
        } else {
            System.out.println("Positivo");
        }

    }

}
