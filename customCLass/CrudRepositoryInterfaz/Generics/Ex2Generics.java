package customCLass.CrudRepositoryInterfaz.Generics;

import javax.crypto.Mac;

public class Ex2Generics {
    public static void main(String[] args) {
        Truck<Animals> transportHourses = new Truck(5);
        transportHourses.add(new Animals("Ramon", "Hourse"));
        transportHourses.add(new Animals("Jules", "Hourse"));
        transportHourses.add(new Animals("Miles", "Hourse"));
        transportHourses.add(new Animals("Lucius", "Hourse"));
        transportHourses.add(new Animals("Kiko", "Hourse"));

        for (Animals a: transportHourses) {
            System.out.println(a.getName() + " Type: " + a.getType());
        }

        Truck<Machines> transportMachines = new Truck(3);
        transportMachines.add(new Machines("Bulldozer"));
        transportMachines.add(new Machines("Perfomadora"));
        transportMachines.add(new Machines("Grua"));

        for (Machines a: transportMachines) {
            System.out.println("Type: " + a.getType());
        }

        Truck<Car> transportCars = new Truck(2);
        transportCars.add(new Car("Mitsubichy"));
        transportCars.add(new Car("Mercedez"));

        for (Car a: transportCars) {
            System.out.println("Brand: " + a.getBrand());
        }
    }
}
