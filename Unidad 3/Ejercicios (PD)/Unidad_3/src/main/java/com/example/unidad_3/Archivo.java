package com.example.unidad_3;

import java.io.File;

public class Archivo
{
    public static File OpenFile(String archivo)
    {
        archivo=archivo.replace("\\","\\\\");
        File file= new File(archivo);
        return file;
    }
}

