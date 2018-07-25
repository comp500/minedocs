package link.infra.minedocs.api;

import java.util.Map;

import javax.annotation.Nullable;

import net.minecraft.util.ResourceLocation;

/**
 * Provides InformationElements for given ResourceLocations of objects (Blocks/Items/Entities/Mods etc.)
 * Each InformationElement is addressed by a ResourceLocation. (to state what type of information it is)
 * Only InformationElements of a single ResourceLocation should be supplied by the InformationProvider.
 * An InformationProvider can specify required or preferred InformationElements (by their ResourceLocations) for the information it provides.
 * 
 * The InformationProvider will only be queried once per object, so InformationElement.provideExtraInformation is used to provide information found later.
 */
public abstract class InformationProvider {
	
	/**
	 * Gets the InformationElement provided for an object.
	 * @param location The ResourceLocation of the object being queried
	 * @param currentInformation Previously queried InformationElements
	 * @return The InformationElement for the object. If no information is available, return null.
	 */
	@Nullable
	public abstract InformationElement getInfoForResource(ResourceLocation location, Map<ResourceLocation, InformationElement> currentInformation);
	
	/**
	 * Get the ResourceLocations of the required information elements for this InformationProvider.
	 * (e.g. block name is needed to get information from a wiki)
	 * If these are not obtained, the InformationProvider is not queried.
	 * @param location The ResourceLocation of the object being queried
	 * @return ResourceLocations of the required information elements
	 */
	public ResourceLocation[] getRequiredInfo(ResourceLocation location) {
		return new ResourceLocation[]{};
	}
	
	/**
	 * Get the ResourceLocations of the preferred information elements for this InformationProvider.
	 * The mod will make the best attempt to query preferred information elements before this one.
	 * @param location The ResourceLocation of the object being queried
	 * @return ResourceLocations of the preferred information elements
	 */
	public ResourceLocation[] getPreferredInfo(ResourceLocation location) {
		return new ResourceLocation[]{};
	}

}
