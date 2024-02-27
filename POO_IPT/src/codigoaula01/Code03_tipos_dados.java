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

/**
 * Created on 20/02/2024, 14:01:16
 *
 * @author manso - computer
 */
public class Code03_tipos_dados {

    public static void main(String[] args) {
        // NUMEROS INTEIROS 
        int x1;
        int x2 = 10;
        int x3 = 20, y, z = 30;
        int a = x3 + x2;
        byte b = 1;
        short s = 2;
        int i = 3;
        //por defeito os numeros inteiros são do tipo int
        long l = 1234456789012l; // long = l no final da constante
        
        //NUMEROS REAIS
        double pi = 3.141559273269;
        //notação cientifica
        double raio = -1.7E+5;
        //por defeito os numeros reais são float
        float j = .0123f; //float = f no final do numero

        //CARACTERES
        char um = '1';
        char c = 'A';
        char newline = '\n';
        boolean fim;
        boolean fechado = true;
        
        //STRINGS
        String txt = "Olá mundo";
    }

}
