public class Gamer {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    private String name;
    private int age;
    private int phoneNumber;
    private String platform;


    public Gamer(String name, int age, int phoneNumber, String platform) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.platform = platform;
    }
}
