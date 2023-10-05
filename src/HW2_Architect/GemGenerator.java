package HW2_Architect;

public class GemGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        System.out.println("Create new chest");
        return new GemReward();
    }
}
