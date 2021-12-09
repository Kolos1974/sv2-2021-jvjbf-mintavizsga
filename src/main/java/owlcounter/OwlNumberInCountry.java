package owlcounter;

public class OwlNumberInCountry {
    private String countryName;
    private int number;

    public OwlNumberInCountry(String countryName, int number) {
        this.countryName = countryName;
        this.number = number;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getNumber() {
        return number;
    }
}
