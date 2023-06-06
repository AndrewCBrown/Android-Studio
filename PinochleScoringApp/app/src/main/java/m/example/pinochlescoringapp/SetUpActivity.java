package m.example.pinochlescoringapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SetUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_up);
    }

    public void start_button_handler(View view) {
        //Save the team names to their appropriate variables
        EditText tempView;
        tempView = findViewById(R.id.team_1_editText);
        MainActivity.team_1_name = tempView.getText().toString();
        tempView = findViewById(R.id.team_2_editText);
        MainActivity.team_2_name = tempView.getText().toString();

        //Launch overview activity
        Intent intent = new Intent(this, OverviewActivity.class);
        startActivity(intent);
    }
}
