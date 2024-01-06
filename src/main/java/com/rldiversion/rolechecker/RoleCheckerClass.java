package com.rldiversion.rolechecker;

import de.erdbeerbaerlp.dcintegration.common.DiscordIntegration;
import de.erdbeerbaerlp.dcintegration.common.addon.AddonConfigRegistry;
import de.erdbeerbaerlp.dcintegration.common.addon.DiscordIntegrationAddon;
import de.erdbeerbaerlp.dcintegration.common.storage.CommandRegistry;

public class RoleCheckerClass implements DiscordIntegrationAddon {
    private RoleCheckerConfig cfg;

    @Override
    public void load(DiscordIntegration dc) {
        DiscordIntegration.LOGGER.info("RoleChecker Addon loaded");
        cfg = AddonConfigRegistry.loadConfig(RoleCheckerConfig.class, this);
        DiscordIntegration.LOGGER.info(cfg.exampleMessage);
    }

    @Override
    public void reload() {
        DiscordIntegration.LOGGER.info("RoleChecker Addon reloaded");
        cfg = AddonConfigRegistry.loadConfig(cfg,this);
    }

    @Override
    public void unload(DiscordIntegration dc) {
        DiscordIntegration.LOGGER.info("RoleChecker Addon unloaded");
    }
}
