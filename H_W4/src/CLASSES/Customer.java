package CLASSES;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private Shop.Gender gender;

    public Shop.Gender getGender() {
        return gender;
    }

    public void setGender(Shop.Gender gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ID : \""+id+"\" Фамилия : \""+lastName+"\" Имя : \""+firstName
                +"\" тел.: \""+phone+"\" Возраст : \""+age+"\" Пол : \""+gender.getItem()+"\"";
    }
    public String toStringShort(){
        return "ID("+id+") "+lastName+" "+firstName+" "+phone;
    }
}