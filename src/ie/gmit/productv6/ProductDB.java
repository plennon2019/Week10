package ie.gmit.productv6;

public class ProductDB {

    public static Printable getProduct(String productCode) {

        Printable p = null;
            Book b = new Book();
            if (productCode.equalsIgnoreCase("java"))
            {
                b.setCode(productCode);
                b.setDescription("GMIT Java Programming");
                b.setPrice(57.50);
                b.setAuthor("Joe Brown");
                p = b; // set Product object equal to the Book object
            }
           else if (productCode.equalsIgnoreCase("netbeans"))
           {
                Software s = new Software();
                s.setCode("netbeans");
                s.setDescription("NetBeans");
                s.setPrice(0.00);
                s.setVersion("8.2");
                p = s; // set Product object equal to the Music object
          }
           else if (productCode.equalsIgnoreCase("pink"))
           {
                Music m = new Music();
                m.setCode("pink");
                m.setDescription("Wish you were here");
                m.setPrice(8.00);
                m.setArtist("Pink Floyd");
                m.setLabel("Columbia");
                p = m; // set Product object equal to the Software object

        } else if (productCode.equalsIgnoreCase("KDL43")) {
                Tv t = new Tv();
                t.setCode("KDL43WF663");
                t.setDescription("SONY BRAVIA SMART TV KDL43WF663");
                t.setPrice(819.00);
                t.setManufacturer("Sony");
                t.setSize("55\"");
                p = t; // set Product object equal to the TV object
    }
         else if (productCode.equalsIgnoreCase("meg")) {
                Dog d = new Dog("Border Collie", "Yes", 3, "no", "yes");

                p = d; // set Product object equal to the TV object
        }
        return p;
    }
}
