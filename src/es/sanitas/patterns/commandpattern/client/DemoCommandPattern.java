package es.sanitas.patterns.commandpattern.client;

import es.sanitas.patterns.commandpattern.command.impl.MuteAllCommand;
import es.sanitas.patterns.commandpattern.command.impl.OnCommand;
import es.sanitas.patterns.commandpattern.invoker.Button;
import es.sanitas.patterns.commandpattern.receiver.ConsumerElectronics;
import es.sanitas.patterns.commandpattern.receiver.impl.SoundSystem;
import es.sanitas.patterns.commandpattern.receiver.impl.Television;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jreyes on 20/3/15.
 */
public class DemoCommandPattern {

    public static void main(String... args) {

        activarTv();

        quitarSonidoATodos();

    }

    private static void activarTv() {

        System.out.println("Activando la TV...");
        //Vamos a activar la TV
        final ConsumerElectronics ce = UniversalRemote.getActiveDevice();
        final OnCommand onCommand = new OnCommand(ce);
        final Button onButton = new Button(onCommand);

        onButton.click();

        //Qué imprimirá por consola...?
    }

    private static void quitarSonidoATodos() {

        System.out.println("Silenciando el mundo...");

        final List<ConsumerElectronics> ceList = new ArrayList<ConsumerElectronics>();

        final Television tv = new Television();
        final SoundSystem ss = new SoundSystem();

        ceList.add(tv);
        ceList.add(ss);

        final MuteAllCommand aCallarTodos = new MuteAllCommand(ceList);
        final Button botonDeACallar = new Button(aCallarTodos);

        botonDeACallar.click();
    }
}
