package customCLass.CarClass.RelacionalClass;

public class AbsorbCarRelational {
    public static void main(String[] args) {
        /*
         * If u check, we can create relacional objects like this
         * engine, tank and person are object, but all then relational by CarRelacional Obj
         * so, if we're create a CR object, we need assign the another 3 objects.
         * But we can create for example a single engine or single person
         * that is not a error.
         */
        CarRelational newCar = new CarRelational(
                new Engine(2.2, EngineType.DIESEL),
                new Tank(),
                new Person("Hernani", "Gonzalez"));
        System.out.println(newCar.getDetail());

        CarRelational newCar2 = new CarRelational(
                new Engine(3.3, EngineType.REGULAR),
                new Tank(),
                new Person("Jhon", "Doe")
        );
        System.out.println(newCar2.getDetail());

        CarRelational newCar3 = new CarRelational(
                new Engine(5.3, EngineType.BENCINA),
                new Tank(),
                new Person("Leon", "Kennedy")
        );
        System.out.println(newCar3.getDetail());

        // We can change relacional parameter like this =>
        newCar.getTank().setCapacity(45);
        System.out.println(newCar.getDetail());
    }
}
