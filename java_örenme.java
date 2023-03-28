class java_öğenme{
    public static void main (String[] args){
        //bu şekilde yorum satırı yapılabilir.
        System.out.println("hello world"); // javada bir kod satırının bittiğini satırın sonuna ";" koyarak ifade edriz.
        // java büyük küçük harfe duyarlı bir dildir.
    }
}

class java_ders2{
    public static void main (String[] args){      
        int sayı = 25 ;
        String mesaj = "öğrenci sayısım : " ;
        System.out.println(mesaj + sayı) ;
        System.out.println(mesaj + sayı) ;
        System.out.println(mesaj + sayı) ;    
        System.out.println(mesaj + sayı) ;    
    }
}

class java_ders3 {
    // boolean   true or false   
    // byte      integer                -128 ve 127 arasındaki değerlerde kullanılır.Sadece tam sayılarda kullanılır.
    // short     integer                -32768 ve 32767 arasındaki değerlerde kullanılır.Sadece tam sayılarda kullanılır.
    // int       integer                -2147483648 ve 2147483647 arasındaki değerlerde kullanılır.Sadece tam sayılarda kullanılır.
    // long      integer                -9223372036854775808 ve 9223372036854775807 arasındaki değerler için kullanılır.Sadece tam sayılarda kullanılır.
    // float     floating-point number  -3.40282347*10**38 ve -1.40239846*10**-45 Ondalıklı sayılarda kullanılır.
    // double    floating-point number   Ondalıklı sayılarda kullanıır.
    public static void main (String[] args) {
        boolean doğruMu = false ; // boolean true ya da false değerler için kullanılır.
        char karakter = 'A' ; // char tek karakter için kullanılır.yazılan karakterin tek tırnak içerisinde olması zorunludur.
        double sayı = 12.4 ;  // java da ondalıklı sayılar double ile ifade edilir.
        System.out.println("bu" + doğruMu + karakter + sayı);
    
    }
}

class java_ders4 {
    public static void main (String[] args){
      int sayı = 25 ;
      if (sayı<20) {
        System.out.println("sayı 20 den küçüktür.");
      }else if (sayı == 20) {
        System.out.println("sayı 20 ye eşittir.") ;
      }else {
        System.out.println("sayı 20 den büyüktür.");
      }
    }
}

class java_ders5 {
    public static void main (String[] args){
        int sayı1 = 2 ;
        int sayı2 = 33 ;
        int sayı3 = 25 ;
        if(sayı1 > sayı2 ) {
            if(sayı1>sayı3) {
                System.out.println(sayı1);
            }else {System.out.println(sayı3);}
        }else if(sayı2 >sayı1) {
            if(sayı2 > sayı3) {
                System.out.println(sayı2);
            }else {System.out.println(sayı3);}
        }else{
            System.out.println(sayı3) ;
        }           
    }
}

class java_ders6 {
    public static void main (String[]args) {
        char grade ='F';
        switch (grade) {
            case 'A' :
            System.out.println("mükemmel : Geçtiniz") ;
            break ;
            case 'B' :
            System.out.println("çok güzel : Geçtiniz") ;
            break ;
            case 'C' :
            System.out.println("iyi : Geçtiniz") ;
            break ;
            case 'D' :
            System.out.println("fena değil : Geçtiniz") ;
            break ;
            case 'F' :
            System.out.println("Maalesef kaldınız :(") ;
            break ;
        default :
            System.out.println("geçersiz not girdiniz");    
        }

    }
}

class java_ders7 {
    public static void main (String[]args) {
        // for döngüsü
        for (int i =1 ; i<=10 ;i=i+2){ //++ yazdığımız zaman i'nin deüğerini sürekli 1 arttırır. 
            System.out.println(i) ;
        }
    }
}

class java_ders8 {
    public static void main (String[]args) {
        // while döngüsü
        int i=1 ;
        while (i<10 ){
            i++ ;
            System.out.println(i);
        }
    }
}

class java_ders9 {
    public static void main (String[]args) {
        // do-while döngüsü
        int j=1;
        do {
            System.out.println(j);
            j=+2 ;
        }while(j<10);
    }
}

