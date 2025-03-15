public class AgendaPhone implements PhoneNumber{
    private String countryCode, number;

    public AgendaPhone (String countryCode, String number) {
        this.countryCode = countryCode;
        this.number = number;
    }

    @Override
    public String getPhoneNumber() {
        return "+" + countryCode + "-" + number;
    }
}
