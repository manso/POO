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
 * Created on 20/02/2024, 14:01:16
 *
 * @author manso - computer
 */
public class Code05_input {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        // escrever sem mudar de linha
        System.out.print("Qual o seu nome :");
        //ler uma string
        String nome = keyb.nextLine();
        System.out.println("Olá " + nome);
        

    }

}
