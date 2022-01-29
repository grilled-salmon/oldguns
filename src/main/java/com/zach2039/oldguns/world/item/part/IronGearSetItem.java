package com.zach2039.oldguns.world.item.part;

import com.zach2039.oldguns.OldGuns;
import com.zach2039.oldguns.api.firearm.FirearmPart;

public class IronGearSetItem extends FirearmPartItem {

	public IronGearSetItem() {
		super((FirearmPartProperties) new FirearmPartProperties()				
				.partType(FirearmPart.IRON_GEAR_SET)
				.tab(OldGuns.CREATIVE_MODE_TAB));
	}
}
