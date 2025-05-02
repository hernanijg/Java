package customCLass.CarClass;

/* We have parameters and that never change,
 * for that we use enum, for constanst objects
 * Is like a objects but is standard for constanst objects
 * for example this cars descriptions ->
 */
public enum BrandCarE {
    NISSAN("Nissan", "Japan"),
    TOYOTA("Toyota", "Japan"),
    FERRARI("Ferrari", "Italy"),
    PORCHE("Toyota", "Italy");

    // Assign values to obj like namd => Nissan | country => Japan
    private final String name;
    private final String country;

    // New Constructor
    BrandCarE(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
}