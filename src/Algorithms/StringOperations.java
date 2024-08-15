package Algorithms;

public class StringOperations {
    public static void main(String[] args) {
        String s = "dajjaqi";
        searchInString(s, 'j');
    }

    static boolean searchInString(String str, char c){
        if (str.isEmpty()){
            System.out.println("string is empty");
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==c){
                System.out.println("position i="+i);
                return true;
            }
        }
        return false;
    }

}
