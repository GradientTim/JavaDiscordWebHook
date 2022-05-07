package me.stonkscloud.jdwh.hook;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class EmbedConfiguration {

    private AuthorEmbed author;
    private String title, url, description;
    private Integer color;
    private List<FieldEmbed> fields;
    private MediaEmbed thumbnail, image;
    private FooterEmbed footer;

    public static EmbedConfiguration build() {
        return new EmbedConfiguration();
    }

    public EmbedConfiguration setAuthor(AuthorEmbed author) {
        this.author = author;
        return this;
    }

    public EmbedConfiguration setTitle(String title) {
        this.title = title;
        return this;
    }

    public EmbedConfiguration setUrl(String url) {
        this.url = url;
        return this;
    }

    public EmbedConfiguration setDescription(String description) {
        this.description = description;
        return this;
    }

    public EmbedConfiguration setColor(Integer color) {
        this.color = color;
        return this;
    }

    public EmbedConfiguration appendField(FieldEmbed field) {
        if (this.fields == null)
            this.fields = new LinkedList<>();
        this.fields.add(field);
        return this;
    }

    public EmbedConfiguration setThumbnail(MediaEmbed thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    public EmbedConfiguration setImage(MediaEmbed image) {
        this.image = image;
        return this;
    }

    public EmbedConfiguration setFooter(FooterEmbed footer) {
        this.footer = footer;
        return this;
    }

    public AuthorEmbed getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public Integer getColor() {
        return color;
    }

    public List<FieldEmbed> getFields() {
        return fields;
    }

    public MediaEmbed getThumbnail() {
        return thumbnail;
    }

    public MediaEmbed getImage() {
        return image;
    }

    public FooterEmbed getFooter() {
        return footer;
    }

    public static class FooterEmbed {

        private String text, icon_url;

        public static FooterEmbed builder() {
            return new FooterEmbed();
        }

        public FooterEmbed setText(String text) {
            this.text = text;
            return this;
        }

        public FooterEmbed setIconURL(String icon_url) {
            this.icon_url = icon_url;
            return this;
        }

        public String getText() {
            return text;
        }

        public String getIconURL() {
            return icon_url;
        }

    }

    public static class MediaEmbed {

        private String url;

        public static MediaEmbed builder() {
            return new MediaEmbed();
        }

        public MediaEmbed setUrl(String url) {
            this.url = url;
            return this;
        }

        public String getUrl() {
            return url;
        }

    }

    public static class FieldEmbed {

        private String name, value;
        private Boolean inline;

        public static FieldEmbed builder() {
            return new FieldEmbed();
        }

        public FieldEmbed setName(String name) {
            this.name = name;
            return this;
        }

        public FieldEmbed setValue(String value) {
            this.value = value;
            return this;
        }

        public FieldEmbed setInline(Boolean inline) {
            this.inline = inline;
            return this;
        }

        public String getName() {
            return name;
        }

        public String getValue() {
            return value;
        }

        public Boolean getInline() {
            return inline;
        }

    }

    public static class AuthorEmbed {

        private String name, url, icon_url;

        public static AuthorEmbed builder() {
            return new AuthorEmbed();
        }

        public AuthorEmbed setName(String name) {
            this.name = name;
            return this;
        }

        public AuthorEmbed setUrl(String url) {
            this.url = url;
            return this;
        }

        public AuthorEmbed setIconURL(String icon_url) {
            this.icon_url = icon_url;
            return this;
        }

        public String getName() {
            return name;
        }

        public String getUrl() {
            return url;
        }

        public String getIconURL() {
            return icon_url;
        }

    }

}