class java_ders10 {
    public static void main (String[]args) {
        String[] ogrenciler = new String [4] ;
        ogrenciler[0] = "engin";
        ogrenciler[1] = "derin";
        ogrenciler[2] = "salih";
        ogrenciler[3] = "ahmet";
        for (String ogrenci:ogrenciler) {  
                System.out.println(ogrenci);
        }    
    }
}
       

class java_ders11 {
    public static void main (String[]args){
        double[] Mylist={1.5,3.6,4.9,9.1};
        double total = 0;
        double max = Mylist[0];
        for(double number : Mylist){
        if(max<number){
            max = number;
        }
            total = total + number ;
            System.out.println(number);
        }
        System.out.println("sayıların toplamı: " + total);
        System.out.println("en büyük sayı: "+ max);
    } 
}

class java_ders12 {
    public static void main (String[]args) {
        String[][] sehirler = new String[3][3]; 
            
        sehirler[0][0] ="istanbul";
        sehirler[0][1] ="bursa";
        sehirler[0][2] ="sakarya";
        sehirler[1][0] ="Ankara"; 
        sehirler[1][1] ="konya";
        sehirler[1][2] ="kayseri";            
        sehirler[2][0] ="diyarbakır";
        sehirler[2][1] ="gaziantep";
        sehirler[2][2] ="şanlıurfa";
            
        for (int i = 0 ;i<=2;i++){
            System.out.println("---------------");
            for (int j = 0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }    
    }
}

class java_ders13 {
    public static void main (String[]args) {
        String mesaj = "bugün hava çok güzel :)";
        System.out.println(mesaj);
        System.out.println("Mesajdaki karakter sayısı : "+mesaj.length()); //buradaki length bize eleman sayısını bulmamızda yardımcı olur.
        System.out.println("mesajın 5.karakteri :"+ mesaj.charAt(4)) ; //buradaki charAt bize indexleri bulmamıza yardımcı olur.
        System.out.println(mesaj.concat( "yaşasın !")) ;// buradaki concat iki string'i birleştirmemizi sağlar.
        System.out.println(mesaj.startsWith("b")) ;//mesajı ilk karakterini sosrgular parantez içi ile aynı ise True değeri yazar değilse False değer yazdırır.
        System.out.println(mesaj.endsWith(")")) ;//Mesajın son karaklerini sorgular parantez içi ile aynı ise True değilse False değer yazar.
        System.out.println(mesaj.indexOf("a"));//mesajdaki karakterin kaçıncı indekste olduğunu bulur soldan aram yapmaya başlar.
        System.out.println(mesaj.lastIndexOf("a"));//indexOF ile aynı işi yapar tek fark bu sağdan arama yapmaya başlar.
        System.out.println(mesaj.replace(" ", "_")) ;//replace python da da olduğu gibi karakterleri değiştirmek için kullanılır.
        System.out.println(mesaj.substring(2,4)); // Buradaki substring mesajın belli bir kısmını almamızı sağlar.

        for(String kelime : mesaj.split((" "))){
            System.out.println(kelime) ;//split metodu parantez içine yazılan karakteri gördüğü zaman bu şekilde alt satıra geçer ve kelimeleri alt ala yazmamızı sağlar.
        
        System.out.println(mesaj.toLowerCase());//Mesajın bütün karakterlerini küçük harfe dönüştürür.
        System.out.println(mesaj.toUpperCase());//Mesajın bütün karakterlerini büyük harfe çevirir.
        System.out.println(mesaj.trim());//Mesajın başındaki ve sonundaki boşlukları almamızı sağlar.
    }
    }
}

class java_ders14 {
    public static void main (String[]args){
        int sayı = -1 ;
        boolean sayı_asal = true ;
        if (sayı == 1){
            System.out.println("sayınız asal değildir.");
            return;
        }
        if (sayı <1) {
            System.out.println("geçersiz sayı");
        }else{
        for (int i = 2 ; i<sayı ; i++){
            if (sayı % i == 0){
                sayı_asal = false ;
            }
        }if(sayı_asal == true) {
            System.out.println("sayınız asaldır.");
        }else{
            System.out.println("sayınız asal değildir");
            }
        }
    }
}

class java_ders15 {
    public static void main (String[]args) {
        char harf = 'A';
        switch (harf) {
            case 'A':
            case 'ı':
            case 'O':
            case 'U':
            System.out.println("harfiniz kalın ünlü'dür.");
            break;
            default:
            System.out.println("harfiniz ince ünlü'dür.");
        }
    }
}

class java_ders16 { // mükemmel sayı sorgusu.
    public static void main (String[]args) {
        int toplam = 0 ;
        int sayı = 496 ;
        for (int i = 1 ;i < sayı/2+1 ;i++) {
            if (sayı % i == 0 ) {
                 toplam = toplam + i ;
            }
        }
        if (toplam == sayı){
            System.out.println("sayınız mükemmel sayıdır ");
        }else {
            System.out.println("sayınız mükemmel sayı değildir") ;
        }
    } 
}

class java_ders17 { // arkadaş sayı sorgusu.
    public static void main (String[]args) {
        int sayı1 = 220 ;
        int sayı2 = 284 ;
        int toplam1 = 0 ;
        int toplam2 = 0 ;
        for (int i = 1 ;i < sayı1 ;i++) {
            if (sayı1 % i == 0){
                toplam1 = toplam1 + i ;
            }
        }
        for (int j =1 ;j < sayı2 ;j++){
            if(sayı2 % j == 0) {
                toplam2 = toplam2 + j ;
            }
        }
        if(toplam1 == sayı2){
            if (toplam2 == sayı1) {
                System.out.println(sayı1 + " ve " + sayı2 + " arkadaş sayılardır");
            }
        }else {
            System.out.println(sayı1 + " ve " + sayı2 + " arkadaş sayı değildir.");
        }
    }
}

class java_ders18 {
    public static void main (String[]args){
        int [] sayılar = new int [] {1,2,5,7,9,0} ;
        int aranacakSayı = 15 ;
        boolean varMı = false ;
        for (int sayı : sayılar ) {
            if (sayı == aranacakSayı) {
                varMı = true ;
                break ;
            }
        }
        if (varMı == true){
            System.out.println("sayı mevcuttur") ;
        }else {
            System.out.println("sayı mevcut değildir");
        }
    }
}

class java_ders19 {
    public static void main (String[]args) {
        sayıBulmaca() ;
    }
    public static void sayıBulmaca () {

        int [] sayılar = new int [] {1,2,5,7,9,0} ;
        int aranacakSayı = 15 ;
        boolean varMı = false ;
        for (int sayı : sayılar ) {
            if (sayı == aranacakSayı) {
                varMı = true ;
                break ;
            }
        }
        if (varMı == true){
            System.out.println("sayı mevcuttur") ;
        }else {
            System.out.println("sayı mevcut değildir");
        }
    }
}

class java_ders20 {
public static void main (String[]args){
    mesaj() ;
    String yeniMesaj = şehirVer() ;
    System.out.println(yeniMesaj) ;
    int sayı = topla(15,7) ;
    System.out.println(sayı) ; 
}
public static void mesaj() {
    String mesaj = "Bugün hava çok güzel";
    String yeniMesaj = mesaj.substring(0, 5);
    System.out.println(yeniMesaj) ;
}
public static int topla (int sayı1,int sayı2) {
    return sayı1 + sayı2;
  }
  public static String şehirVer() {
    return "Ankara" ;
  }
}

class java_ders21 {
    public static void main (String[]args){
        int toplam = topla2(2,3,5,9,5,15,78);// burada kullanılan 3 nokta "veriable argument" demektir.Amacı ise 2 den çok sayıyı işleme almasıdır.
        System.out.println(toplam);
    }
public static int topla2(int...sayılar) {
    int toplam = 0 ;
    for (int sayı:sayılar){
        toplam+=sayı ;
        }
    return toplam ;
    }
}

// NOT : java da println daki ln nin görevi yazıyı veya sayhıyı yazdıktan sonra alt satıra geçmesini istememizdir. 