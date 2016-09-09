package gtPlusPlus.xmod.gregtech.registration.gregtech;

import gtPlusPlus.core.util.Utils;
import gtPlusPlus.xmod.gregtech.api.enums.GregtechItemList;
import gtPlusPlus.xmod.gregtech.common.tileentities.machines.multi.GregtechMetaTileEntityIronBlastFurnace;

public class GregtechIronBlastFurnace
{



	public static void run()
	{
		if (gtPlusPlus.core.lib.LoadedMods.Gregtech){
			Utils.LOG_INFO("Gregtech5u Content | Registering Iron Blast Furnace.");
			run1();
		}

	}

	private static void run1()
	{
		GregtechItemList.Machine_Iron_BlastFurnace.set(new GregtechMetaTileEntityIronBlastFurnace(768, "ironmachine.blastfurnace", "Iron Plated Blast Furnace").getStackForm(1L));
	}
}