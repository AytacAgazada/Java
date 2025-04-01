package theMysteriousDisappearing;
import java.util.Random;

public class MagicWand extends MagicItem{
    String woodType;
    String coreMaterial;
    double length;

    public MagicWand(String name, int powerLevel, boolean isCursed,String woodType, String coreMaterial,double length) {
        super(name, powerLevel, isCursed);
        this.woodType = woodType;
        this.coreMaterial = coreMaterial;
        this.length = length;
    }

    @Override
    public void useMagic() {
        System.out.println(name + " wand swishes in the air...");
        castRandomSpell();
    }

    private void castRandomSpell() {
        String[] spells = {"Fireball", "Lightning Strike", "Healing Light", "Teleportation"};
        int randomIndex = new Random().nextInt(spells.length);
        System.out.println("✨ The wand casts a " + spells[randomIndex] + " spell!");
    }

}
