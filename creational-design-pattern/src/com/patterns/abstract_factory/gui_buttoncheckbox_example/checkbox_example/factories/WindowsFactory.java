package com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.factories;

import com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.product_hierarchies.buttons.Button;
import com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.product_hierarchies.buttons.WindowsButton;
import com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.product_hierarchies.checkboxes.Checkbox;
import com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.product_hierarchies.checkboxes.WindowsCheckbox;

//Concrete Factory
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox creatCheckbox() {
        return new WindowsCheckbox();
    }

}
