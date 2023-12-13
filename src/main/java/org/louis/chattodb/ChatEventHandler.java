package org.louis.chattodb;

import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static org.louis.chattodb.ChatMessageInserter.insertChatMessage;
@Mod.EventBusSubscriber
public class ChatEventHandler {
    @SubscribeEvent
    public static void onClientChat(ClientChatEvent event) {





        insertChatMessage("Louis", "TestServer", 0, 0, 0, 0, event.getMessage(), "1.16.5", "TestWorld");




    }

}