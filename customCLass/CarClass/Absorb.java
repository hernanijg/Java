package customCLass.CarClass;

public class Absorb {
    public static void main(String[] args) {
        Car newCar = new Car("GT2", BrandCarE.NISSAN);
        Car newCar2 = new Car("GT2", BrandCarE.NISSAN);
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
        newCar.setNameCar("Huracan");
        newCar.setBrandCar(BrandCarE.FERRARI);

        // Because we have a enum type we can take the country like this.
        System.out.println(newCar.getBrandCar().getCountry());

        //The normal is like this
        System.out.println(newCar.getNameCar() + " " + newCar.getBrandCar()); // Canry TOYOTA

        // We can take values and compare in switch or if
        switch (BrandCarE.NISSAN){
            case NISSAN -> System.out.println("The country pattner is Japan");
            case TOYOTA -> System.out.println("The country pattner is Japan");
            case FERRARI -> System.out.println("This car is from italy");
            case PORCHE -> System.out.println("This car is from Itally");
        }

        BrandCarE[] types = BrandCarE.values();
        for (BrandCarE t: types){
            System.out.println(t + " => "
            + t.getName() + ", "
            + t.getCountry());

            System.out.println();
        }

    }
}
