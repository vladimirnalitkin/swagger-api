package com.van.springswagger;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class JsGenerator {
    @Test
    public void smokeTest() throws IOException {
        String data = new String(Files.readAllBytes(Paths.get("./swagger/output/swagger.json")));
        data = "var swaref = " + data;
        Files.write(Paths.get("./swagger/output/swagger.js"), data.getBytes());
    }
}
