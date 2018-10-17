public class DeliveryAddress
{
    private String line1;
    private String line2;
    private String zipCode;
    private String city;
    private String country;

    public DeliveryAddress(String line1, String line2, String zipCode, String city, String country)
    {
        this.line1=line1;
        this.line2=line2;
        this.zipCode=zipCode;
        this.city=city;
        this.country=country;
    }
}
