package customCLass;

public class Absorb {
    public static void main(String[] args) {
        Car newCar = new Car();
        /*
         * Because this two attributes are private, we need assigment by public methods
         * We can't newCar.nameCar = "GT2" => That is a error
         */
        newCar.setNameCar("GT2");
        newCar.setBrandCar("Nissan");

        // This line is possible for the Override
        System.out.println(newCar); // GT2 Nissan

        //The normal is like this
        System.out.println(newCar.getNameCar() + " " + newCar.getBrandCar()); // GT2 Nissan

    }
}
