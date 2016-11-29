package com.company;


import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        HashMap<String, ArrayList<Country>> countries = new HashMap();
        ArrayList<Country> nation = new ArrayList<>();

        File f = new File("Countries.txt");
        Scanner fileScanner = new Scanner(f);
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] columns = line.split("\\|");
            Country c = new Country(columns[1], columns[0]);
            nation.add(c);
            if (countries.containsKey(c.name.substring(0, 1))) {
                ArrayList<Country> s = countries.get(c.name.substring(0, 1));
                s.add(c);

            } else {
                ArrayList<Country> s = new ArrayList<>();
                s.add(c);
                countries.put(c.name.substring(0, 1), s);
            }
        }

        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("Enter the First letter of the country");
        String input = consoleScanner.nextLine();
        if (input.length() > 1) {
            throw new Exception("Please enter the first letter");
        }

        ArrayList<Country> s = countries.get(input.toLowerCase());
        JsonSerializer b = new JsonSerializer();
        String json = b.include("*").serialize(s);
        File n = new File(input + "_Countries.txt");
        FileWriter fw = new FileWriter(n);
        fw.write(json);
        fw.close();
//        for (Country o : s) {
//            filewrite(fw, o);
//        }
//        fw.close();





        // write your code here
    }

    public static void filewrite(FileWriter fw, Country o) throws IOException{
        fw.append(o.name + "\n");

    }


}

