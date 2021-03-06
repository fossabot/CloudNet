package de.dytanic.cloudnet.bridge.event.proxied;

import de.dytanic.cloudnet.lib.player.CloudPlayer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import net.md_5.bungee.api.connection.ProxiedPlayer;

/**
 * Created by Tareko on 23.01.2018.
 */
@Getter
@AllArgsConstructor
public class ProxiedPlayerFallbackEvent extends ProxiedCloudEvent {

    private ProxiedPlayer proxiedPlayer;

    private CloudPlayer cloudPlayer;

    private FallbackType fallbackType;

    @Setter
    private String fallback;

    public enum FallbackType {

        HUB_COMMAND,
        SERVER_KICK,
        SERVER_CONNECT,
        CUSTOM

    }

}