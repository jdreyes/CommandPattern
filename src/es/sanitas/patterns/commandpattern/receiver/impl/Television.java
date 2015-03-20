package es.sanitas.patterns.commandpattern.receiver.impl;

import es.sanitas.patterns.commandpattern.receiver.ConsumerElectronics;

/**
 * Created by jreyes on 20/3/15.
 */
public class Television implements ConsumerElectronics {

    @Override
    public void on() {
        System.out.println("¡¡Televisión encendida!!\n");
    }

    @Override
    public void mute() {
        System.out.println("Televisión sin sonido :(");
    }
}
