package VanillaExpansion.content;

import mindustry.type.Item;

public class VEitems {
    public static Item overchargedAlloy;

    public VEitems() {
    }

    public static void load() {
        overchargedAlloy = new Item("overchargedAlloy") {
            {
                this.cost = 5.0F;
                this.charge = 2.0F;
            }
        };
    }
}
