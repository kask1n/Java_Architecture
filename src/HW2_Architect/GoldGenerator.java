package HW2_Architect;

public class GoldGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        System.out.println("Create new chest");
        return new GoldReward();
    }
}
