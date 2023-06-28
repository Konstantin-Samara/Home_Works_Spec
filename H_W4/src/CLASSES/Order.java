package CLASSES;

public class Order {
    private int id;
    private int amount;
    private float summa;
    private Customer customer;
    private Product product;


    @Override
    public String toString() {
        return "Заказ № "+this.id+"\nПокупатель "+this.customer.toStringShort()+"\nЗаказал "
                +this.product.toStringShort()+"\nВ кол-ве "
                +this.amount+" шт.\nНа сумму "+this.summa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getSumma() {
        return summa;
    }

    public void setSumma(float summa) {
        this.summa = summa;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
