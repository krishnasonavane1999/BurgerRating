package com.example.burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);

        textView = findViewById(R.id.textView);
    }

    public void submit(View view){

        float ratingValue = ratingBar.getRating();

        if(ratingValue<2){

            textView.setText("Rating: "+ratingValue+"\nSorry we will do our best next time.");
        }
        else if(ratingValue<=3 && ratingValue==2){

            textView.setText("Rating: "+ratingValue+"\nGood service.");
        }
        else if(ratingValue<=4 && ratingValue==3){

            textView.setText("Rating: "+ratingValue+"\nBetter service.");
        }
        else if(ratingValue<=5 && ratingValue==4){

            textView.setText("Rating: "+ratingValue+"\nBest service I have ever seen");
        }
        else if(ratingValue==5){

            textView.setText("Rating: "+ratingValue+"\nExcellent service I have ever experienced.");
        }

        Toast.makeText(this,"Thank you for your feedback.",Toast.LENGTH_LONG).show();




    }
}
