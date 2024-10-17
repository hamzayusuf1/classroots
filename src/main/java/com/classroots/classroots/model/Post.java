package com.classroots.classroots.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "PlayerList")
public class Post {
    private String name;
    private String bio;
    private String position;
    private int seasons_played;
    private String previous_clubs[];

    public Post() {
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSeasons_played() {
        return seasons_played;
    }

    public String[] getPrevious_clubs() {
        return previous_clubs;
    }

    @Override
    public String toString() {
        return "Post{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", seasons_played=" + seasons_played +
                ", previous_clubs=" + Arrays.toString(previous_clubs) +
                '}';
    }
}
