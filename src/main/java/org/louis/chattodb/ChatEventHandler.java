package org.louis.chattodb;

import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static org.louis.chattodb.ChatMessageInserter.insertChatMessage;

public class ChatEventHandler {
    @SubscribeEvent
    public static void onClientChat(ClientChatEvent event) {





        insertChatMessage("Louis", "TestServer", 0, 0, 0, 0, "TestMessage", "1.16.5", "TestWorld");




    }

}