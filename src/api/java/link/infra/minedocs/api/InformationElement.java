package link.infra.minedocs.api;

import java.util.Map;

import net.minecraft.util.ResourceLocation;

/**
 * An information element supplied by an InformationProvider for a ResourceLocation.
 * Must be formattable into HTML by getHTML.
 */
public abstract class InformationElement {
	
	private final ResourceLocation location;
	
	public InformationElement(ResourceLocation location) {
		super();
		this.location = location;
	}
	
	/**
	 * Gets the location for the block/entity/etc. for this InformationElement
	 * @return The ResourceLocation associated with this InformationElement
	 */
	public ResourceLocation getResourceLocation() {
		return location;
	}
	
	/**
	 * Supplies extra InformationElements to this InformationElement
	 * @param extraInformation Previously queried InformationElements
	 */
	public void provideExtraInformation(Map<ResourceLocation, InformationElement> extraInformation) {
		return;
	}
	
	public abstract String getHTML();

}