package es.sanitas.patterns.commandpattern.client;

import es.sanitas.patterns.commandpattern.receiver.ConsumerElectronics;
import es.sanitas.patterns.commandpattern.receiver.impl.Television;

/**
 * Created by jreyes on 20/3/15.
 */
public class UniversalRemote {

    public static ConsumerElectronics getActiveDevice() {
        //Circuito electrónico super complejo va aquí ;)
        Television tv = new Television();
        return tv;
    }
}
