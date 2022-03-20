public class Main {
    public static void main(String[] args) {
        //objeler ile çalışma
        Product product1 = new Product(1,"lenova", 15000, "16gb");  // örenk olusturma/referans olusturma/intance/bir class olustururken

        Product product2 = new Product();  // örnek olusturma/referans olusturma/intance/bir class olustururken
        product2.id = 2;
        product2.name = "lenova v15";
        product2.unitPrice = 32000;
        product2.detail = "32 GB Ram";

        Product product3 = new Product();  // örnek olusturma/referans olusturma/intance/bir class olustururken
        product3.id = 3;
        product3.name = "lenova v15";
        product3.unitPrice = 32000;
        product3.detail = "32 GB Ram";


        Product[] products = {product1,product2,product3};
        for(Product product : products){
            System.out.println(product.id);
        }
        System.out.println(products.length);


        Category category1 = new Category();
        category1.id = 205;
        category1.catagory_name = "ev";

        Category category2 = new Category();
        category2.id = 305;
        category2.catagory_name = "bahçe";

        Category[] categories = {category1, category2};

        for (Category category : categories){
            System.out.println(category.id);
        }


         ProductManager productManager = new ProductManager();
            productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);




        SoftwareCourses softwareCourses1 = new SoftwareCourses("Java",5,"Sıfırdan Java Kursu");






    }
}
