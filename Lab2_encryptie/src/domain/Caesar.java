package domain;

import java.lang.reflect.Array;

public class Caesar implements Encryptor {

    private int key;

    public Caesar(){
        this.key = 5;
    }

    public void changeKey(int change){
        this.key = change;
    }

    public String encrypt(String text){
        String output = "";
        for(int i=0; i<text.length(); i++){
            output += moveLetterForward(text, i);
        }
        return output;
    }

    public String decrypt(String text){
        String output = "";
        for(int i=0; i<text.length(); i++){
            output += moveLetterBackwards(text, i);
        }
        return output;
    }

    private String moveLetterForward(String text, int charAt){
        char letter = text.charAt(charAt);
        letter += key;
        if ((letter > 'A' + 25 && letter < 'a') || letter > 'a' + 25) {
            letter -= 26;
        }
        String output = Character.toString(letter);
        return output;
    }

    private String moveLetterBackwards(String text, int charAt){
        char letter = text.charAt(charAt);
        letter -= key;
        if (letter < 'A' || (letter > 'Z' && letter < 'a')) {
            letter += 26;
        }
        String output = Character.toString(letter);
        return output;
    }
}
