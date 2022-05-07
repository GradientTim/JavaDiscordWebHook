package me.stonkscloud.jdwh.hook;

import java.util.LinkedList;
import java.util.List;

public class WebHook {

    public String username, avatar_url, content;
    public List<EmbedConfiguration> embeds = new LinkedList<>();

    public static WebHook builder() {
        return new WebHook();
    }

    public WebHook setUsername(String username) {
        this.username = username;
        return this;
    }

    public WebHook setAvatarURL(String avatar_url) {
        this.avatar_url = avatar_url;
        return this;
    }

    public WebHook setContent(String content) {
        this.content = content;
        return this;
    }

    public WebHook addEmbed(EmbedConfiguration embed) {
        this.embeds.add(embed);
        return this;
    }

    public String getUsername() {
        return username;
    }

    public String getAvatarURL() {
        return avatar_url;
    }

    public String getContent() {
        return content;
    }

    public List<EmbedConfiguration> getEmbeds() {
        return embeds;
    }

}
