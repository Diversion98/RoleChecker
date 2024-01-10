package com.rldiversion.rolechecker;

import dcshadow.com.moandjiezana.toml.TomlComment;

public class RoleCheckerConfig {

    @TomlComment({"The Role IDs of your Supporter Roles (3 tiers)"})
    public String SupporterTier1 = "0000";
    public String SupporterTier2 = "0000";
    public String SupporterTier3 = "0000";

    @TomlComment({"", "The FTB ranks names (3 tiers)"})
    public String RankTier1 = "Basic";
    public String RankTier2 = "Big";
    public String RankTier3 = "Ultra";
}