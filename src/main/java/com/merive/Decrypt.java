package com.merive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Decrypt implements Chipper {

    public static HashMap<String, String> chipper(int seed) {
        Random r = new Random(seed);
        HashMap<String, String> alf = new HashMap<>();
        ArrayList<String> alfLower = new ArrayList<>(Arrays.asList(("abcdefghijklmnopqrstuvwxyz.,!?&/:'-@#~ABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890_+=<>$%^*()\n").split("")));
        ArrayList<String> alfUpper = new ArrayList<>(Arrays.asList(("abcdefghijklmnopqrstuvwxyz.,!?&/:'-@#~ABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890_+=<>$%^*()\n").split("")));
        alfUpper.forEach((n) -> {
            int ran = r.nextInt(alfLower.size());
            alf.put(n, alfLower.get(ran));
            alfLower.remove(alfLower.get(ran));
        });
        return alf;
    }


    public static String decrypt(String text, int seed) {
        StringBuilder res = new StringBuilder();
        String[] n = text.split("");
        for (int i = 0; i < text.length(); i++) {
            res.append(Decrypt.chipper(seed).get(n[i]));
        }
        return res.toString();
    }
}
