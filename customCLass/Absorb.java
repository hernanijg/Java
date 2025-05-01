package customCLass;

public class Absorb {
    public static void main(String[] args) {
        Car newCar = new Car("GT2", "Nissan");
        Car newCar2 = new Car("GT2", "Nissan");
        System.out.println(newCar);
        /*
         * The compare don't have access for object,
         * The equals is change at the car.java file
         */
        System.out.println(newCar == newCar2); // False
        System.out.println(newCar.equals(newCar2)); // True
        /*
         * Because this two attributes are private
         * we need assigment by public methods or configurate constructor
         * We can't newCar.nameCar = "GT2" => That is a error
         * for change values we can =>
         */
        newCar.setNameCar("GT3");
        newCar.setBrandCar("Nissan Sport");

        // This line is possible for the Override
        System.out.println(newCar); // GT2 Nissan

        //The normal is like this
        System.out.println(newCar.getNameCar() + " " + newCar.getBrandCar()); // GT2 Nissan

    }
}
