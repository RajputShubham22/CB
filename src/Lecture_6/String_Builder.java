package Lecture_6;

public class String_Builder {
    public static void main(String[] args) {
        String line="Vgdauovahoiwhviw";
        System.out.println(toggle(line));
        }

    public static String toggle(String line){
    StringBuilder builder = new StringBuilder();
        for (int i = 0; i <line.length() ; i++) {
            char ch=line.charAt(i);
            if(ch>='a' && ch<='z') {
                ch = (char) (ch - 'a' + 'A');
            }
            else if(ch>='A' && ch<='Z'){
                ch=(char)(ch - 'A' +'a');
            }

        builder.append(ch);

        }
        return builder.toString();

    }
}
