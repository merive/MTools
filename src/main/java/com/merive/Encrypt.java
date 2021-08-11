package com.merive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Encrypt implements Chipper {

    public static HashMap<String, String> chipper(int seed) {
        Random r = new Random(seed);
        HashMap<String, String> alf = new HashMap<>();
        ArrayList<String> alfLower = new ArrayList<>(Arrays.asList(("abcdefghijklmnopqrstuvwxyz.,!?&/:'-@#~ABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890_+=<>$%^*()\n").split("")));
        ArrayList<String> alfUpper = new ArrayList<>(Arrays.asList(("abcdefghijklmnopqrstuvwxyz.,!?&/:'-@#~ABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890_+=<>$%^*()\n").split("")));
        alfUpper.forEach((n) -> {
            int ran = r.nextInt(alfLower.size());
            alf.put(alfLower.get(ran), n);
            alfLower.remove(alfLower.get(ran));
        });
        return alf;
    }


    public static String encrypt(String text, int seed) {
        StringBuilder res = new StringBuilder();
        String[] n = text.split("");
        for (int i = 0; i < text.length(); i++) {
            res.append(chipper(seed).get(n[i]));
        }
        return res.toString();
    }

}
