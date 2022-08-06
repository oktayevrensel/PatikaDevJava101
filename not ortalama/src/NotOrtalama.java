import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
        // Değişkenlerim

        int mat,fizik,kimya,turkce,tarih,muzik;

        // Scanner sınıfını tanımlama
        Scanner inp= new Scanner(System.in);

        // kullanıcıdan Değerleri isteme
        System.out.print("Matematik Notu: ");
        mat=inp.nextInt();
        System.out.print("Fizik Notu: ");
        fizik=inp.nextInt();
        System.out.print("Kimya Notu: ");
        kimya=inp.nextInt();
        System.out.print("Türkçe Notu: ");
        turkce=inp.nextInt();
        System.out.print("Tarih Notu: ");
        tarih=inp.nextInt();
        System.out.print("Müzik Notu: ");
        muzik=inp.nextInt();

        // Ortalama Hesaplama
        int toplama=(mat+fizik+kimya+turkce+tarih+muzik);
        double otralama=toplama/6.0;
        // Sınıf Geçme Durumu
        boolean kosul=otralama>60;
        String gectiMi= kosul?"Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(gectiMi);




    }
}
