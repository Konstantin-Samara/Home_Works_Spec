package CLASSES;

public class Product {
    private int id;
    private  String title;
    private float price;
    private int amount;
    private Shop.Category category;

    public Shop.Category getCategory() {
        return category;
    }

    public void setCategory(Shop.Category category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ID : \""+id+"\" Наименование : \""+title+"\" Цена : \""
                +price+"\" кол-во в наличии : \""+amount+"\" Категория : \""+category.getItem()+"\"";
    }
    public String toStringShort() {
        return "ID("+id+") "+title+" "+price+" руб. "+amount+" шт.в наличии";
    }
}
