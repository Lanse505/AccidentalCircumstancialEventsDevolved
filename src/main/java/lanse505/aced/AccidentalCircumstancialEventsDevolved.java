package lanse505.aced;

import com.teamacronymcoders.base.BaseModFoundation;
import lanse505.aced.utils.ACEDConstants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ACEDConstants.MODID, name = ACEDConstants.NAME, version = ACEDConstants.VERSION, acceptedMinecraftVersions = ACEDConstants.MCVERSION, dependencies = ACEDConstants.DEPS)
public class AccidentalCircumstancialEventsDevolved extends BaseModFoundation<AccidentalCircumstancialEventsDevolved> {

    public AccidentalCircumstancialEventsDevolved() {
        super(ACEDConstants.MODID, ACEDConstants.NAME, ACEDConstants.VERSION, null);
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        ACEDConstants.logger = event.getModLog();
    }

    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }

    @Override
    public AccidentalCircumstancialEventsDevolved getInstance() {
        return ACEDConstants.INSTANCE;
    }
}
