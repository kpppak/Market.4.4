import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> goods = new ArrayList<>();

        goods.add(new Product("BANANAS",1,KindOfProduct.VEGEFRUIT,PackageType.KG,1.5));
        goods.add(new Product("MILK",2,KindOfProduct.MILKY, PackageType.LITER,1.0));
        goods.add(new Product("COCA-COLA",3,KindOfProduct.BEVERAGE,PackageType.PCS,1.7));
        goods.add(new Product("TOILET PAPER",4,KindOfProduct.HOUSEHOLD, PackageType.PCS,0.5));
        goods.add(new Product("FLOUR",5,KindOfProduct.GROCERY,PackageType.PCS,4.5));
        goods.add(new Product("SUGAR",6,KindOfProduct.GROCERY,PackageType.KG,3.5));
        goods.add(new Product("RICE",7,KindOfProduct.GROCERY,PackageType.KG,1.3));
        goods.add(new Product("GIN",8,KindOfProduct.BEVERAGE,PackageType.PCS,12.0));
        goods.add(new Product("CUCUMBER",9,KindOfProduct.VEGEFRUIT, PackageType.KG,4.5));
        goods.add(new Product("BUTTER",10,KindOfProduct.MILKY, PackageType.PCS,1.7));
        goods.add(new Product("YOGURT",11,KindOfProduct.MILKY, PackageType.PCS,3.7));
        goods.add(new Product("SOAP",12,KindOfProduct.HOUSEHOLD, PackageType.PCS,4.5));
        goods.add(new Product("TOOTH PASTE",13,KindOfProduct.HOUSEHOLD, PackageType.PCS,4.2));

        List<Product> list = Store.switchAndPutTogether(goods);
        Check.printOutCheck(list);
    }
}