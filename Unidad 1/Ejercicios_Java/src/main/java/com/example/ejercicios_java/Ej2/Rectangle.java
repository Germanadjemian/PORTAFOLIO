package com.example.ejercicios_java.Ej2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Rectangle {
    public int width;
    public int height;
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public float area()
    {
        float area= width*height/2;
        return area;
    }
}
