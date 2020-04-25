package builder.pattern;

import java.util.Objects;

public class Phone {
    private String company;
    private String version;
    private String internalMemory;
    private boolean expendable;
    private String display;
    private String price;
    private String currency = "$";
    private String batteryCapacity;
    private String productMadeIn;
    private String productAssambleIn;

    public String getCompany() {
        return company;
    }

    public Phone setCompany(String company) {
        this.company = company;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public Phone setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getInternalMemory() {
        return internalMemory;
    }

    public Phone setInternalMemory(String internalMemory) {
        this.internalMemory = internalMemory;
        return this;
    }

    public boolean isExpendable() {
        return expendable;
    }

    public Phone setExpendable(boolean expendable) {
        this.expendable = expendable;
        return this;
    }

    public String getDisplay() {
        return display;
    }

    public Phone setDisplay(String display) {
        this.display = display;
        return this;
    }

    public String getPrice() {
        return price;
    }

    public Phone setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public Phone setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public Phone setBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    public String getProductMadeIn() {
        return productMadeIn;
    }

    public Phone setProductMadeIn(String productMadeIn) {
        this.productMadeIn = productMadeIn;
        return this;
    }

    public String getProductAssambleIn() {
        return productAssambleIn;
    }

    public Phone setProductAssambleIn(String productAssambleIn) {
        this.productAssambleIn = productAssambleIn;
        return this;
    }

    public Phone() {
    }

    public Phone(String company, String version, String internalMemory, boolean expendable, String display, String price, String currency,
            String batteryCapacity, String productMadeIn, String productAssambleIn) {
        this.company = company;
        this.version = version;
        this.internalMemory = internalMemory;
        this.expendable = expendable;
        this.display = display;
        this.price = price;
        this.currency = currency;
        this.batteryCapacity = batteryCapacity;
        this.productMadeIn = productMadeIn;
        this.productAssambleIn = productAssambleIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Phone))
            return false;
        Phone phone = (Phone) o;
        return isExpendable() == phone.isExpendable() && Objects.equals(getCompany(), phone.getCompany()) && Objects
                .equals(getVersion(), phone.getVersion()) && Objects.equals(getInternalMemory(), phone.getInternalMemory()) && Objects
                .equals(getDisplay(), phone.getDisplay()) && Objects.equals(getPrice(), phone.getPrice()) && Objects
                .equals(getCurrency(), phone.getCurrency()) && Objects.equals(getBatteryCapacity(), phone.getBatteryCapacity()) && Objects
                .equals(getProductMadeIn(), phone.getProductMadeIn()) && Objects.equals(getProductAssambleIn(), phone.getProductAssambleIn());
    }

    @Override
    public int hashCode() {
        return Objects
                .hash(getCompany(), getVersion(), getInternalMemory(), isExpendable(), getDisplay(), getPrice(), getCurrency(), getBatteryCapacity(),
                        getProductMadeIn(), getProductAssambleIn());
    }

    @Override
    public String toString() {
        return "Phone{" + "company='" + company + '\'' + ", version='" + version + '\'' + ", internalMemory='" + internalMemory + '\''
                + ", expendable=" + expendable + ", display='" + display + '\'' + ", price='" + price + '\'' + ", currency='" + currency + '\''
                + ", batteryCapacity='" + batteryCapacity + '\'' + ", productMadeIn='" + productMadeIn + '\'' + ", productAssambleIn='"
                + productAssambleIn + '\'' + '}';
    }
}
