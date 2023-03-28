import java.io.* ; // Buradaki yıldızın anlamı birden çook sınıfı birlikte çağırmaktır.Büün sınıları tek tek çağırmak yerine hepsini çağırmamızı sağlar.
import java.util.Scanner ;
import javax.swing.JOptionPane ;

class ders_3 {
    public static void main (String[]args) {
        etkinlik6() ;
    }
    public static void etkinlik3_1 () throws IOException {
    BufferedReader oku = new BufferedReader(new InputStreamReader(System.in)) ;
    String ad , soyad ;
    System.out.println("adınızı giriniz : ") ;
    ad = oku.readLine() ;
    System.out.println("soyadınızı giriniz : ") ;
    soyad = oku.readLine() ;   
    System.out.println(ad +" "+ soyad) ;
    }

    public static void etkinlik3_2 () throws IOException {
    BufferedReader topla = new BufferedReader(new InputStreamReader(System.in)) ;
    String s ;
    double ilkSayı , sonSayı ;
    System.out.println("İlk sayıyı girniz") ;
    s = topla.readLine() ;
    ilkSayı = Double.parseDouble(s) ;
    System.out.println("İkinci sayıı giriniz") ;
    s = topla.readLine() ;
    sonSayı = Double.parseDouble(s) ;
    double b = ilkSayı + sonSayı ;
    System.out.println("iki sayının toplamı : " + b ) ;
    double a = ilkSayı - sonSayı ;
    System.out.println("iki sayının farkı : " + a ) ;    
    }

    public static void etkinlik3_3 () {
        String ad ;
        int yaş ;
        Scanner oku = new Scanner(System.in) ;
        System.out.print("adınızı giriniz :") ;
        ad = oku.next() ;
        System.out.print("Yaşınızı giriniz :") ;
        yaş = oku.nextInt() ;
        System.out.println("Adınız : " + ad + " yaşınız : " + yaş) ;
    }
    public static void etkinlik3_4 () {
        String data = JOptionPane.showInputDialog("bir saı giriniz : ") ;
        int sayı = Integer.parseInt(data) ;
        JOptionPane.showMessageDialog(null , "girilen sayının karesi : " + sayı*sayı) ; 
    }
    public static void etkinlik3_5 () {
        String ad ;
        int yaş ;
        ad = JOptionPane.showInputDialog("Adınızı girinniz : ") ;
        yaş =Integer.parseInt(JOptionPane.showInputDialog("Doğduğunuz yılı giriniz : ")) ; 
        JOptionPane.showMessageDialog(null , "Adınız: " + ad + " yaşınız : " + (2023-yaş)) ;
    }
    public static void etkinlik3_6 () {
        int sayı1 , sayı2 ;
        sayı1 = Integer.parseInt(JOptionPane.showInputDialog("1.Sayıyı giriniz : ")) ;
        sayı2 = Integer.parseInt(JOptionPane.showInputDialog("2.sayıyı giriniz : ")) ;
        JOptionPane.showMessageDialog(null , "iki sayının çarpımı : " + (sayı1*sayı2) + " iki sayının toplamı : " + (sayı1+sayı2)) ;
    }
}

// NOT : java da println daki ln nin görevi yazıyı veya sayıyı yazdıktan sonra alt satıra geçmesini istememizdir. 
class ders4 {
    public static void main (String[]args) {
        etkiğnlik4_5();
    }
public static void etkinlik4_1 () {
    // koşul yapıları
    int urunTipi = 1 ;
    int urunFiyatı = 200 ;
    double kdv = -1 ;
    if ( urunTipi == 1) {
        System.out.println(kdv = 0.08*urunFiyatı) ;
    }else if (urunTipi ==2 ) {
        System.out.println(kdv = 0.18*urunFiyatı) ;
    }else if (urunTipi ==3) {
        System.out.println(kdv = 0.24*urunFiyatı) ;
    }else {
        System.out.println(kdv = 0.48 *urunFiyatı);
    }
    }
public static void etkinlik4_2() {
    int urunTipi = 1 ;
    int urunFiyatı = 200 ;
    double kdv = -1 ;
        switch (urunTipi) {
            case 1 :kdv = 0.08*urunFiyatı ;
                break;
            case 2 : kdv = 0.18*urunFiyat ;
                break ;
            case 3 : kdv = 0.24*urunFiyatı ;
                break ;
            default : kdv = 0.48*urunFiyatı ;
                break ;    
        }
    }
    public static void etkinlik4_3() {
    int urunTipi = 1 ;
    int urunFiyatı = 200 ;
    double kdv = -1 ;
    if ( urunTipi == 1) {
        System.out.println("Temel gıda.") ;
    }else if (urunTipi ==2 ) {
        System.out.println("İşlenmiş gıda.") ;
    }else if (urunTipi ==3) {
        System.out.println("Temizlik ürünü.") ;
    }else {
        System.out.println("Lüks tüketim.");
        }
    }
    public static void etkinlik4_4() {
        double kilo , boy , endeks ;
        boy = Double.parseDouble(JOptionPane.showInputDialog("Boyunuzu giriniz: ")) ;
        kilo = Double.parseDouble(JOptionPane.showInputDialog("Kilonuzu giriniz: ")) ;
        endeks = (kilo/(boy*boy)) ;
        JOptionPane.showMessageDialog(null , "Kitle indeksiniz: " + endeks) ;
    if (endeks <18.5) {
        JOptionPane.showMessageDialog(null , "Kitle indeksiniz:" + endeks + " ideal kilonun altında") ;
    }else if (endeks>18.5 && 24.99>endeks){
        JOptionPane.showMessageDialog(null , "Kitle indeksiniz:" + endeks + " ideal kilo.") ;
    }else if (endeks>25 && endeks<29.99) {
        JOptionPane.showMessageDialog(null , "Kitle indeksiniz:" + endeks + " ideal kilonun üstünde") ;
    }else {
        JOptionPane.showMessageDialog(null , "Kitle indeksiniz:" + endeks + " ideal kilonun çok üstünde.") ;
        }
    }
    public static void etkiğnlik4_5 () {
        int ay ;
        Scanner s = new Scanner(System.in) ;
        System.out.print("kaçıncı ay: ") ;
        ay = s.nextInt() ;
        if (ay == 1) {
            System.out.println("ocak ayı") ;
        }else if(ay == 2 ) {
            System.out.println("Şubat ayı") ;
        }else if(ay == 3 ) {
            System.out.println("Mart ayı") ;
        }else if(ay == 4 ) {
            System.out.println("Nisan ayı") ;
        }else if(ay == 5 ) {
            System.out.println("Mayıs ayı") ;
        }else if(ay == 6 ) {
            System.out.println("Haziran ayı") ;
        }else if(ay == 7 ) {
            System.out.println("Temmuz ayı") ;
        }else if(ay == 8 ) {
            System.out.println("Ağustos ayı") ;
        }else if(ay == 9 ) {
            System.out.println("Eylül ayı") ;
        }else if(ay == 10 ) {
            System.out.println("Ekim ayı") ;
        }else if(ay == 11 ) {
            System.out.println("Kasım ayı") ;
        }else {
            System.out.println("Aralık ayı") ;
        }
    }
}

