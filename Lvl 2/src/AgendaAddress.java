public class AgendaAddress implements Address{
    private String street, city, zip;

    public AgendaAddress(String street, String city, String zip) {
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    @Override
    public String getAddress() {
        return street + ", " + city + ", " + zip;
    }
}

