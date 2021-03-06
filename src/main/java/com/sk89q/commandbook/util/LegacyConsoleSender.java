package com.sk89q.commandbook.util;

import java.util.Set;
import java.util.logging.Logger;

import org.bukkit.Server;
import org.bukkit.command.CommandSender;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.plugin.Plugin;

/**
 * Console sender.
 * 
 * @author sk89q
 */
class LegacyConsoleSender implements CommandSender {
    
    private static final Logger logger = Logger.getLogger("Minecraft.CommandBook");
    private final Server server;
    
    public LegacyConsoleSender(Server server) {
        this.server = server;
    }
    
    public void sendMessage(String message) {
        logger.info(message);
    }

    public Server getServer() {
        return server;
    }
    
    public String getName() {
        return "CONSOLE";
    }

    public boolean isPermissionSet(String name) {
        return true;
    }

    public boolean isPermissionSet(Permission perm) {
        return true;
    }

    public boolean hasPermission(String name) {
        return true;
    }

    public boolean hasPermission(Permission perm) {
        return true;
    }

    public PermissionAttachment addAttachment(Plugin plugin, String name,
            boolean value) {
        throw new UnsupportedOperationException("Fake legacy console command sender does not support this");
    }

    public PermissionAttachment addAttachment(Plugin plugin) {
        throw new UnsupportedOperationException("Fake legacy console command sender does not support this");
    }

    public PermissionAttachment addAttachment(Plugin plugin, String name,
            boolean value, int ticks) {
        throw new UnsupportedOperationException("Fake legacy console command sender does not support this");
    }

    public PermissionAttachment addAttachment(Plugin plugin, int ticks) {
        throw new UnsupportedOperationException("Fake legacy console command sender does not support this");
    }

    public void removeAttachment(PermissionAttachment attachment) {
        throw new UnsupportedOperationException("Fake legacy console command sender does not support this");
    }

    public void recalculatePermissions() {
    }

    public Set<PermissionAttachmentInfo> getEffectivePermissions() {
        throw new UnsupportedOperationException("Fake legacy console command sender does not support this");
    }

    public boolean isOp() {
        return true;
    }

    public void setOp(boolean value) {
    }
}