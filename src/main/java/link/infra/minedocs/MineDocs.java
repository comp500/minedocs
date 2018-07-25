package link.infra.minedocs;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MineDocs.MODID, name = MineDocs.MODNAME, version = MineDocs.VERSION, useMetadata = true, acceptableRemoteVersions = "*", acceptableSaveVersions = "*", clientSideOnly = true)
public class MineDocs {

	public static final String MODID = "minedocs";
	public static final String MODNAME = "MineDocs";
	public static final String VERSION = "1.0.0.0";

	@Mod.Instance
	public static MineDocs instance;
	public static Logger logger;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
	}
}
