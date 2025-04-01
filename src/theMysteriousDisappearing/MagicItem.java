package theMysteriousDisappearing;

public class MagicItem {
    String name;
    int powerLevel;
    boolean isCursed;

    public MagicItem(String name, int powerLevel, boolean isCursed) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.isCursed = isCursed;
    }

    public void useMagic(){
        System.out.println("🪄 Welcome to the magical world 🪄");
    }

    protected void finalize(){}
}
