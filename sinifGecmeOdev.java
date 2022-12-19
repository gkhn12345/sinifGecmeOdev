import java.util.Scanner;

public class sinifGecmeOdev {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double mat, fizik, kimya, turkce, ingilizce, biyoloji,ortalama;


        System.out.print("matematik notunuz :");
        mat = input.nextDouble();
        if ((mat < 0) || (mat > 100)){
            System.out.println("Geçersiz Not girdiniz");
            mat = input.nextDouble();
        }


        System.out.print("fizik notunuz :");
        fizik = input.nextDouble();
        if ((fizik < 0) || (fizik > 100)){
            System.out.println("Geçersiz Not girdiniz");
            fizik = input.nextDouble();
        }



        System.out.print("kimya notunuz :");
        kimya = input.nextDouble();
        if ((kimya < 0) || (kimya > 100)){
            System.out.println("Geçersiz Not girdiniz");
            kimya = input.nextDouble();
        }


        System.out.print("turkce notunuz :");
        turkce = input.nextDouble();
        if ((turkce < 0) || (turkce > 100)){
            System.out.println("Geçersiz Not girdiniz");
            turkce = input.nextDouble();
        }

        System.out.print("ingilizce notunuz :");
        ingilizce = input.nextDouble();
        if ((ingilizce < 0) || (ingilizce > 100)){
            System.out.println("Geçersiz Not girdiniz");
            ingilizce = input.nextDouble();
        }

        System.out.print("biyoloji notunuz :");
        biyoloji = input.nextDouble();
        if ((biyoloji < 0) || (biyoloji > 100)){
            System.out.println("Geçersiz Not girdiniz");
            biyoloji = input.nextDouble();
        }
        ortalama = ((mat + fizik + kimya + turkce + ingilizce + biyoloji)/6);
        System.out.println("ortalamanız : " +ortalama);


        if (ortalama>=55){
            System.out.println("Sınıfı geçtiniz!!");

        }else if (ortalama<55){
            System.out.println("Sınıfı Geçemediniz");
        }





    }
}
