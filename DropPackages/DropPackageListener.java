package me.randomHashTags.randomPackage.DropPackages;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class DropPackageListener implements Listener {
	@EventHandler
	private void playerInteractEvent(PlayerInteractEvent event) {
		if(event.isCancelled()) {
			return;
		} else {
			
		}
	}
}
