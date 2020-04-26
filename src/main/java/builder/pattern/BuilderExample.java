package builder.pattern;

public class BuilderExample {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.
                setBatteryCapacity("300v").setCompany("apple").setDisplay("OLED");

        System.out.println(phone);

        PhoneWithBuilder phoneBuilder = new PhoneWithBuilder.Builder()
                .batteryCapacity("200V")
                .camera("30 MP")
                .currency("eur")
                .display("OLED")
                .expendable(true)
                .processor("Snapdragon 710")
                .version("5.0")
                .productMadeIn("India")
                .company("LG")
                .productAssembledIn("China")
                .build();

        System.out.println(phoneBuilder);
    }
}
