package controlFlows;

public class TagsControl {
    public static void main(String[] args) {
        String sentence = "Tres tristes tigres tragan trigo en un trigal";
        String wordl =  "trigo";
        int max = sentence.length();
        int count = 0;
        char charti = 't';

        search:
        for (int i = 0; i < max; i++) {
            int k = i;
            for (int j = 0; j < wordl.length(); j++) {
                if (sentence.charAt(k++) != wordl.charAt(j)) {
                    continue search;
                }
            }
            count++;

        }

        System.out.println("count + \"letra\" + charti = " + count + " letra " + wordl);
    }
}
