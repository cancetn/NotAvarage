import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.

        int matematik, fizik, turkce, kimya, muzik, sayac=0;

        double avarage;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz : ");

        matematik = inp.nextInt();

        if(matematik>=0 && matematik<=100)
        {
            sayac++;
        }else
        {
           System.out.println("Gecersiz not girisi ! (Ortalamaya dahil edilmeyecektir)");
        }

        System.out.println("Fizik notunuzu giriniz : ");

        fizik = inp.nextInt();

        if(fizik>=0 && fizik<=100)
        {
            sayac++;
        }else
        {
            System.out.println("Gecersiz not girisi ! (Ortalamaya dahil edilmeyecektir)");
        }

        System.out.println("Turkce notunuzu giriniz : ");

        turkce = inp.nextInt();

        if(turkce>=0 && turkce<=100)
        {
            sayac++;
        }else
        {
            System.out.println("Gecersiz not girisi ! (Ortalamaya dahil edilmeyecektir)");
        }

        System.out.println("Kimya notunuzu giriniz : ");

        kimya = inp.nextInt();

        if(kimya>=0 && kimya<=100)
        {
            sayac++;
        }else
        {
            System.out.println("Gecersiz not girisi ! (Ortalamaya dahil edilmeyecektir)");
        }

        System.out.println("Muzik notunuzu giriniz : ");

        muzik = inp.nextInt();

        if(muzik>=0 && muzik<=100)
        {
            sayac++;
        }else
        {
            System.out.println("Gecersiz not girisi ! (Ortalamaya dahil edilmeyecektir)");
        }

        avarage = (matematik + fizik + turkce + kimya + muzik) / sayac ;

        if(avarage > 55)
        {
            System.out.println("Tebrikler Gectiniz ! Not ortalamasi = " + avarage);
        }else
        {
            System.out.println("Basarisiz Not ortalamasi = " + avarage);
        }

    }
}
