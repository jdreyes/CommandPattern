package es.sanitas.patterns.commandpattern.command.impl;

import es.sanitas.patterns.commandpattern.command.Command;
import es.sanitas.patterns.commandpattern.receiver.ConsumerElectronics;

import java.util.List;

/**
 * Created by jreyes on 20/3/15.
 */
public class MuteAllCommand implements Command {

    private List<ConsumerElectronics> ceList;

    public MuteAllCommand(List<ConsumerElectronics> ceList) {
        this.ceList = ceList;
    }

    @Override
    public void execute() {

        for(ConsumerElectronics ce : ceList) {
            ce.mute();
        }
    }
}
