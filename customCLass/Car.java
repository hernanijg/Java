package customCLass;

public class Car {
    /*
    * When the attributes are pivate
    * we need asignate values by public methods like => setNameCar();
    * same for return info like => getNameCar();
    * */
    private String nameCar;
    private String brandCar;

    /*
    * Standard Constructor
    * This is a Standar so we don't need return nothing
    * or assign avoid
    * We can create overcharge method like this =>
    */
    public Car(String nameCar){
        this.nameCar = nameCar;
    }
    public Car(String nameCar, String brandCar){
        this.nameCar = nameCar;
        this.brandCar = brandCar;
    }
    /*
    * The public methos can assign values to own private methods
    * and return that to another files, like Absorb.java
    * Use get... And set... Is Pojo and that is a standar in this case
    * */
    public void setNameCar(String nameCar) { // We can recieve new values
        this.nameCar = nameCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getNameCar() {
        return nameCar; // We can return private values
    }

    public String getBrandCar() {
        return brandCar;
    }


    // For more ease visualice data
    @Override
    public String toString() {
        return this.nameCar + " " + this.brandCar;
    }

    /* The real equal for objects
     * We can't compare all object
     * so we need compare the obj attributes
     */
    @Override
    public boolean equals(Object obj){
        Car a = (Car) obj; // Cast Object obj to Car obj
        return (this.brandCar.equals(a.brandCar) && this.nameCar.equals(a.nameCar));
    }
}
