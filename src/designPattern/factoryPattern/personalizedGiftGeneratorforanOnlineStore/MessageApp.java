package designPattern.factoryPattern.personalizedGiftGeneratorforanOnlineStore;

public class MessageApp {
    public static void main(String[] args) {
        GiftMessage anniversary = GiftMessageFactory.createMessage("Anniversary");
        GiftMessage birthday = GiftMessageFactory.createMessage("Birthday");
        GiftMessage graduation = GiftMessageFactory.createMessage("Graduation");

        anniversary.getMessage();
        birthday.getMessage();
        graduation.getMessage();

    }
}
