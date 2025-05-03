package customCLass.CarClass.RelacionalClass;

public class CarRelational {
    private int id;
    private Engine engine;
    private Tank tank;
    private Person person;

    private static int lastId;

    public CarRelational() {
        this.id = ++lastId;
    }

    public CarRelational(Engine engine, Tank tank, Person person) {
        this.id = ++lastId;
        this.engine = engine;
        this.tank = tank;
        this.person = person;
    }

    public int getId() {return id;}

    public Engine getEngine() {return engine;}

    public Tank getTank() {return tank;}

    public Person getPerson() {return person;}

    public void setId(int id) {
        this.id = id;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getDetail () {
        return "Id: " + this.id
                + "\nEngine type: " + this.engine.getType()
                + "\nEngine Dilindered: " + this.engine.getDilindered()
                + "\nTank capacity: " + this.tank.getCapacity()
                + "\nPerson name: " + this.person.getName()
                + "\nPerson lastname: " + this.person.getLastname();
    }
}
