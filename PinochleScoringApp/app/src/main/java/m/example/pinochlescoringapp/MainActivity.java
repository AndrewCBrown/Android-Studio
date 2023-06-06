package m.example.pinochlescoringapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //All the public variables for the app to store the various values
    public static String team_1_name;
    public static String team_2_name;

    public static int r1_bid = 0;
    public static int r1_team = 0;
    public static String r1_suit = "";
    public static int r1_team_1_meld = 0;
    public static int r1_team_2_meld = 0;
    public static int r1_team_1_tricks = 0;
    public static int r1_team_2_tricks = 0;
    public static int r1_team_1_meld_multiplier = 1;
    public static int r1_team_2_meld_multiplier = 1;
    public static int r1_team_1_score = 0;
    public static int r1_team_2_score = 0;

    public static int r2_bid = 0;
    public static int r2_team = 0;
    public static String r2_suit = "";
    public static int r2_team_1_meld = 0;
    public static int r2_team_2_meld = 0;
    public static int r2_team_1_tricks = 0;
    public static int r2_team_2_tricks = 0;
    public static int r2_team_1_meld_multiplier = 1;
    public static int r2_team_2_meld_multiplier = 1;
    public static int r2_team_1_score = 0;
    public static int r2_team_2_score = 0;

    public static int r3_bid = 0;
    public static int r3_team = 0;
    public static String r3_suit = "";
    public static int r3_team_1_meld = 0;
    public static int r3_team_2_meld = 0;
    public static int r3_team_1_tricks = 0;
    public static int r3_team_2_tricks = 0;
    public static int r3_team_1_meld_multiplier = 1;
    public static int r3_team_2_meld_multiplier = 1;
    public static int r3_team_1_score = 0;
    public static int r3_team_2_score = 0;

    public static int r4_bid = 0;
    public static int r4_team = 0;
    public static String r4_suit = "";
    public static int r4_team_1_meld = 0;
    public static int r4_team_2_meld = 0;
    public static int r4_team_1_tricks = 0;
    public static int r4_team_2_tricks = 0;
    public static int r4_team_1_meld_multiplier = 1;
    public static int r4_team_2_meld_multiplier = 1;
    public static int r4_team_1_score = 0;
    public static int r4_team_2_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void play_button_handler(View view) {
        //Launch set up activity
        Intent intent = new Intent(this, SetUpActivity.class);
        startActivity(intent);
    }

    public void info_button_handler(View view) {
        //Launch scrolling information activity
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }
}
