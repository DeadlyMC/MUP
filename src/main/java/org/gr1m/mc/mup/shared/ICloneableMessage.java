package org.gr1m.mc.mup.shared;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public interface ICloneableMessage extends IMessage {
    ICloneableMessage cloneMessage();
}
