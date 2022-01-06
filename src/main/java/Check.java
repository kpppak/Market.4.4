import java.util.Iterator;
import java.util.List;

public class Check implements Bill{
    private static int checkNumber = 0;

    //@Override
    public static void printOutCheck(List<Product> list) {
        Logger logger = LoggerCheck.getInstance();
        checkNumber++;
        logger.log("\nCheck#" + checkNumber + "\nThank you for being our client!");
        double sum = 0;
        for (Product o : list){
            sum = sum + (o.getPrice() * o.getAmount());
            System.out.println(o.getProductName() +
                    " " + o.getAmount() + " " + o.getPackageType() +
                    "    " + (o.getPrice() * o.getAmount()) + " Pound");
        }
        System.out.println("Total: " + sum + " Pound");
    }
}
