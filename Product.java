public class Product {
    public Product(){
        System.out.println("ben");
    }
    //constructor blokları
/*constuctor metotlar yapıcı metotlardır.Nesne yönelimli
dillerde önemli bir konudur.Olusturuluan sınıf yapılarının nesen olarak
tanımlanması durumunda proje dosyasının alt yapısını hazırlayan, kurucu rol
üstlenerek ilk işlemleri gerçekleştiren, kullanılan sınıf yapısı ile
aynı isme sahip olan, geriye değer döndürmeyen özel metotlardır.
public Product(){
//bu blok her zaman var
}
*/
    public Product(int id,String name,double unitPrice,String detail){
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;
    }


    int id;
    String name;              //-> özellik tutan ksıımlar
    double unitPrice;
    String detail;

}
