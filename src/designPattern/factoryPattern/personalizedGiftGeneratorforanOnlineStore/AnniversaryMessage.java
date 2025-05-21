package designPattern.factoryPattern.personalizedGiftGeneratorforanOnlineStore;

public class AnniversaryMessage implements GiftMessage{
    @Override
    public void getMessage() {
        System.out.println("Happy Anniversary! 💍");
    }
}
