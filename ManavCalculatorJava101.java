import java.util.Scanner;
public class ManavCalculatorJava101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Armut = 2.14 ,Elma=3.67, Domates=1.11, Muz=0.95, Patlican= 5.00;
        double ArmutKg,ElmaKg,DomatesKg,MuzKg,PatlicanKg, Total;
        System.out.println("Lütfen aldığınız meyve ve sebzelerin kg'sini karşısına yazınız");
        System.out.print("Kaç kg Armut aldınız: ");
        ArmutKg = input.nextDouble();
        System.out.print("Kaç kg Elma aldınız: ");
        ElmaKg = input.nextDouble();
        System.out.print("Kaç kg Domates aldınız: ");
        DomatesKg = input.nextDouble();
        System.out.print("Kaç kg Muz aldınız: ");
        MuzKg = input.nextDouble();
        System.out.print("Kaç kg Patlican aldınız: ");
        PatlicanKg = input.nextDouble();

        Total = ArmutKg*Armut+ElmaKg*Elma+DomatesKg*Domates+MuzKg*Muz+PatlicanKg*Patlican;
        System.out.println("Toplam tutar: " +Total);


    }
}
