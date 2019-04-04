package lanse505.aced.utils;

import lanse505.aced.AccidentalCircumstancialEventsDevolved;
import lanse505.aced.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import org.apache.logging.log4j.Logger;

public class ACEDConstants {
    public static final String MODID = "survivalism";
    public static final String NAME = "Survivalism";
    public static final String VERSION = "1.12.2-1.0.0";
    public static final String MCVERSION = "1.12,";
    public static final String DEPS = "required-after:base;" + "after:patchouli;";

    public static Logger logger;
    private static final String COMMON = "lanse505.aced.common.CommonProxy";

    @Mod.Instance(MODID)
    public static AccidentalCircumstancialEventsDevolved INSTANCE;

    @SidedProxy(serverSide = COMMON, clientSide = COMMON)
    public static CommonProxy proxy;

}
