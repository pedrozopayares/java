package test;

import fly.Jet;

public class FlyTest3 {
    public static void main(String[] args) throws Exception {
        Jet jet1 = new Jet();
        jet1.speed = 212;
        System.out.println("Jet1 speed: " + jet1.speed);

        Jet jet2 = new Jet();
        jet2.setSpeed(212);
        System.out.println("Jet2 speed: " + jet2.getSpeed());

    }

}
