public class Main {
    public static void main(String[] args) {
        AgendaContactFactory NewContactFactory = new AgendaContactFactory();
        Address NewAddress = NewContactFactory.createAddress("Kauppakatu Street", "Jyväskylä", "19910");
        PhoneNumber NewPhone = NewContactFactory.createPhoneNumber("358", "041 123 4567");

        System.out.println("Address: " + NewAddress.getAddress());
        System.out.println("Phone: " + NewPhone.getPhoneNumber());
    }
}