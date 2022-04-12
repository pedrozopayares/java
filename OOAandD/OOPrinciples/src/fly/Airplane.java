package fly;

/**
 * Class Airplane represents an airplane.
 * It is a super class of the classes Jet and Biplane.
 */
public class Airplane {
    public int speed;

    public Airplane() {
        speed = 0;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
