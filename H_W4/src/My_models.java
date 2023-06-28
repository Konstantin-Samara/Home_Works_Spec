import CLASSES.Customer;
import CLASSES.Product;
import CLASSES.Shop;

public class My_models {
    public static Shop getData() {
        Shop my_shop = new Shop();
        Customer my_customer;
        Product my_product;
        String[] firstNames = {"Иван","Мария"};
        String[] lastNames = {"Телков","Коровина"};
        int[] ages = {35,23};
        String[] phones = {"+79277002233","+7917556677"};
        Shop.Gender[] genders = {Shop.Gender.MAN, Shop.Gender.WOMAN};
        for (int i = 0; i < 2; i++) {
            my_customer = new Customer();
            my_customer.setId(i+1);
            my_customer.setFirstName(firstNames[i]);
            my_customer.setLastName(lastNames[i]);
            my_customer.setAge(ages[i]);
            my_customer.setPhone(phones[i]);
            my_customer.setGender(genders[i]);
            my_shop.setMaxIdCust(i+1);
            my_shop.getCustomers().add(my_customer);
        }
        String[] titles = {"Хлеб","Молоко","Мясо","Чай","Сахар"};
        float[] prices = {49.30f,100.10f,400.50f,300.40f,60.20f};
        int[] amounts = {78,56,34,25,45};
        Shop.Category[] categories = {Shop.Category.STANDART, Shop.Category.PREMIUM,
                Shop.Category.STANDART,Shop.Category.PREMIUM,Shop.Category.STANDART};
        for (int i = 0; i < 5; i++) {
            my_product = new Product();
            my_product.setId(i+1);
            my_product.setTitle(titles[i]);
            my_product.setPrice(prices[i]);
            my_product.setAmount(amounts[i]);
            my_product.setCategory(categories[i]);
            my_shop.setMaxIdProd(i+1);
            my_shop.getProducts().add(my_product);
        }
        return my_shop;
    }

}
