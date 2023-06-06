package m.example.pinochlescoringapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RoundTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round_two);
    }

    @Override
    protected void onStart() {
        super.onStart();

        EditText bid_editText = findViewById(R.id.bid_editText);
        bid_editText.setText(Integer.toString(MainActivity.r2_bid));

        Button team_1_button = findViewById(R.id.team_1_button);
        Button team_2_button = findViewById(R.id.team_2_button);

        //Update the buttons with the team names
        team_1_button.setText(MainActivity.team_1_name);
        team_2_button.setText(MainActivity.team_2_name);

        switch (MainActivity.r2_team)
        {
            case 1:
                //Team 1 got the bid
                team_1_button.setBackgroundColor(getResources().getColor(R.color.selected_button));
                team_2_button.setBackgroundColor(getResources().getColor(R.color.unselected_button));
                break;
            case 2:
                //Team 2 got the bid
                team_1_button.setBackgroundColor(getResources().getColor(R.color.unselected_button));
                team_2_button.setBackgroundColor(getResources().getColor(R.color.selected_button));
                break;
            default:
                //The user has not entered who got the bid
                team_1_button.setBackgroundColor(getResources().getColor(R.color.unselected_button));
                team_2_button.setBackgroundColor(getResources().getColor(R.color.unselected_button));
                break;
        }

        ImageView spade_image = findViewById(R.id.spade_image);
        ImageView heart_image = findViewById(R.id.heart_image);
        ImageView club_image = findViewById(R.id.club_image);
        ImageView diamond_image = findViewById(R.id.diamond_image);

        if (MainActivity.r2_suit == "spades")
        {
            spade_image.setBackgroundColor(getResources().getColor(R.color.selected_button));
            heart_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
            club_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
            diamond_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
        }
        else if (MainActivity.r2_suit == "hearts")
        {
            spade_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
            heart_image.setBackgroundColor(getResources().getColor(R.color.selected_button));
            club_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
            diamond_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
        }
        else if (MainActivity.r2_suit == "clubs")
        {
            spade_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
            heart_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
            club_image.setBackgroundColor(getResources().getColor(R.color.selected_button));
            diamond_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
        }
        else if (MainActivity.r2_suit == "diamonds")
        {
            spade_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
            heart_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
            club_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
            diamond_image.setBackgroundColor(getResources().getColor(R.color.selected_button));
        }
        else //User has not entered suit yet
        {
            spade_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
            heart_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
            club_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
            diamond_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
        }

        //Update the team names
        TextView team_1_meld_textView = findViewById(R.id.team_1_meld_textView);
        TextView team_2_meld_textView = findViewById(R.id.team_2_meld_textView);
        team_1_meld_textView.setText(MainActivity.team_1_name);
        team_2_meld_textView.setText(MainActivity.team_2_name);

        EditText team_1_meld_editText = findViewById(R.id.team_1_meld_editText);
        team_1_meld_editText.setText(Integer.toString(MainActivity.r2_team_1_meld));
        EditText team_2_meld_editText = findViewById(R.id.team_2_meld_editText);
        team_2_meld_editText.setText(Integer.toString(MainActivity.r2_team_2_meld));

        Button team_1_took_all_button = findViewById(R.id.team_1_took_all_button);
        team_1_took_all_button.setText(MainActivity.team_1_name + " swept");
        Button team_2_took_all_button = findViewById(R.id.team_2_took_all_button);
        team_2_took_all_button.setText(MainActivity.team_2_name + " swept");

        //Update the team names
        TextView team_1_tricks_textView = findViewById(R.id.team_1_tricks_textView);
        TextView team_2_tricks_textView = findViewById(R.id.team_2_tricks_textView);
        team_1_tricks_textView.setText(MainActivity.team_1_name);
        team_2_tricks_textView.setText(MainActivity.team_2_name);

        EditText team_1_tricks_editText = findViewById(R.id.team_1_tricks_editText);
        team_1_tricks_editText.setText(Integer.toString(MainActivity.r2_team_1_tricks));
        EditText team_2_tricks_editText = findViewById(R.id.team_2_tricks_editText);
        team_2_tricks_editText.setText(Integer.toString(MainActivity.r2_team_2_tricks));

        TextView team_1_round_score_textView = findViewById(R.id.team_1_round_score_textView);
        String cat1;
        cat1 = MainActivity.team_1_name + ": " + MainActivity.r2_team_1_score;
        team_1_round_score_textView.setText(cat1);
        TextView team_2_round_score_textView = findViewById(R.id.team_2_round_score_textView);
        String cat2;
        cat2 = MainActivity.team_2_name + ": " + MainActivity.r2_team_2_score;
        team_2_round_score_textView.setText(cat2);
    }

    public void overview_button_handler(View view) {
        //Save all values currently entered in fields

        //Launch Overview Activity
        Intent intent = new Intent(this, OverviewActivity.class);
        startActivity(intent);
    }

    public void round_1_button_handler(View view) {
        //Save all values currently entered in fields

        //Launch Round One Activity
        Intent intent = new Intent(this, RoundOneActivity.class);
        startActivity(intent);
    }

    public void round_3_button_handler(View view) {
        //Save all values currently entered in fields

        //Launch Round Three Activity
        Intent intent = new Intent(this, RoundThreeActivity.class);
        startActivity(intent);
    }

    public void round_4_button_handler(View view) {
        //Save all values currently entered in fields

        //Launch Round Four Activity
        Intent intent = new Intent(this, RoundFourActivity.class);
        startActivity(intent);
    }

    public void team_2_button_handler(View view) {
        //Give button dark background and make other light
        Button team_1_button = findViewById(R.id.team_1_button);
        Button team_2_button = findViewById(R.id.team_2_button);
        team_1_button.setBackgroundColor(getResources().getColor(R.color.unselected_button));
        team_2_button.setBackgroundColor(getResources().getColor(R.color.selected_button));

        //Select that team 2 got the bid in round 2
        MainActivity.r2_team = 2;
    }

    public void team_1_button_handler(View view) {
        //Give button dark background and make other light
        Button team_1_button = findViewById(R.id.team_1_button);
        Button team_2_button = findViewById(R.id.team_2_button);
        team_1_button.setBackgroundColor(getResources().getColor(R.color.selected_button));
        team_2_button.setBackgroundColor(getResources().getColor(R.color.unselected_button));

        //Select that team 1 got the bid in round 2
        MainActivity.r2_team = 1;
    }

    public void spade_image_handler(View view) {
        //Give button dark background and make other light
        ImageView spade_image = findViewById(R.id.spade_image);
        ImageView heart_image = findViewById(R.id.heart_image);
        ImageView club_image = findViewById(R.id.club_image);
        ImageView diamond_image = findViewById(R.id.diamond_image);
        spade_image.setBackgroundColor(getResources().getColor(R.color.selected_button));
        heart_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
        club_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
        diamond_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));

        //Select that spades is trump in round 2
        MainActivity.r2_suit = "spades";
    }

    public void heart_image_handler(View view) {
        //Give button dark background and make other light
        ImageView spade_image = findViewById(R.id.spade_image);
        ImageView heart_image = findViewById(R.id.heart_image);
        ImageView club_image = findViewById(R.id.club_image);
        ImageView diamond_image = findViewById(R.id.diamond_image);
        spade_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
        heart_image.setBackgroundColor(getResources().getColor(R.color.selected_button));
        club_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
        diamond_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));

        //Select that hearts is trump in round 2
        MainActivity.r2_suit = "hearts";
    }

    public void club_image_handler(View view) {
        //Give button dark background and make other light
        ImageView spade_image = findViewById(R.id.spade_image);
        ImageView heart_image = findViewById(R.id.heart_image);
        ImageView club_image = findViewById(R.id.club_image);
        ImageView diamond_image = findViewById(R.id.diamond_image);
        spade_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
        heart_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
        club_image.setBackgroundColor(getResources().getColor(R.color.selected_button));
        diamond_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));

        //Select that clubs is trump in round 2
        MainActivity.r2_suit = "clubs";
    }

    public void diamond_image_handler(View view) {
        //Give button dark background and make other light
        ImageView spade_image = findViewById(R.id.spade_image);
        ImageView heart_image = findViewById(R.id.heart_image);
        ImageView club_image = findViewById(R.id.club_image);
        ImageView diamond_image = findViewById(R.id.diamond_image);
        spade_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
        heart_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
        club_image.setBackgroundColor(getResources().getColor(R.color.unselected_image));
        diamond_image.setBackgroundColor(getResources().getColor(R.color.selected_button));

        //Select that diamonds is trump in round 2
        MainActivity.r2_suit = "diamonds";
    }

    public void team_1_took_all_button_handler(View view) {
        //Update tricks taken
        EditText team_1_tricks_editText = findViewById(R.id.team_1_tricks_editText);
        team_1_tricks_editText.setText(Integer.toString(250));
        EditText team_2_tricks_editText = findViewById(R.id.team_2_tricks_editText);
        team_2_tricks_editText.setText(Integer.toString(0));

        //Update the meld multiplier for team 2
        MainActivity.r2_team_2_meld_multiplier = 0;
    }

    public void team_2_took_all_button_handler(View view) {
        //Update tricks taken
        EditText team_1_tricks_editText = findViewById(R.id.team_1_tricks_editText);
        team_1_tricks_editText.setText(Integer.toString(0));
        EditText team_2_tricks_editText = findViewById(R.id.team_2_tricks_editText);
        team_2_tricks_editText.setText(Integer.toString(250));

        //Update the meld multiplier for team 1
        MainActivity.r2_team_1_meld_multiplier = 0;
    }

    public void done_button_handler(View view) {
        //Save all entered fields
        EditText bid_editText = findViewById(R.id.bid_editText);
        EditText team_1_meld_editText = findViewById(R.id.team_1_meld_editText);
        EditText team_2_meld_editText = findViewById(R.id.team_2_meld_editText);
        EditText team_1_tricks_editText = findViewById(R.id.team_1_tricks_editText);
        EditText team_2_tricks_editText = findViewById(R.id.team_2_tricks_editText);

        MainActivity.r2_bid = Integer.parseInt(bid_editText.getText().toString());
        MainActivity.r2_team_1_meld = Integer.parseInt(team_1_meld_editText.getText().toString());
        MainActivity.r2_team_2_meld = Integer.parseInt(team_2_meld_editText.getText().toString());
        MainActivity.r2_team_1_tricks = Integer.parseInt(team_1_tricks_editText.getText().toString());
        MainActivity.r2_team_2_tricks = Integer.parseInt(team_2_tricks_editText.getText().toString());

        //Check tricks taken to update the meld multiplier in case user clicked wrong button and changed later
        if (MainActivity.r2_team_1_tricks > 0)
        {
            MainActivity.r2_team_1_meld_multiplier = 1;
        }
        if (MainActivity.r2_team_2_tricks > 0)
        {
            MainActivity.r2_team_2_meld_multiplier = 1;
        }

        //Calculate round scores
        if (MainActivity.r2_team == 1)
        {
            MainActivity.r2_team_2_score =
                    (MainActivity.r2_team_2_meld * MainActivity.r2_team_2_meld_multiplier)
                            + MainActivity.r2_team_2_tricks;

            MainActivity.r2_team_1_score =
                    (MainActivity.r2_team_1_meld * MainActivity.r2_team_1_meld_multiplier)
                            + MainActivity.r2_team_1_tricks;
            if (MainActivity.r2_team_1_score < MainActivity.r2_bid)
            {
                MainActivity.r2_team_1_score = -MainActivity.r2_bid;
            }
        }
        else if (MainActivity.r2_team == 2)
        {
            MainActivity.r2_team_1_score =
                    (MainActivity.r2_team_1_meld * MainActivity.r2_team_1_meld_multiplier)
                            + MainActivity.r2_team_1_tricks;

            MainActivity.r2_team_2_score =
                    (MainActivity.r2_team_2_meld * MainActivity.r2_team_2_meld_multiplier)
                            + MainActivity.r2_team_2_tricks;
            if (MainActivity.r2_team_2_score < MainActivity.r2_bid)
            {
                MainActivity.r2_team_2_score = -MainActivity.r2_bid;
            }
        }
        else //User never entered which team got the bid so we don't calculate any score
        {}

        //Update round scores
        TextView team_1_round_score_textView = findViewById(R.id.team_1_round_score_textView);
        String cat1;
        cat1 = MainActivity.team_1_name + ": " + MainActivity.r2_team_1_score;
        team_1_round_score_textView.setText(cat1);
        TextView team_2_round_score_textView = findViewById(R.id.team_2_round_score_textView);
        String cat2;
        cat2 = MainActivity.team_2_name + ": " + MainActivity.r2_team_2_score;
        team_2_round_score_textView.setText(cat2);
    }
}
