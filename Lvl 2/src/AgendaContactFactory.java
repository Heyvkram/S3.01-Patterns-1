class AgendaContactFactory implements AgendaFactory {
    @Override
    public Address createAddress(String street, String city, String zip) {
        return new AgendaAddress(street, city, zip);
    }

    @Override
    public PhoneNumber createPhoneNumber(String countryCode, String number) {
        return new AgendaPhone(countryCode, number);
    }
}