package com.zach2039.oldguns.world.item.part;

import com.zach2039.oldguns.OldGuns;
import com.zach2039.oldguns.api.firearm.FirearmPart;

public class MatchCordItem extends FirearmPartItem {

	public MatchCordItem() {
		super((FirearmPartProperties) new FirearmPartProperties()				
				.partType(FirearmPart.MATCH_CORD)
				.tab(OldGuns.CREATIVE_MODE_TAB));
	}
}
