package customCLass.CarClass.RelacionalClass;

public class Engine {
    private double Dilindered;
    private EngineType type;

    public Engine() {
    }

    public Engine(double dilindered, EngineType type) {
        Dilindered = dilindered;
        this.type = type;
    }

    public double getDilindered() {
        return Dilindered;
    }

    public EngineType getType() {
        return type;
    }

    public void setDilindered(double dilindered) {
        Dilindered = dilindered;
    }

    public void setType(EngineType type) {
        this.type = type;
    }
}
