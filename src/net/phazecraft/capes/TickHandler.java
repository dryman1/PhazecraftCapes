package net.phazecraft.capes;

import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import java.util.EnumSet;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.ImageBufferDownload;
import net.minecraft.client.renderer.RenderEngine;
import net.minecraft.entity.player.EntityPlayer;


public class TickHandler
  implements ITickHandler
{
  private static final Minecraft mc = ;
  


  public void tickStart(EnumSet type, Object[] tickData)
  {
    if ((mc.field_71441_e != null) && (mc.field_71441_e.field_73010_i.size() > 0))
    {
      List players = mc.field_71441_e.field_73010_i;
      
      for (int counter = 0; counter < players.size(); counter++)
      {

        if (players.get(counter) != null) {
          EntityPlayer thePlayer = (EntityPlayer)players.get(counter);
          String oldCloak = thePlayer.field_70119_cs;
          
          String newCloakUrl = "http://images.mccapes.com/capes/standardmc/" + thePlayer.field_71092_bJ + ".png";
          thePlayer.field_70119_cs = newCloakUrl;
          

          if (thePlayer.field_70119_cs != oldCloak) {
            mc.field_71446_o.func_78356_a(thePlayer.field_70119_cs, new ImageBufferDownload());
          } 
        } 
      } 
    } 
  } 
  



  public void tickEnd(EnumSet type, Object[] tickData) {}
  


  public EnumSet ticks()
  {
    return EnumSet.of(TickType.CLIENT);
  } 
  

  public String getLabel()
  {
    return "MCCapesTickHandler";
  } 
} 