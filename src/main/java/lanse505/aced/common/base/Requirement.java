package lanse505.aced.common.base;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.LinkedList;

public class Requirement {
    private LinkedList<EnumReward> allowedTasks = new LinkedList<>();
    private boolean reversed = false;

    public Requirement(){}

    public boolean checkValidTaskType(EnumReward task) {
        return allowedTasks.contains(task);
    }

    public boolean doReverse(boolean condition) {
        if (this.reversed) {
            return !condition;
        } else {
            return condition;
        }
    }

    public LinkedList<EnumReward> getAllowedTasks() {
        return allowedTasks;
    }

    // Entity Checks
    public boolean checkRequirement(Entity entity) {
        return false;
    }

    public boolean checkRequirement(EntityLivingBase livingBase) {
        return false;
    }

    public boolean checkRequirement(EntityPlayer player) {
        return false;
    }


    // World~Block Checks
    public boolean checkRequirement(World world) {
        return false;
    }

    public boolean checkRequirement(Block block) {
        return false;
    }

    public boolean checkRequirement(IBlockState state) {
        return false;
    }


    // Item Requirements
    public boolean checkRequirement(Item item) {
        return false;
    }

    public boolean checkRequirement(ItemBlock block) {
        return false;
    }

    public boolean checkRequirement(ItemStack stack) {
        return false;
    }

}
