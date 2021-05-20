package sg.edu.rp.c346.id20014198.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {
    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        int questionsSelected1 = intentReceived.getIntExtra("Question", 1);
        int questionsSelected2 = intentReceived.getIntExtra("Question", 2);

        if(questionsSelected1 == 1) {
            tvAnswer.setText("Q" + questionsSelected1 + " answer is: Queue");
        } else {
            tvAnswer.setText("Q" + questionsSelected2 + " answer is: Gone");
            }



    }
}