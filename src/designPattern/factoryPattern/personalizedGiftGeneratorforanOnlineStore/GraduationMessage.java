package designPattern.factoryPattern.personalizedGiftGeneratorforanOnlineStore;

public class GraduationMessage implements GiftMessage{
    @Override
    public void getMessage() {
        System.out.println("Congrats on Graduation! 🎓");
    }
}
