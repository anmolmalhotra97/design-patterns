package com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.factories;

import com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.product_hierarchies.buttons.Button;
import com.patterns.abstract_factory.gui_buttoncheckbox_example.checkbox_example.product_hierarchies.checkboxes.Checkbox;

//Abstract Factory
public interface GUIFactory {
    Button createButton();

    Checkbox creatCheckbox();
}
