package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OwlCounter {
    private List<OwlNumberInCountry> owlList = new ArrayList<>();

    public void readFromFile(Path path) {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            //e.printStackTrace();
            throw new IllegalStateException("Can not read file.", e);
        }

        // Ezt a feldolgozást is ki lehetne szervezni egy metódusba,
        // de a feladatban az szerepelt, hogy ebben a metódusban töltsem fel az értékeket.
        for (String line : lines) {
            int position = line.indexOf('=');
            String country = line.substring(0, position);
            int number = Integer.parseInt(line.substring(position + 1, line.length()));
            OwlNumberInCountry owlNumberInCountry = new OwlNumberInCountry(country, number);
            owlList.add(owlNumberInCountry);
        }
    }

    public int getNumberOfOwls(String findCountry) {
        for (OwlNumberInCountry element : owlList) {
            if (element.getCountryName().equals(findCountry)) {
                return element.getNumber();
            }
        }
        throw new IllegalArgumentException("No such county in Hungary!");
    }

    public int getNumberOfAllOwls() {
        int result = 0;
        for (OwlNumberInCountry element : owlList) {
            result += element.getNumber();
        }
        return result;
    }

}
