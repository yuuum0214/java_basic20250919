package etc.async;

public class Coffee {

    private String name;
    private String customerName;

    public Coffee(String name, String customerName) {
        this.name = name;
        this.customerName = customerName;
    }

    public String getName() {
        return name;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String  toString() {
        return name + "{주문자: " + customerName + "}";
    }
}
