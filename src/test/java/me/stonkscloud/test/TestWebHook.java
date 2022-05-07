package me.stonkscloud.test;

import me.stonkscloud.jdwh.DiscordWebHook;
import me.stonkscloud.jdwh.hook.EmbedConfiguration;
import me.stonkscloud.jdwh.hook.WebHook;

public class TestWebHook {

    public static void main(String[] args) {
        final DiscordWebHook discordWebHook = DiscordWebHook.of("PASTE WEBHOOK URL HERE");

        final WebHook webHook = WebHook
                .builder()
                .setUsername("JavaWebHook")
                .setAvatarURL("https://via.placeholder.com/64")
                .setContent("This is a test message.")
                .addEmbed(EmbedConfiguration
                        .build()
                        .setAuthor(EmbedConfiguration.AuthorEmbed
                                .builder()
                                .setName("JavaWebHook - Testing")
                                .setIconURL("https://via.placeholder.com/64"))
                        .setColor(15258703)
                        .setDescription("This is the awesome description!")
                        .setTitle("Dear Community, this is a test embed.")
                        .setUrl("https://google.com")
                        .setImage(EmbedConfiguration.MediaEmbed
                                .builder()
                                .setUrl("https://via.placeholder.com/1920x1080"))
                        .setThumbnail(EmbedConfiguration.MediaEmbed
                                .builder()
                                .setUrl("https://via.placeholder.com/1920x1080"))
                        .setFooter(EmbedConfiguration.FooterEmbed
                                .builder()
                                .setIconURL("https://via.placeholder.com/64")
                                .setText("CopyRight - JavaWebHook"))
                        .appendField(EmbedConfiguration.FieldEmbed
                                .builder()
                                .setName("INSANE NUMBER!1!1!")
                                .setValue("103.131.534.328")
                                .setInline(true))
                        .appendField(EmbedConfiguration.FieldEmbed
                                .builder()
                                .setName("Weirdo")
                                .setValue("rtetheraöerwaöoineraöogbrtjzew")
                                .setInline(true))
                        .appendField(EmbedConfiguration.FieldEmbed
                                .builder()
                                .setName("Languages")
                                .setValue("Java, ReactJS, C#")
                                .setInline(false))
                );

        discordWebHook.writeMessage(webHook);
    }

}
