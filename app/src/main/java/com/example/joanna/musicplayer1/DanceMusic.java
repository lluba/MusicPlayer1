package com.example.joanna.musicplayer1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
/**
 * Created by Joanna on 19.03.2018.
 */

public class DanceMusic extends Fragment {


    public DanceMusic() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Generous", "Olivia Holt", "4:02"));
        words.add(new Word("Beautiful Trauma", "Pink", "4:58"));
        words.add(new Word("Blame", "Skylar Stecker", "2:53"));
        words.add(new Word("Cold", "Ralphi Rosario feat. Donna Blakely", "3:52"));
        words.add(new Word("Tell Me You Love Me", "Demi Lovato", "6:48"));
        words.add(new Word("Wolves", "Selena Gomez X Marshmello", "3:33"));
        words.add(new Word("Lights Down Low", "MAX Featuring gnash", "3:51"));
        words.add(new Word("The Middle", "Zedd, Maren Morris & Grey", "3:05"));
        words.add(new Word("Meant To Be", "Bebe Rexha & Florida Georgia Line", "2:58"));
        words.add(new Word("Never Be The Same", "Camila Cabello", "4:02"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.list_song);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);



        // Set a click listener to play the song of choose
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
         public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                // Get the {@link Word} object at the given position the user clicked on
               Word word = words.get(position);

               Intent intent = new Intent(view.getContext(), ActiveSong.class);
               startActivity(intent);
          }});


                return rootView;
    }}