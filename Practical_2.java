// shreyans j. pranami 21CE110
import java.util.Scanner;
import java.util.Vector;
interface IPrinter
{
    void print1();
}
interface IScanner
{
    void scan1();
}
public class Practical_2 implements IPrinter,IScanner {
    Vector<Integer> v = new Vector<>();
    Scanner in = new Scanner(System.in);
    int n = 5;

    public void scan1() {
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(5);
        v.add(4);
    }

    public void print() {
        System.out.println(v);
        System.out.println("implementation of print method1");
    }

    public static void main(String[] args) {
        Practical_2 obj = new Practical_2();
        obj.scan1();
        obj.print();
        System.out.println("shreyans 21CE110");
    }
}