package net.phazecraft.capes;

import net.phazecraft.capes.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid="MCCapesForge", name="MCCapes", version="0.0.4")
public class PhazecraftCapesForge
{
  @Mod.Instance("MCCapesForge")
  public static PhazecraftCapesForge instance;
  @SidedProxy(clientSide="com.jadarstudios.MCCapesForge.proxy.ClientProxy", serverSide="com.jadarstudios.MCCapesForge.proxy.CommonProxy")
  public static CommonProxy proxy;
  
  @Mod.PreInit
  public void preInit(FMLPreInitializationEvent event) {}
  
  @Mod.Init
  public void load(FMLInitializationEvent event)
  {
    proxy.initTick();
  } 
  
  @Mod.PostInit
  public void postInit(FMLPostInitializationEvent event) {}
} 