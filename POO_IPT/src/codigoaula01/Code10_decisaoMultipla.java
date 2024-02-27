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
public class Code10_decisaoMultipla {

    static Scanner keyb = new Scanner(System.in);//keyboard
    //Main Function

    public static void main(String[] args) {
        System.out.print("Valor inteiro : ");
        int n = keyb.nextInt();
        if (n == 0) {
            System.out.print("Zero");
        } else if (n == 1) {
            System.out.print("Um");
        } else if (n == 2) {
            System.out.print("Dois");
        } else {
            System.out.print("Desconhecido");
        }
    }
}


