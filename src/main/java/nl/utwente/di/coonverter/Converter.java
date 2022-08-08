package nl.utwente.di.coonverter;

public class Converter {
    public double convert(String cell) {

        double cel = Double.parseDouble(cell);
        double fahre = cel*1.8 + 32;
        return fahre;
    }
}
