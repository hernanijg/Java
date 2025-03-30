package Filters;

public class FilterUtils {

    public static int[] filterChar(char chart, String text){
        int total = 0;
        int test = 1;

        for (int i = 0; i < text.length(); i++){
            char result = text.charAt(i);

            if (result == chart){
                total = total + 1;
            }
        }

        return new int[]{total, test};
    }

//    public static String changeChar(char charChange, int indices, String text){
//
//    };

}
