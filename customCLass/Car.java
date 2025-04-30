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
}
