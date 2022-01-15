package realestatelistings;

public class Property {
    private double askingPrice;
    private String propertyType;
    private double lotSize;
    private int numBaths;
    private int numBeds;
    public Property(double askingPrice, String propertyType, double lotSize,
                    int numBaths, int numBeds) {
        this.askingPrice = askingPrice;
        this.propertyType = propertyType;
        this.lotSize = lotSize;
        this.numBaths = numBaths;
        this.numBeds = numBeds;
    }
}
