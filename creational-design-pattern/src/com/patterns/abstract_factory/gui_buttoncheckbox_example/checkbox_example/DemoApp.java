package com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example;

import com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.client_app.Application;
import com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.factories.GUIFactory;
import com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.factories.MacOSFactory;
import com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.factories.WindowsFactory;

public class DemoApp {
    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

}
