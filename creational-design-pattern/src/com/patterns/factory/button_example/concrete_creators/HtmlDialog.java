package com.patterns.factory.button_example.concrete_creators;

import com.patterns.factory.button_example.base_creator.Dialog;
import com.patterns.factory.button_example.common_product_interface.Button;
import com.patterns.factory.button_example.concrete_products.HtmlButton;

public class HtmlDialog extends Dialog{

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
    
}
