package com.company;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by gilbertakpan on 11/29/16.
 */
public class countryTest {

    @Test
    public void testFilewrite() throws Exception{
        Country country = new Country("China", "CN");
        File n = new File("test.txt");
        FileWriter fw = new FileWriter(n);
        Main.filewrite(fw, country);
        fw.close();

        Scanner fileScanner = new Scanner(n);
        fileScanner.nextLine();





        }





}
