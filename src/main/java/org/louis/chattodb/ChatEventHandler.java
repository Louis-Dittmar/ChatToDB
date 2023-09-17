package org.louis.chattodb;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static org.louis.chattodb.ChatMessageInserter.insertChatMessage;

@Mod.EventBusSubscriber(modid = ChatToDB.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ChatEventHandler {
    @SubscribeEvent
    public static void onClientChat(ClientChatEvent event) {

        String server = null;
        int gamemode = 0;
        String message = event.getMessage();
        String username = Minecraft.getInstance().player.getName().getString();
        int x = (int) Minecraft.getInstance().player.getX();
        int y = (int) Minecraft.getInstance().player.getY();
        int z = (int) Minecraft.getInstance().player.getZ();
        String MinecraftVersion = Minecraft.getInstance().getVersionType();
        String World = null;


        if (!(Minecraft.getInstance().getCurrentServer() == null)) {
            server = Minecraft.getInstance().getCurrentServer().name;
        }


        insertChatMessage(username, server, gamemode, x, y, z, message, MinecraftVersion, null);




    }

}