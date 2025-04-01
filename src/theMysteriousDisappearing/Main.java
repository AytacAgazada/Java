package theMysteriousDisappearing;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MagicItem wand = new MagicWand("Elder Wand", 100, false, "Elder", "Phoenix Feather", 15.0);
        MagicItem potion = new Potion("Healing Potion", 50, false, "Healing", 30, false);
        wand.useMagic();
        potion.useMagic();

        Potion poisonousPotion = new Potion("Deadly Poison", 40, true, "Poison", 10, true);
        poisonousPotion.useMagic();

        MagicWand brokenWand = new MagicWand("Broken Wand", 0, false, "Oak", "Dragon Heartstring", 12.5);
        brokenWand.useMagic();

        MagicItem nullItem = null;
        System.gc();
        Thread.sleep(1000);
        System.out.println("🗑️garbage collection has finished the deletion operation.");

        System.out.println("finished!");
    }
}
