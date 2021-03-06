package io.muzoo.ssc.zork.CommandPackage;

import io.muzoo.ssc.zork.ZorkGame;

import java.io.FileNotFoundException;

public abstract class Commands {
    public abstract String desc();
    public abstract String getCmd();
    public abstract void execute(ZorkGame game, String[] array) throws FileNotFoundException;
}