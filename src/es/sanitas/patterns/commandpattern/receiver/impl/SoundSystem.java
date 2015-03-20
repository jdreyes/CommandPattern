package es.sanitas.patterns.commandpattern.receiver.impl;

import es.sanitas.patterns.commandpattern.receiver.ConsumerElectronics;

/**
 * Created by jreyes on 20/3/15.
 */
public class SoundSystem implements ConsumerElectronics {


    @Override
    public void on() {
        System.out.println("¡¡Sistema de sonido encendido!!");
    }

    @Override
    public void mute() {
        System.out.println("Sistema de sonido sin sonido, qué irónico... :(");
    }

}
