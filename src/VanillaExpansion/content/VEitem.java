package VanillaExpansion.content;

import arc.graphics.Color;
import mindustry.type.Item;

public class VEitem {
    public static Item overchargedAlloy;

    public VEitem() {
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
