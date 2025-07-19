package VanillaExpansion.content;

import mindustry.type.Item;

public class VEitems {
    public static Item overchargedAlloy;

    public VEitems() {
    }

    public static void load() {
        overchargedAlloy = new Item("overchargedAlloy") {
            {
                cost = 1.6f;
                charge = 2.0f;
                radioactivity = 0.4f;
                explosiveness = 0.2f;
                //color = "#CBCEFF"
            }
        };
    }
}
