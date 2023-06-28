import CLASSES.Shop;
import EXCEPTIONS.AmountExceptions;
import EXCEPTIONS.CustomerExceptions;
import EXCEPTIONS.ProductExceptions;
import EXCEPTIONS.TooMuchSaleException;

import java.util.Random;

public class Main {
    static Shop my_shop = new Shop();
    public static void main(String[] args) throws ProductExceptions, CustomerExceptions, AmountExceptions {
        my_shop = My_models.getData();
        int[][] int_ord1 = {{4,1,3},{1,7,4},{1,4,5},{2,2,600},{2,5,7}};
        printListCustomers();
        printListProducts();
        createOrders(int_ord1);
        printListOrders();
        makeDiscounts();
        printListProducts();
    }
public static void createOrders(int[][] int_ord) throws ProductExceptions, CustomerExceptions, AmountExceptions {
    for (int i = 0; i < int_ord.length; i++) {
        try {my_shop.getOrders().add(my_shop.createOrder(int_ord[i][0],int_ord[i][1],int_ord[i][2]));
        } catch (CustomerExceptions e) {
            System.out.println("Заказ :\nТовар : "+my_shop.getProductFromId(int_ord[i][1]).toStringShort());
            System.out.println("В кол-ве : "+int_ord[i][2]+" шт. \nНЕ СОЗДАН!!!");
            System.out.println(e.getMessage());

        } catch (ProductExceptions e) {
            System.out.println("Заказ :\nПокупатель : "+my_shop.getCustomerFromId(int_ord[i][0]).toStringShort());
            System.out.println("На что-то в кол-ве : "+int_ord[i][2]+" шт. \nНЕ СОЗДАН!!!");
            System.out.println(e.getMessage());

        } catch (AmountExceptions e){

            System.out.println("Заказ :\nПокупатель : "+my_shop.getCustomerFromId(int_ord[i][0]).toStringShort());
            System.out.println("Товар : "+my_shop.getProductFromId(int_ord[i][1]).toStringShort());
            System.out.println("В кол-ве : "+int_ord[i][2]+" шт. \nНЕ СОЗДАН!!! "+e.getMessage());
            my_shop.getOrders().add(my_shop.createOrder(int_ord[i][0],int_ord[i][1],1));

        }

    }
}
public static void makeDiscounts() {
    Random rand = new Random();
    int indDisc = rand.nextInt(0, Shop.Discount.values().length);
    int disc = Shop.Discount.values()[indDisc].getItem();
    System.out.println("\nDISCOUNT - "+disc+"%");
    for (int i = 0; i < my_shop.getProducts().size(); i++) {
        try {my_shop.makeDiscount(disc,i);
        } catch (TooMuchSaleException e) {
            System.out.println(e.getMessage());
        }
    }
}
public static void printListCustomers(){
    System.out.println();
    for (int i = 0; i < my_shop.getCustomers().size(); i++) {
        System.out.println(my_shop.getCustomers().get(i).toString());
    }
}
public static void printListProducts(){
    System.out.println();
    for (int i = 0; i < my_shop.getProducts().size(); i++) {
        System.out.println(my_shop.getProducts().get(i).toString());
    }
}
public static void printListOrders(){
    for (int i = 0; i < my_shop.getOrders().size(); i++) {
        System.out.println("\n"+my_shop.getOrders().get(i).toString());
    }
}

    }



