package me.stonkscloud.jdwh;

import com.google.gson.Gson;
import me.stonkscloud.jdwh.hook.WebHook;

import javax.net.ssl.HttpsURLConnection;
import java.io.OutputStream;
import java.net.URL;

public class DiscordWebHook {

    private final String webHookURL;

    DiscordWebHook(String webHookURL) {
        this.webHookURL = webHookURL;
    }

    public void writeMessage(WebHook webHook) {
        this.sendWebRequest(new Gson().toJson(webHook));
    }

    private void sendWebRequest(String jsonFormat) {
        try {
            final URL url = new URL(this.getWebHookURL());
            final HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.addRequestProperty("Content-Type", "application/json");
            connection.addRequestProperty("User-Agent", "JavaDiscordWebHook");
            connection.setDoOutput(true);
            connection.setRequestMethod("POST");
            final OutputStream stream = connection.getOutputStream();
            stream.write(jsonFormat.getBytes());
            stream.flush();
            stream.close();
            connection.getInputStream().close();
            connection.disconnect();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static DiscordWebHook of(String webHookURL) {
        return new DiscordWebHook(webHookURL);
    }

    public String getWebHookURL() {
        return webHookURL;
    }

}
