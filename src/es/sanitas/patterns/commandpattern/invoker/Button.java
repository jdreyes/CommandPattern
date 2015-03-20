package es.sanitas.patterns.commandpattern.invoker;

import es.sanitas.patterns.commandpattern.command.Command;

/**
 * Created by jreyes on 20/3/15.
 */
public class Button {

    private Command c;

    public Button(Command c) {
        this.c = c;
    }

    public void click() {
        c.execute();
    }
}
