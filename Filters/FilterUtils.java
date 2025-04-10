package Filters;

import java.util.ArrayList;

public class FilterUtils {

    public static ArrayList<Integer> filterCharIndices(char chart, String text){
        ArrayList<Integer> lost = new ArrayList<Integer>();
        for (int i = 0; i < text.length(); i++){
            char result = text.charAt(i);
            if (result == chart){
                lost.add(i);
            }
        }

        return lost;
    }

    public static String changeChar(char charChange, ArrayList<Integer> indices, String text){
        char[] characteres = text.toCharArray();
        for (int i = 0; i < indices.size(); i++){
            characteres[indices.get(i)] = charChange;
        }
        String textReformer = new String(characteres);
        return  textReformer;
    };
}
