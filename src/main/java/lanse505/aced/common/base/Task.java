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

import java.util.Iterator;
import java.util.LinkedList;

public abstract class Task {
    private final String identifier;
    private LinkedList<Requirement> requirements = new LinkedList<>();
    private LinkedList<Reward> rewards = new LinkedList<>();

    public Task(String identifier) {
        this.identifier = identifier;
    }

    public void perform(Object[] parameters){}

    public void registerRequirement(Requirement r) {
        this.requirements.add(r);
    }

    public LinkedList<Requirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(LinkedList<Requirement> requirements) {
        this.requirements = requirements;
    }

    public LinkedList<Reward> getRewards() {
        return rewards;
    }

    public void setRewards(LinkedList<Reward> rewards) {
        this.rewards = rewards;
    }

    public void reward() {
        Iterator iterator = this.rewards.iterator();
        while(iterator.hasNext()) {
            Reward r = (Reward) iterator.next();
            r.doReward();
        }
    }

    // Entity Checks
    public boolean checkConditions(Entity entity) {
        boolean approved = true;
        Iterator iterator = this.requirements.iterator();

        while (iterator.hasNext()) {
            Requirement r = (Requirement) iterator.next();
            if (!r.checkRequirement(entity)) {
                approved = false;
            }
        }
        return approved;
    }

    public boolean checkRequirement(EntityLivingBase livingBase) {
        boolean approved = true;
        Iterator iterator = this.requirements.iterator();

        while (iterator.hasNext()) {
            Requirement r = (Requirement) iterator.next();
            if (!r.checkRequirement(livingBase)) {
                approved = false;
            }
        }
        return approved;
    }

    public boolean checkRequirement(EntityPlayer player) {
        boolean approved = true;
        Iterator iterator = this.requirements.iterator();

        while (iterator.hasNext()) {
            Requirement r = (Requirement) iterator.next();
            if (!r.checkRequirement(player)) {
                approved = false;
            }
        }
        return approved;
    }


    // World~Block Checks
    public boolean checkRequirement(World world) {
        boolean approved = true;
        Iterator iterator = this.requirements.iterator();

        while (iterator.hasNext()) {
            Requirement r = (Requirement) iterator.next();
            if (!r.checkRequirement(world)) {
                approved = false;
            }
        }
        return approved;
    }

    public boolean checkRequirement(Block block) {
        boolean approved = true;
        Iterator iterator = this.requirements.iterator();

        while (iterator.hasNext()) {
            Requirement r = (Requirement) iterator.next();
            if (!r.checkRequirement(block)) {
                approved = false;
            }
        }
        return approved;
    }

    public boolean checkRequirement(IBlockState state) {
        boolean approved = true;
        Iterator iterator = this.requirements.iterator();

        while (iterator.hasNext()) {
            Requirement r = (Requirement) iterator.next();
            if (!r.checkRequirement(state)) {
                approved = false;
            }
        }
        return approved;
    }


    // Item Requirements
    public boolean checkRequirement(Item item) {
        boolean approved = true;
        Iterator iterator = this.requirements.iterator();

        while (iterator.hasNext()) {
            Requirement r = (Requirement) iterator.next();
            if (!r.checkRequirement(item)) {
                approved = false;
            }
        }
        return approved;
    }

    public boolean checkRequirement(ItemBlock block) {
        boolean approved = true;
        Iterator iterator = this.requirements.iterator();

        while (iterator.hasNext()) {
            Requirement r = (Requirement) iterator.next();
            if (!r.checkRequirement(block)) {
                approved = false;
            }
        }
        return approved;
    }

    public boolean checkRequirement(ItemStack stack) {
        boolean approved = true;
        Iterator iterator = this.requirements.iterator();

        while (iterator.hasNext()) {
            Requirement r = (Requirement) iterator.next();
            if (!r.checkRequirement(stack)) {
                approved = false;
            }
        }
        return approved;
    }
}
