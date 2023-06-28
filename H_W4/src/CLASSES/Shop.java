package CLASSES;

import EXCEPTIONS.AmountExceptions;
import EXCEPTIONS.CustomerExceptions;
import EXCEPTIONS.ProductExceptions;
import EXCEPTIONS.TooMuchSaleException;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private int maxIdCust=0;
    private int maxIdProd=0;
    private  int maxIdOrders=0;
    public enum Gender {
        MAN("Мужчина"),WOMAN("Женщина");
        private String item;
        Gender (String item) {
            this.item = item;
        }
        public String getItem(){
            return item;
        }
    }
    public enum Category{
        PREMIUM("Премиальный"), STANDART("Стандарт");
        private String item;

        Category(String item) {
            this.item = item;
        }
        public String getItem(){
            return item;
        }
    }
    public enum Discount{
        A(10),B(15),C(20),D(25),E(30);
        private int item;

        Discount(int item) {
            this.item = item;
        }
        public int getItem(){
            return item;
        }
    }
    public int getMaxIdOrders() {
        return maxIdOrders;
    }

    public void setMaxIdOrders(int maxIdOrders) {
        this.maxIdOrders = maxIdOrders;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public int getMaxIdCust() {
        return maxIdCust;
    }

    public void setMaxIdCust(int maxIdCust) {
        this.maxIdCust = maxIdCust;
    }

    public int getMaxIdProd() {
        return maxIdProd;
    }

    public void setMaxIdProd(int maxIdProd) {
        this.maxIdProd = maxIdProd;
    }

    public Order createOrder(int id_cust, int id_prod, int amount) throws CustomerExceptions, ProductExceptions, AmountExceptions {
        Order order = new Order();

        for (int i = 0;  i< customers.size(); i++) {
            if (id_cust==customers.get(i).getId()) {
                order.setCustomer(customers.get(i));
            }
        }
        if (order.getCustomer()==null){
            throw new CustomerExceptions("Несуществующий покупатель.");
        }

        for (int i = 0;  i< products.size(); i++) {
            if (id_prod==products.get(i).getId()) {
                order.setProduct(products.get(i));
                if (!(amount>0&&amount<=products.get(i).getAmount())){
                    throw new AmountExceptions("Кол-во не соответствует наличию и будет заменено на 1шт.");}
                products.get(i).setAmount(products.get(i).getAmount()-amount);
            }
        }
        if (order.getProduct()==null){
            throw new ProductExceptions("Несуществующий товар.");
        }

        order.setAmount(amount);
        order.setSumma(order.getAmount()*order.getProduct().getPrice());
        this.maxIdOrders++;
        order.setId(getMaxIdOrders());
        return order;
    }
    public void makeDiscount(int disc, int ind) throws TooMuchSaleException {

        if (disc>15&&products.get(ind).getCategory().name().equals("PREMIUM")){
            throw new TooMuchSaleException("Назначенная скидка в "+disc
                    +"% не может быть применена к товару категории \"PREMIUM\".\n Цена на "
            +products.get(ind).toStringShort()+" останется прежней.");
        }
        else {products.get(ind).setPrice(products.get(ind).getPrice()*(100-disc)/100);}

    }
    public Product getProductFromId(int id){
        Product product = new Product();
        for (int i = 0; i < products.size(); i++) {
            if (id==products.get(i).getId()){product = products.get(i);}
        }
        return product;
    }
    public Customer getCustomerFromId(int id){
        Customer customer = new Customer();
        for (int i = 0; i < customers.size(); i++) {
            if (id==customers.get(i).getId()){customer = customers.get(i);}
        }
        return customer;
    }
}
