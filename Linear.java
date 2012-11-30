
package linear;

import java.util.Scanner;

public class Linear {

    public static void main(String[] args) {
       double a, h, k;
       String m;
            Scanner f = new Scanner(System.in);
                System.out.println("Yo gimme yo slope and points son, just press enter");
                    m = f.nextLine();
                System.out.println("Ight lay on dat slope(im a computer, i only use decimals): ");
                    a = f.nextDouble();
                System.out.println("Ight, ight i feel ya dog. Hook me up wiff dat x: ");
                    h = f.nextDouble();
                System.out.println("Okay presistent i see, gimme y: ");
                    k = f.nextDouble();
        double bb = -1,coola = a*h;
        double killaa = coola*bb;
        double bbb = killaa+k;
            System.out.println("Yo dawg betta appreciate dis, man yall dun even kno: Y=" + a + "x"+"+" + bbb);
 
    }
    
    
}
