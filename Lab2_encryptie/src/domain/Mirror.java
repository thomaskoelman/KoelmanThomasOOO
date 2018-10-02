package domain;

public class Mirror implements Encryptor {

    public Mirror(){

    }

    public String encrypt(String text){
        String output = "";
        for (int i = text.length() - 1 ; i>= 0 ; i--){
            output += text.charAt(i);
        }
        return output;
    }

    public String decrypt(String text){
        String output = "";
        for (int i = text.length() - 1 ; i>= 0 ; i--){
            output += text.charAt(i);
        }
        return output;
    }
}
