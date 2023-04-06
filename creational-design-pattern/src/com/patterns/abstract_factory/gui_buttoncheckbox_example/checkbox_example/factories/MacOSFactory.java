package com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.factories;

import com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.product_hierarchies.buttons.Button;
import com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.product_hierarchies.buttons.MacOSButton;
import com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.product_hierarchies.checkboxes.Checkbox;
import com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.product_hierarchies.checkboxes.MacOSCheckbox;

//Concrete Factory
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox creatCheckbox() {
        return new MacOSCheckbox();
    }

}
