package org.bukkit.entity;

import org.bukkit.inventory.LlamaInventory;

/**
 * Represents a Llama.
 */
public interface Llama extends ChestedHorse {

    @Override
    public LlamaInventory getInventory();
}
