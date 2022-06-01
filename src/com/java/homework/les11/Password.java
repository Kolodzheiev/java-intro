package com.java.homework.les11;


import com.java.common.ConsoleUtils;



public class Password {
    public static void main(String[] args) {
        String[] arrayPassword = getPassword();
        String stringPassword = String.join("", arrayPassword);
        System.out.println("---PASSWORD---");
        System.out.println(stringPassword);


    }

    private static String[] getPassword() {
        int min = 0;
        int max = 9;
        String letterBig = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letterSmall = letterBig.toLowerCase();
        String symbol = "_";
        String[] arrayPassword = new String[8];

        boolean isLetterBig = false;
        boolean isLetterSmall = false;
        boolean isSymbol = false;
        boolean isNumber = false;

        for (int i = 0; i < arrayPassword.length; i++) {
            int randomCase = (int) (Math.random() * 4);

            switch (randomCase) {
                case 0 -> {
                    isLetterSmall = true;
                    arrayPassword[i] = String.valueOf(letterSmall.charAt((int) (Math.random() * letterSmall.length())));
                }
                case 2 -> {
                    isLetterBig = true;
                    arrayPassword[i] = String.valueOf(letterBig.charAt((int) (Math.random() * letterBig.length())));
                }
                case 1 -> {
                    isNumber = true;
                    arrayPassword[i] = String.valueOf(ConsoleUtils.random(min, max));
                }
                case 3 -> {
                    isSymbol = true;
                    arrayPassword[i] = symbol;
                }
            }
        }
        if (isLetterBig && isLetterSmall && isNumber && isSymbol){
            return arrayPassword;
        }else{
            return getPassword();
        }

    }

}
