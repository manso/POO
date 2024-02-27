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

import java.util.Locale;

/**
 * Created on 20/02/2024, 14:01:16
 *
 * @author manso - computer
 */
public class Code04_prinf {

    public static void main(String[] args) {
        //mudar a consola para inglês
        Locale.setDefault(Locale.ENGLISH);
        double pi = 3.141559273269;
        System.out.println("PI = " + pi);
        System.out.printf("PI = %3.2f\n", pi);
        String txt = "Um texto";
        System.out.println("Texto = "+ txt);
        System.out.printf("Texto = %20s\n", txt);
        boolean ok = false;
        System.out.println("OK = "+ ok);
        System.out.printf("OK = %b\n", ok);
        

    }

}
