package com.example.try_with_resources;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        FileReader reader = null;
// Finally close method

        try {
            reader = new FileReader("Main.txt"); // checked exception because the ide checked for it!
            var value = reader.read();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally { // Will happen in both success / failure scenarios!
            // finally = close method
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }



    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }
}
