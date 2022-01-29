package com.zach2039.oldguns.world.item.part;

import com.zach2039.oldguns.OldGuns;
import com.zach2039.oldguns.api.firearm.FirearmPart;

public class LargeBrassFlaredBarrelItem extends FirearmPartItem {

	public LargeBrassFlaredBarrelItem() {
		super((FirearmPartProperties) new FirearmPartProperties()				
				.partType(FirearmPart.LARGE_METAL_FLARED_BARREL)
				.tab(OldGuns.CREATIVE_MODE_TAB));
	}
}
