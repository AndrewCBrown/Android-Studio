package m.example.pinochlescoringapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OverviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
    }

    @Override
    protected void onStart()
    {
        super.onStart();

        //Initialize everything to display the proper values
        //Round 1
        TextView round_1_phrase = findViewById(R.id.round_1_phrase);
        String team_r1;

        switch (MainActivity.r1_team)
        {
            case 1:
                //Team 1 took the bid in round 1
                team_r1 = MainActivity.team_1_name;
                break;
            case 2:
                //Team 2 took the bid in round 1
                team_r1 = MainActivity.team_2_name;
                break;
            default:
                //User never selected which team took the bid
                team_r1 = getText(R.string.unknown).toString();
                break;
        }
        String cat_r1;
        cat_r1 = "Round 1: " + team_r1 + " bid " + MainActivity.r1_bid + " in " + MainActivity.r1_suit;
        round_1_phrase.setText(cat_r1);

        TextView round_1_team_1_textView = findViewById(R.id.round_1_team_1_textView);
        round_1_team_1_textView.setText(MainActivity.team_1_name);

        TextView round_1_team_1_meld_textView = findViewById(R.id.round_1_team_1_meld_textView);
        round_1_team_1_meld_textView.setText(Integer.toString(MainActivity.r1_team_1_meld));

        TextView round_1_team_1_tricks_textView = findViewById(R.id.round_1_team_1_tricks_textView);
        round_1_team_1_tricks_textView.setText(Integer.toString(MainActivity.r1_team_1_tricks));

        TextView round_1_team_1_total_textView = findViewById(R.id.round_1_team_1_total_textView);
        round_1_team_1_total_textView.setText(Integer.toString(MainActivity.r1_team_1_score));

        TextView round_1_team_2_textView = findViewById(R.id.round_1_team_2_textView);
        round_1_team_2_textView.setText(MainActivity.team_2_name);

        TextView round_1_team_2_meld_textView = findViewById(R.id.round_1_team_2_meld_textView);
        round_1_team_2_meld_textView.setText(Integer.toString(MainActivity.r1_team_2_meld));

        TextView round_1_team_2_tricks_textView = findViewById(R.id.round_1_team_2_tricks_textView);
        round_1_team_2_tricks_textView.setText(Integer.toString(MainActivity.r1_team_2_tricks));

        TextView round_1_team_2_total_textView = findViewById(R.id.round_1_team_2_total_textView);
        round_1_team_2_total_textView.setText(Integer.toString(MainActivity.r1_team_2_score));



        //Round 2
        TextView round_2_phrase = findViewById(R.id.round_2_phrase);
        String team_r2;

        switch (MainActivity.r2_team)
        {
            case 1:
                //Team 1 took the bid in round 2
                team_r2 = MainActivity.team_1_name;
                break;
            case 2:
                //Team 2 took the bid in round 2
                team_r2 = MainActivity.team_2_name;
                break;
            default:
                //User never selected which team took the bid
                team_r2 = getText(R.string.unknown).toString();
                break;
        }
        String cat_r2;
        cat_r2 = "Round 2: " + team_r2 + " bid " + MainActivity.r2_bid + " in " + MainActivity.r2_suit;
        round_2_phrase.setText(cat_r2);

        TextView round_2_team_1_textView = findViewById(R.id.round_2_team_1_textView);
        round_2_team_1_textView.setText(MainActivity.team_1_name);

        TextView round_2_team_1_meld_textView = findViewById(R.id.round_2_team_1_meld_textView);
        round_2_team_1_meld_textView.setText(Integer.toString(MainActivity.r2_team_1_meld));

        TextView round_2_team_1_tricks_textView = findViewById(R.id.round_2_team_1_tricks_textView);
        round_2_team_1_tricks_textView.setText(Integer.toString(MainActivity.r2_team_1_tricks));

        TextView round_2_team_1_total_textView = findViewById(R.id.round_2_team_1_total_textView);
        round_2_team_1_total_textView.setText(Integer.toString(MainActivity.r2_team_1_score));

        TextView round_2_team_2_textView = findViewById(R.id.round_2_team_2_textView);
        round_2_team_2_textView.setText(MainActivity.team_2_name);

        TextView round_2_team_2_meld_textView = findViewById(R.id.round_2_team_2_meld_textView);
        round_2_team_2_meld_textView.setText(Integer.toString(MainActivity.r2_team_2_meld));

        TextView round_2_team_2_tricks_textView = findViewById(R.id.round_2_team_2_tricks_textView);
        round_2_team_2_tricks_textView.setText(Integer.toString(MainActivity.r2_team_2_tricks));

        TextView round_2_team_2_total_textView = findViewById(R.id.round_2_team_2_total_textView);
        round_2_team_2_total_textView.setText(Integer.toString(MainActivity.r2_team_2_score));


        //Round 3
        TextView round_3_phrase = findViewById(R.id.round_3_phrase);
        String team_r3;

        switch (MainActivity.r3_team)
        {
            case 1:
                //Team 1 took the bid in round 3
                team_r3 = MainActivity.team_1_name;
                break;
            case 2:
                //Team 2 took the bid in round 3
                team_r3 = MainActivity.team_2_name;
                break;
            default:
                //User never selected which team took the bid
                team_r3 = getText(R.string.unknown).toString();
                break;
        }
        String cat_r3;
        cat_r3 = "Round 3: " + team_r3 + " bid " + MainActivity.r3_bid + " in " + MainActivity.r3_suit;
        round_3_phrase.setText(cat_r3);

        TextView round_3_team_1_textView = findViewById(R.id.round_3_team_1_textView);
        round_3_team_1_textView.setText(MainActivity.team_1_name);

        TextView round_3_team_1_meld_textView = findViewById(R.id.round_3_team_1_meld_textView);
        round_3_team_1_meld_textView.setText(Integer.toString(MainActivity.r3_team_1_meld));

        TextView round_3_team_1_tricks_textView = findViewById(R.id.round_3_team_1_tricks_textView);
        round_3_team_1_tricks_textView.setText(Integer.toString(MainActivity.r3_team_1_tricks));

        TextView round_3_team_1_total_textView = findViewById(R.id.round_3_team_1_total_textView);
        round_3_team_1_total_textView.setText(Integer.toString(MainActivity.r3_team_1_score));

        TextView round_3_team_2_textView = findViewById(R.id.round_3_team_2_textView);
        round_3_team_2_textView.setText(MainActivity.team_2_name);

        TextView round_3_team_2_meld_textView = findViewById(R.id.round_3_team_2_meld_textView);
        round_3_team_2_meld_textView.setText(Integer.toString(MainActivity.r3_team_2_meld));

        TextView round_3_team_2_tricks_textView = findViewById(R.id.round_3_team_2_tricks_textView);
        round_3_team_2_tricks_textView.setText(Integer.toString(MainActivity.r3_team_2_tricks));

        TextView round_3_team_2_total_textView = findViewById(R.id.round_3_team_2_total_textView);
        round_3_team_2_total_textView.setText(Integer.toString(MainActivity.r3_team_2_score));



        //Round 4
        TextView round_4_phrase = findViewById(R.id.round_4_phrase);
        String team_r4;

        switch (MainActivity.r4_team)
        {
            case 1:
                //Team 1 took the bid in round 4
                team_r4 = MainActivity.team_1_name;
                break;
            case 2:
                //Team 2 took the bid in round 4
                team_r4 = MainActivity.team_2_name;
                break;
            default:
                //User never selected which team took the bid
                team_r4 = getText(R.string.unknown).toString();
                break;
        }
        String cat_r4;
        cat_r4 = "Round 4: " + team_r4 + " bid " + MainActivity.r4_bid + " in " + MainActivity.r4_suit;
        round_4_phrase.setText(cat_r4);

        TextView round_4_team_1_textView = findViewById(R.id.round_4_team_1_textView);
        round_4_team_1_textView.setText(MainActivity.team_1_name);

        TextView round_4_team_1_meld_textView = findViewById(R.id.round_4_team_1_meld_textView);
        round_4_team_1_meld_textView.setText(Integer.toString(MainActivity.r4_team_1_meld));

        TextView round_4_team_1_tricks_textView = findViewById(R.id.round_4_team_1_tricks_textView);
        round_4_team_1_tricks_textView.setText(Integer.toString(MainActivity.r4_team_1_tricks));

        TextView round_4_team_1_total_textView = findViewById(R.id.round_4_team_1_total_textView);
        round_4_team_1_total_textView.setText(Integer.toString(MainActivity.r4_team_1_score));

        TextView round_4_team_2_textView = findViewById(R.id.round_4_team_2_textView);
        round_4_team_2_textView.setText(MainActivity.team_2_name);

        TextView round_4_team_2_meld_textView = findViewById(R.id.round_4_team_2_meld_textView);
        round_4_team_2_meld_textView.setText(Integer.toString(MainActivity.r4_team_2_meld));

        TextView round_4_team_2_tricks_textView = findViewById(R.id.round_4_team_2_tricks_textView);
        round_4_team_2_tricks_textView.setText(Integer.toString(MainActivity.r4_team_2_tricks));

        TextView round_4_team_2_total_textView = findViewById(R.id.round_4_team_2_total_textView);
        round_4_team_2_total_textView.setText(Integer.toString(MainActivity.r4_team_2_score));


        //Totals
        TextView total_team_1_textView = findViewById(R.id.total_team_1_textView);
        total_team_1_textView.setText(MainActivity.team_1_name);

        TextView total_team_1_total_textView = findViewById(R.id.total_team_1_total_textView);
        int team_1_total = MainActivity.r1_team_1_score + MainActivity.r2_team_1_score + MainActivity.r3_team_1_score + MainActivity.r4_team_1_score;
        total_team_1_total_textView.setText(Integer.toString(team_1_total));

        TextView total_team_2_textView = findViewById(R.id.total_team_2_textView);
        total_team_2_textView.setText(MainActivity.team_2_name);

        TextView total_team_2_total_textView = findViewById(R.id.total_team_2_total_textView);
        int team_2_total = MainActivity.r1_team_2_score + MainActivity.r2_team_2_score + MainActivity.r3_team_2_score + MainActivity.r4_team_2_score;
        total_team_2_total_textView.setText(Integer.toString(team_2_total));
    }

    public void round_1_button_handler(View view) {
        //Launch Round One Activity
        Intent intent = new Intent(this, RoundOneActivity.class);
        startActivity(intent);
    }

    public void round_2_button_handler(View view) {
        //Launch Round Two Activity
        Intent intent = new Intent(this, RoundTwoActivity.class);
        startActivity(intent);
    }

    public void round_3_button_handler(View view) {
        //Launch Round Three Activity
        Intent intent = new Intent(this, RoundThreeActivity.class);
        startActivity(intent);
    }

    public void round_4_button_handler(View view) {
        //Launch Round Four Activity
        Intent intent = new Intent(this, RoundFourActivity.class);
        startActivity(intent);
    }

    public void new_game_button_handler(View view) {
        //Reset all variables to default values
        MainActivity.team_1_name = "";
        MainActivity.team_2_name = "";

        MainActivity.r1_bid = 0;
        MainActivity.r1_team = 0;
        MainActivity.r1_suit = "";
        MainActivity.r1_team_1_meld = 0;
        MainActivity.r1_team_2_meld = 0;
        MainActivity.r1_team_1_tricks = 0;
        MainActivity.r1_team_2_tricks = 0;
        MainActivity.r1_team_1_meld_multiplier = 1;
        MainActivity.r1_team_2_meld_multiplier = 1;
        MainActivity.r1_team_1_score = 0;
        MainActivity.r1_team_2_score = 0;

        MainActivity.r2_bid = 0;
        MainActivity.r2_team = 0;
        MainActivity.r2_suit = "";
        MainActivity.r2_team_1_meld = 0;
        MainActivity.r2_team_2_meld = 0;
        MainActivity.r2_team_1_tricks = 0;
        MainActivity.r2_team_2_tricks = 0;
        MainActivity.r2_team_1_meld_multiplier = 1;
        MainActivity.r2_team_2_meld_multiplier = 1;
        MainActivity.r2_team_1_score = 0;
        MainActivity.r2_team_2_score = 0;

        MainActivity.r3_bid = 0;
        MainActivity.r3_team = 0;
        MainActivity.r3_suit = "";
        MainActivity.r3_team_1_meld = 0;
        MainActivity.r3_team_2_meld = 0;
        MainActivity.r3_team_1_tricks = 0;
        MainActivity.r3_team_2_tricks = 0;
        MainActivity.r3_team_1_meld_multiplier = 1;
        MainActivity.r3_team_2_meld_multiplier = 1;
        MainActivity.r3_team_1_score = 0;
        MainActivity.r3_team_2_score = 0;

        MainActivity.r4_bid = 0;
        MainActivity.r4_team = 0;
        MainActivity.r4_suit = "";
        MainActivity.r4_team_1_meld = 0;
        MainActivity.r4_team_2_meld = 0;
        MainActivity.r4_team_1_tricks = 0;
        MainActivity.r4_team_2_tricks = 0;
        MainActivity.r4_team_1_meld_multiplier = 1;
        MainActivity.r4_team_2_meld_multiplier = 1;
        MainActivity.r4_team_1_score = 0;
        MainActivity.r4_team_2_score = 0;

        //Launch Main Activity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
