package org.redcars.plugin;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class commandsPlugin extends JavaPlugin {
    public commandsPlugin(@NonNullDecl JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        super.setup();
        this.getCommandRegistry().registerCommand(new AnnouncementCommand("announce", "Make an announcement", false));
    }
}
