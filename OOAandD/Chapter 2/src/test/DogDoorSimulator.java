package test;

import dogdoor.DogDoor;
import dogdoor.Remote;

public class DogDoorSimulator {
    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);

        System.out.println("Fido barks to go outside...");
        remote.pressButton();
        System.out.println("\nFido's has gone outside...");
        remote.pressButton();
        System.out.println("\nFido's all done...");
        remote.pressButton();
        System.out.println("\nFido's back inside...");
        remote.pressButton();

    }
}
