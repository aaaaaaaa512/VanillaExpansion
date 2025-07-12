package VanillaExpansion;

import arc.Events;
import arc.util.Time;
import mindustry.game.EventType;
import mindustry.ui.dialogs.BaseDialog;

import javax.swing.event.DocumentEvent;

public class VEMod extends mindustry.mod.Mod {
    public VEMod() {
        Events.on(EventType.ClientLoadEvent.class, e->{
            Time.run(10f,()->{
                BaseDialog dialog = new BaseDialog("啊啊啊啊");
                dialog.cont.add("aaaaaaaaa");
                Time.run(60f, dialog::addCloseButton
                );
                dialog.show();
            });
        });
    }


    @Override
    public void loadContent(){
        super.loadContent();
    }
}
