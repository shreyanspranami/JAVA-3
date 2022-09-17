// shreyans j. pranami 21CE110
public class Practical_3 {

   interface P {
       int p = 5;
   }

   interface P1 extends P {
       int p1 = 10;
   }

   interface P2 extends P {
       int p2 = 15;
   }

   interface P12 extends P1, P2 {
       int p12 = 20;
   }

   public static class display implements P12 {
       public void getP() {
           System.out.println("P is : " + p);
       }

       public void getP1() {
           System.out.println("P1 is : " + p1);
       }

       public void getP2() {
           System.out.println("P2 is : " + p2);
       }

       public void getP12() {
           System.out.println("P12 is : " + p12);
       }
   }
   public static void main(String[] args) {
       display q= new display();
       q.getP();
       q.getP1();
       q.getP2();
       q.getP12();
       System.out.println("shreyans 21CE110");
   }
}

