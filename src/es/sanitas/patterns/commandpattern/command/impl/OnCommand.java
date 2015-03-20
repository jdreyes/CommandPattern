package es.sanitas.patterns.commandpattern.command.impl;

import es.sanitas.patterns.commandpattern.command.Command;
import es.sanitas.patterns.commandpattern.receiver.ConsumerElectronics;

/**
 * Created by jreyes on 20/3/15.
 *
 * Turns on a consumer electronic
 */
public class OnCommand implements Command {

    private ConsumerElectronics ce;

    public OnCommand(ConsumerElectronics ce) {
        this.ce = ce;
    }

    @Override
    public void execute() {
        ce.on();
    }
}
