
package javaapplication11;


public class JavaApplication11 {
 static int[] degerler = {10, 20, 30, 40, 50, 10};
 //diziye elaman ekliyoruz
  static int toplam = 0 ;
  //toplam adında değiken atadık değerini 0 olarak tanımladık
    public static void main(String[] args) {
    
    for( int a : degerler) {
        //a adında değiken tanımladık tanımladığımız değişken
        // degerler değişkennin değerine ulaşıncaya kadar
        //döngü halinde tekar edecek
          toplam = a+toplam;
          
      }
      System.out.println("Dizi elemanları toplamı : "+toplam);
    
    }
    
}
