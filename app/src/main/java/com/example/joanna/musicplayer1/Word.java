package com.example.joanna.musicplayer1;

/**
 * Created by Joanna on 19.03.2018.
 */

public class Word {


/**
 * {@link Word} represents all the info about songs.
 * It contains a song title, Artist and time of song .


    /** Song Title*/
    private String mSongTitle;

    /** Artist name */
    private String mArtist;

    /** Song time */
    private String mSongTime;



    /**
     * Create a new Word object.
     */
    public Word(String songTitle, String artist, String songTime) {
        mSongTitle = songTitle;
        mArtist = artist;
        mSongTime = songTime;
    }

    /**
     * Get song title.
     */
    public String getSongTitle() {
        return mSongTitle;
    }

    /**
     * Get Artist name.
     */
    public String getArtist() {
        return mArtist;
    }

    /**
     * Return song time.
     */
    public String getSongTime() {
        return mSongTime;
    }



}