package com.assignments.a11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide input class name as a command line argument ");
            return;
        }

        String fileName = args[0];

        try {
            Map<Character, Integer> charCountMap = countCharacters(fileName);
            saveCharacterCount(charCountMap);
            System.out.println("Character count saved to 'output.txt'.");
        } catch (IOException e) {
            System.out.println("Error processing the file: " + e.getMessage());
        }
    }

    private static Map<Character, Integer> countCharacters(String fileName) throws IOException {
        Map<Character, Integer> charCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int character;
            while ((character = reader.read()) != -1) {
                char c = (char) character;
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        return charCountMap;
    }

    private static void saveCharacterCount(Map<Character, Integer> charCountMap) throws IOException {
        try (PrintWriter writer = new PrintWriter("output.txt")) {
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                char c = entry.getKey();
                int count = entry.getValue();
                //write output to the output file
                writer.println("Character: " + c + ", Count: " + count);
            }
        }
    }
}
