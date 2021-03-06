package org.gr1m.mc.mup.tweaks.netseqcheck.mixin;

import net.minecraft.client.network.NetHandlerPlayClient;
import org.gr1m.mc.mup.tweaks.netseqcheck.INetSequenceHandler;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(NetHandlerPlayClient.class)
public abstract class MixinNetHandlerPlayClient implements INetSequenceHandler
{
    private int sendingSequenceNumber = 0;
    private int checkingSequenceNumber = 0;

    public int getSendingSequenceNumber()
    {
        return this.sendingSequenceNumber;
    }

    public void incrSendingSequenceNumber()
    {
        this.sendingSequenceNumber += 1;
    }

    public int getCheckingSequenceNumber()
    {
        return this.checkingSequenceNumber;
    }

    public void setCheckingSequenceNumber(int sequenceIn)
    {
        this.checkingSequenceNumber = sequenceIn;
    }
}
