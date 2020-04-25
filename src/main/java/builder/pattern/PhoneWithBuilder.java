package builder.pattern;

public class PhoneWithBuilder {
    private String company;
    private String version;
    private String internalMemory;
    private boolean expendable;
    private String display;
    private String price;
    private String currency = "$";
    private String batteryCapacity;
    private String productMadeIn;
    private String productAssembledIn;
    private String processor;
    private String camera;

    public PhoneWithBuilder(Builder builder) {
        this.company = builder.company;
        this.version = builder.version;
        this.internalMemory = builder.internalMemory;
        this.expendable = builder.expendable;
        this.display = builder.display;
        this.price = builder.price;
        this.currency = builder.currency;
        this.batteryCapacity = builder.batteryCapacity;
        this.productMadeIn = builder.productMadeIn;
        this.productAssembledIn = builder.productAssambleIn;
        this.camera = builder.camera;
        this.processor = builder.processor;
    }

    public String getProcessor() {
        return processor;
    }

    public String getCamera() {
        return camera;
    }

    public String getCompany() {
        return company;
    }

    public String getVersion() {
        return version;
    }

    public String getInternalMemory() {
        return internalMemory;
    }

    public boolean isExpendable() {
        return expendable;
    }

    public String getDisplay() {
        return display;
    }

    public String getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public String getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getProductMadeIn() {
        return productMadeIn;
    }

    public String productAssembledIn() {
        return productAssembledIn;
    }

    public static class Builder {
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
        private String processor;
        private String camera;

        public Builder() {
        }

        public PhoneWithBuilder build() {
            return new PhoneWithBuilder(this);
        }

        public Builder company(String company) {
            this.company = company;
            return this;
        }

        public Builder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder camera(String camera) {
            this.camera = camera;
            return this;
        }

        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public Builder internalMemory(String internalMemory) {
            this.internalMemory = internalMemory;
            return this;
        }

        public Builder expendable(boolean expendable) {
            this.expendable = expendable;
            return this;
        }

        public Builder display(String display) {
            this.display = display;
            return this;
        }

        public Builder price(String price) {
            this.price = price;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder batteryCapacity(String batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
            return this;
        }

        public Builder productMadeIn(String productMadeIn) {
            this.productMadeIn = productMadeIn;
            return this;
        }

        public Builder productAssembledIn(String productAssembledIn) {
            this.productAssambleIn = productAssembledIn;
            return this;
        }

    }

    @Override
    public String toString() {
        return "Phonev2{" + "company='" + company + '\'' + ", version='" + version + '\'' + ", internalMemory='" + internalMemory + '\''
                + ", expendable=" + expendable + ", display='" + display + '\'' + ", price='" + price + '\'' + ", currency='" + currency + '\''
                + ", batteryCapacity='" + batteryCapacity + '\'' + ", productMadeIn='" + productMadeIn + '\'' + ", productAssambleIn='"
                + productAssembledIn + '\'' + ", processor='" + processor + '\'' + ", camera='" + camera + '\'' + '}';
    }
}
