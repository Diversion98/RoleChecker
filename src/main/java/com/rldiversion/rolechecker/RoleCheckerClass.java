package com.rldiversion.rolechecker;

import de.erdbeerbaerlp.dcintegration.common.DiscordIntegration;
import de.erdbeerbaerlp.dcintegration.common.addon.AddonConfigRegistry;
import de.erdbeerbaerlp.dcintegration.common.addon.DiscordIntegrationAddon;

public class RoleCheckerClass implements DiscordIntegrationAddon {
    private RoleCheckerConfig cfg;

    @Override
    public void load(DiscordIntegration dc) {
        DiscordIntegration.LOGGER.info("RoleChecker Addon loaded");
        cfg = AddonConfigRegistry.loadConfig(RoleCheckerConfig.class, this);
        DiscordIntegration.LOGGER.info(cfg.SupporterTier1);
        dc.sendMessage("RoleChecker Addon loaded!");
        dc.sendMessage("");
        dc.sendMessage("Supporter Ranks - FTB Ranks:");
        dc.sendMessage("____________________________");
        dc.sendMessage(cfg.SupporterTier1 + " - " + cfg.RankTier1);
        dc.sendMessage(cfg.SupporterTier2 + " - " + cfg.RankTier2);
        dc.sendMessage(cfg.SupporterTier3 + " - " + cfg.RankTier3);
        dc.sendMessage("");
    }

    @Override
    public void reload() {
        cfg = AddonConfigRegistry.loadConfig(cfg,this);
    }

    @Override
    public void unload(DiscordIntegration dc) {
        DiscordIntegration.LOGGER.info("RoleChecker Addon unloaded");
    }
}
