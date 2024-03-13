package zach2039.oldguns.common.item.tools;

import javax.annotation.Nullable;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import zach2039.oldguns.api.capability.casting.CastHandler;
import zach2039.oldguns.common.OldGuns;

public class ItemSmallMusketBallMold extends Item
{
	public ItemSmallMusketBallMold()
	{
		setRegistryName(OldGuns.MODID, "small_musket_ball_mold");
		setTranslationKey("small_musket_ball_mold");
		setMaxStackSize(1);
		setCreativeTab(OldGuns.OLDGUNS_CREATIVE_TAB);
		
		// Set max uses of cast in recipes via damage value.
		setMaxDamage(63);
	}
	
	@Override
	public Item getContainerItem()
	{
		return this;
	}
	
	@Nullable
	@Override
    public net.minecraftforge.common.capabilities.ICapabilityProvider initCapabilities(ItemStack stack, @Nullable NBTTagCompound nbt)
    {
		// Give item ability to be used as cast in melter.
        return new CastHandler();
    }
}
