package slimeknights.mantle.inventory;

import net.minecraft.item.ItemStack;

public interface IShiftOnlyFilterSlot {

  public boolean isItemValidOnShiftClick(ItemStack stack);
}
