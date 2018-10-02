package domain;

public interface Encryptor {

    public abstract String encrypt(String text);

    public abstract String decrypt(String text);
}
