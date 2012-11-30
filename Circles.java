package circles;
import java.util.Scanner;
public class Circles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            circumference c = new circumference();
            area a = new area();
         String formula;
            double r;
           System.out.println("please chose a formula for a circle: circumference, area, or both");
               formula = s.next();               
                    System.out.println("please enter a radius");
                        r = s.nextDouble();
                            if (formula.equalsIgnoreCase("circumference")){
                                System.out.println("the circumference is " + c.circumference(r));
                            }
                            else if (formula.equalsIgnoreCase("area")){
                                System.out.println("the area is " + a.area(r) );
                            }
                            else if (formula.equalsIgnoreCase("both")){
                                System.out.println("the circumference is " + c.circumference(r));
                                System.out.println("the area is " + a.area(r) );
                            }
        
        
    }
}
