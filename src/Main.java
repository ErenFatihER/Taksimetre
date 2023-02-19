import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km,tutar;
        Scanner input=new Scanner(System.in);
        System.out.print("km'yi giriniz=");
        km=input.nextDouble();
        tutar=10+2.2*km;
        double kosul= tutar<20 ? 20 : tutar;
        System.out.println("Taksimetre tutarı="+kosul);
    }
}