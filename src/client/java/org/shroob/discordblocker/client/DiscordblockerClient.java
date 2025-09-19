package org.shroob.discordblocker.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents;

public class DiscordblockerClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        String[] fuckThem = new String[]{"MrChaosTheory", "The Winged Detective"};

        ClientReceiveMessageEvents.ALLOW_GAME.register((message, overlay) -> {

            if (message.getString().contains("[Discord]")) {
                for (String fuck : fuckThem) if (message.getString().contains(fuck)) return false;
            }

            return true;
        });


    }
}
