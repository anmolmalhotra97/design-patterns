package com.patterns.factory.button_example.base_creator;

import com.patterns.factory.button_example.common_product_interface.Button;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Dialog {

    public void renderWindow(){
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }
    
    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     * 
     * It is important that the return type of this method matches the product interface
     */
    public abstract Button createButton();
}
