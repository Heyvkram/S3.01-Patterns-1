interface AgendaFactory {
    Address createAddress(String street, String city, String zip);
    PhoneNumber createPhoneNumber(String countryCode, String PhoneNumber);
}
