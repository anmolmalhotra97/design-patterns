package com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.client_app;

import com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.factories.GUIFactory;
import com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.product_hierarchies.buttons.Button;
import com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.product_hierarchies.checkboxes.Checkbox;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.creatCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
