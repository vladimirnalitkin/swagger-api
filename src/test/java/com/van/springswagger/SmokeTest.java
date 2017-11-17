package com.van.springswagger;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;


public class SmokeTest {
    @Test
    public void smokeTest() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File jsonFile = new File("./swagger/output/swagger.json");
        String data = FileUtils.readFileToString(jsonFile);
        data = "var swaref = " + data;
        File jsFile = new File("./swagger/output/swagger.js");
        FileUtils.writeStringToFile(jsFile, data);
    }


}
