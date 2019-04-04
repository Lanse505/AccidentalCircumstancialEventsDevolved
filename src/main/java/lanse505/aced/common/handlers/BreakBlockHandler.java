package lanse505.aced.common.handlers;

import lanse505.aced.common.ACEDHolder;
import lanse505.aced.common.base.Task;
import lanse505.aced.common.tasks.BreakBlockTask;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BreakBlockHandler {
    @SubscribeEvent
    public void onBlockBreak(BlockEvent.BreakEvent event) {
        for (Task task : ACEDHolder.getTargets()) {
            if (task instanceof BreakBlockTask) {

            }
        }
    }

}
