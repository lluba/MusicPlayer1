package com.example.joanna.musicplayer1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Joanna on 20.03.2018.
 */

public class ActiveSong extends AppCompatActivity {

        Button b;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.active_song);
            b = (Button) findViewById(R.id.button_play);
            initializeUI();

            b.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Intent i = new Intent(ActiveSong.this, ActiveSong.class);
                    startActivity(i);
                }
            });
        }




        private void initializeUI() {
            Button mPlayButton = (Button) findViewById(R.id.button_play);
            Button mPauseButton = (Button) findViewById(R.id.button_pause);
            Button mResetButton = (Button) findViewById(R.id.button_reset);

            mPauseButton.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(getApplicationContext(), "pause" , Toast.LENGTH_SHORT).show();
                        }
                    });
            mPlayButton.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(getApplicationContext(), "play" , Toast.LENGTH_SHORT).show();
                        }
                    });
            mResetButton.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(getApplicationContext(), "reset" , Toast.LENGTH_SHORT).show();
                        }
                    });
        }





                }


