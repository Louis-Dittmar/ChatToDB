package org.louis.chattodb;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import org.louis.chattodb.ChatMessageInserter;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

// The value here sh
// ould match an entry in the META-INF/mods.toml file
@Mod(ChatToDB.MODID)
public class ChatToDB {
    public static final String MODID = "chattodb";

    public ChatToDB() {
        // Calling insertChatMessage from ChatMessageInserter
        // register on onClientChat
        FMLJavaModLoadingContext.get().getModEventBus().register(new ChatEventHandler());
    }

    // Register event
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogUtils.getLogger();
    // Register Java to MYSQL Connection
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

}
