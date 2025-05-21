package designPattern.factoryPattern.personalizedGiftGeneratorforanOnlineStore;

public class BirthdayMessage implements GiftMessage{
    @Override
    public void getMessage() {
        System.out.println("Happy Birthday! 🎂");
    }

}
