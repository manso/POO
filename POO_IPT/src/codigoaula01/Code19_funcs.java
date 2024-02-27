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
 * Created on 20/02/2024, 14:42:35
 *
 * @author manso - computer
 */
public class Code19_funcs {

    static Scanner keyb = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("numero : ");
        int i = keyb.nextInt();
        if (isPar(i)) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

    }

    public static boolean isPar(int i) {
        return i % 2 == 0;
    }

}
