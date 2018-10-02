package domain;

public class Text {
    private String text;
    private Encryptor encryptor;

    public Text(String text) {
        this.text = text;
        this.encryptor = new Caesar();
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }

    public void changeEncryption(Encryptor encrypt){
        this.encryptor = encrypt;
    }

    public String encrypt(){
        return encryptor.encrypt(this.text);
    }

    public String decrypt(){
        return encryptor.decrypt(this.text);
    }

    public Encryptor getEncryptor() {
        return encryptor;
    }
}
