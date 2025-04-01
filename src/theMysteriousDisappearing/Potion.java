package theMysteriousDisappearing;

public class Potion extends MagicItem {
    String effect;
    int duration;
    boolean isPoisonous;

    public Potion(String name, int powerLevel, boolean isCursed, String effect, int duration, boolean isPoisonous) {
        super(name, powerLevel, isCursed);
        this.effect = effect;
        this.duration = duration;
        this.isPoisonous = isPoisonous;
    }

    @Override
    public void useMagic() {
        System.out.println("Drinking the " + name + " potion...");
        try {
            applyPotionEffect();
        } catch (PoisonedPotionException e) {
            System.out.println("⚠️ WARNING: " + e.getMessage());
        }
    }

    private void applyPotionEffect() throws PoisonedPotionException {
        if (isPoisonous) {
            throw new PoisonedPotionException(name + " is poisonous! You lose health.");
        } else {
            System.out.println("✨ The potion works perfectly! Your energy increases.");
        }
    }

}
