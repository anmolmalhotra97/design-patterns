package com.patterns.factory.ImageExample;

import java.util.Scanner;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DecodedImage decodedImage;

        //Image Reader Interface (Generalized Category of Image Reader) object
        ImageReader reader = null;

        System.out.println("Choose 1 for gif and 2 for jpeg");
        String image = (1 == scanner.nextInt()) ? "gif" : "jpeg";

        if (image.equals("gif"))
            reader = new GifReader(image);

        if (image.equals("jpeg"))
            reader = new JpegReader(image);

        decodedImage = reader.getDecodedImage();
        System.out.println(decodedImage);

        scanner.close();
    }
}
