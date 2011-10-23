package me.samkio.mo.blocks.misc.microwave;

import org.bukkit.Location;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class MicrowaveItem {
	private Item item;
	private Location location;
	private String player;
	public boolean updatedPosition = false;

	public MicrowaveItem(Item item, Location location) {
		setItem(item);
		setLocation(location);
	}

	/**
	 * @param item
	 *            the item to set
	 */
	public void setItem(Item item) {
		this.item = item;
	}

	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(Location location) {
		location.add(0.5, 0.1, 0.5);
		this.location = location;
		item.teleport(location);
		item.setVelocity(new Vector(0, 0.01, 0));
	}

	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	public void remove() {
		item.remove();
	}

	public void respawn() {
		ItemStack stack = new ItemStack(item.getItemStack().getType());
		item = item.getLocation().getWorld().dropItemNaturally(location, stack);
		item.setVelocity(new Vector(0, 0.01, 0));
		updatedPosition = false;
	}

	public void updatePosition() {
		if (!updatedPosition) {
			item.teleport(location);
			item.setVelocity(new Vector(0, 0.01, 0));
			updatedPosition = true;
		}
	}

	/**
	 * @param player
	 *            the player to set
	 */
	public void setPlayer(String player) {
		this.player = player;
	}

	/**
	 * @return the player
	 */
	public String getPlayer() {
		return player;
	}
	
}
