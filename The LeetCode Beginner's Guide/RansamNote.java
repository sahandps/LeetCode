import org.w3c.dom.Node;

public class RansamNote {

    public static void main(String[] args) {

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);

            int matchingIndex = -1;
            for (int j = 0; j < magazine.length(); j++) {
                char m = magazine.charAt(j);


                if(m == r){
                    matchingIndex = j;
                }
            }

            if(matchingIndex == -1){
                return false;
            }

            magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);
        }

        return true;

    }

}
