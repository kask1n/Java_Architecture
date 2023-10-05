package HW2_Architect;

public class AppleGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        System.out.println("Create new chest");
        return new AppleReward();
    }
}
