package com.patterns.factory.button_example.concrete_products;

import com.patterns.factory.button_example.common_product_interface.Button;

/**
 * HTML button implementation.
 */
public class HtmlButton implements Button{

    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button Says - 'Hello world!'");
    }
    
}
