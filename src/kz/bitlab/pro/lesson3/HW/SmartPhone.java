package kz.bitlab.pro.lesson3.HW;

public class SmartPhone {
    private String name;
    private String model;
    private PhoneProcessor phoneProcessor;
    private PhoneMemory phoneMemory;

    public SmartPhone() {}

    public SmartPhone(String name, String model, PhoneProcessor phoneProcessor, PhoneMemory phoneMemory) {
        this.name = name;
        this.model = model;
        this.phoneProcessor = phoneProcessor;
        this.phoneMemory = phoneMemory;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public PhoneProcessor getPhoneProcessor() {
        return phoneProcessor;
    }

    public PhoneMemory getPhoneMemory() {
        return phoneMemory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPhoneProcessor(PhoneProcessor phoneProcessor) {
        this.phoneProcessor = phoneProcessor;
    }

    public void setPhoneMemory(PhoneMemory phoneMemory) {
        this.phoneMemory = phoneMemory;
    }

//    public int getPrice()
}
