/*
 * CommandBook
 * Copyright (C) 2011 sk89q <http://www.sk89q.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.commandbook.commands;


import com.sk89q.commandbook.components.AbstractComponent;
import com.sk89q.minecraft.util.commands.*;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

/**
 * @author zml2008
 */
public class CommandBookComponentCommand extends org.bukkit.command.Command {
    private final AbstractComponent component;
    public CommandBookComponentCommand(Command cmd, AbstractComponent component) {
        super(cmd.aliases()[0], cmd.desc(), cmd.usage(), Arrays.asList(cmd.aliases()));
        this.component = component;
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        return component.handleCommand(sender, commandLabel, args);
    }

    public AbstractComponent getComponent() {
        return component;
    }
}
