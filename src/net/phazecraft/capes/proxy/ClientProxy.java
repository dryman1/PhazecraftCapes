package net.phazecraft.capes.proxy;

import net.phazecraft.capes.TickHandler;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class ClientProxy
  extends CommonProxy
{
  public void initTick()
  {
    TickRegistry.registerTickHandler(new TickHandler(), Side.CLIENT);
  } 
} 