package edu.orangecoastcollege.cs273.mpaulding.gamersdelight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class GameDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_details);

        // TODO:  Use the Intent object sent from GameListActivity to populate the Views on
        // TODO:  this layout, including the TextViews, RatingBar and ImageView with the Game details.

        ImageView gameDetailsImageView = (ImageView) findViewById(R.id.gameDetailsImageView);
        TextView gameDetailsNameTextView = (TextView) findViewById(R.id.gameDetailsNameTextView);
        TextView gameDetailsDescriptionTextView = (TextView) findViewById(R.id.gameDetailsDescriptionTextView);
        RatingBar gameDetailsRatingBar = (RatingBar) findViewById(R.id.gameDetailsRatingBar);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        String description = intent.getStringExtra("Description");

    }
}
