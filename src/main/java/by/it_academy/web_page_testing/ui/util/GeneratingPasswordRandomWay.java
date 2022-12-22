package by.it_academy.web_page_testing.ui.util;

import java.util.Random;

public class GeneratingPasswordRandomWay{
    private static final String ALFANUMERICAL_LIST = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static Random random = new Random();

    public static String getPassword(int length){
        StringBuilder stringBuilder = new StringBuilder(length);
        for(int i = 0; i < length; i++){
            stringBuilder.append(ALFANUMERICAL_LIST.charAt(random.nextInt(ALFANUMERICAL_LIST.length())));
        }
        return stringBuilder.toString();
    }
}
