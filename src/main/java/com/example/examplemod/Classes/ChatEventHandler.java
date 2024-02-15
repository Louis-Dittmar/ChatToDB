package com.example.examplemod.Classes;

import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.example.examplemod.Classes.ChatMessageInserter.insertChatMessage;

@Mod.EventBusSubscriber
public class ChatEventHandler {
    @SubscribeEvent
    public static void onClientChat(ClientChatEvent event) {

        insertChatMessage("Louis", "TestServer", 0, 0, 0, 0, event.getMessage(), "1.16.5", "TestWorld");

    }

}