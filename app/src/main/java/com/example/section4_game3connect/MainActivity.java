package com.example.section4_game3connect;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    boolean isYellowTurn = true;
    int redPoints = 0;
    int yellowPoints = 0;
    TextView yellowPointsTextView;
    TextView redPointsTextView;
    ImageView col_0_row_0;
    ImageView col_1_row_0;
    ImageView col_2_row_0;
    ImageView col_0_row_1;
    ImageView col_1_row_1;
    ImageView col_2_row_1;
    ImageView col_0_row_2;
    ImageView col_1_row_2;
    ImageView col_2_row_2;




    @SuppressLint("SetTextI18n")
    public void resetGame(View view){
        col_0_row_0=findViewById(R.id.col_0_row_0);
        col_0_row_0.setAlpha(0.0f);
        col_0_row_0.setTag("empty");
        col_1_row_0=findViewById(R.id.col_1_row_0);
        col_1_row_0.setAlpha(0.0f);
        col_1_row_0.setTag("empty");
        col_2_row_0=findViewById(R.id.col_2_row_0);
        col_2_row_0.setAlpha(0.0f);
        col_2_row_0.setTag("empty");
        col_0_row_1=findViewById(R.id.col_0_row_1);
        col_0_row_1.setAlpha(0.0f);
        col_0_row_1.setTag("empty");
        col_1_row_1=findViewById(R.id.col_1_row_1);
        col_1_row_1.setAlpha(0.0f);
        col_1_row_1.setTag("empty");
        col_2_row_1=findViewById(R.id.col_2_row_1);
        col_2_row_1.setAlpha(0.0f);
        col_2_row_1.setTag("empty");
        col_0_row_2=findViewById(R.id.col_0_row_2);
        col_0_row_2.setAlpha(0.0f);
        col_0_row_2.setTag("empty");
        col_1_row_2=findViewById(R.id.col_1_row_2);
        col_1_row_2.setAlpha(0.0f);
        col_1_row_2.setTag("empty");
        col_2_row_2=findViewById(R.id.col_2_row_2);
        col_2_row_2.setAlpha(0.0f);
        col_2_row_2.setTag("empty");
        setClicking(true);
        displayPoints();
    }

    public void playToken(View view){

        if (isYellowTurn){

            if (view.getId()==(R.id.col_0_row_0)) {
                col_0_row_0 = findViewById(R.id.col_0_row_0);
                if(col_0_row_0.getTag()!="empty") {
                    Toast.makeText(this, "Choose other field!", Toast.LENGTH_SHORT).show();
                } else {
                    isYellowTurn = false;
                    col_0_row_0.setTranslationY(-2000);
                    col_0_row_0.setAlpha(1.0f);
                    col_0_row_0.setImageResource(R.drawable.yellow);
                    col_0_row_0.animate().translationYBy(2000).setDuration(1000);
                    col_0_row_0.setTag("yellow");
                    checkGameState();
                }
            }

            if (view.getId()==(R.id.col_1_row_0)) {
                col_1_row_0 = findViewById(R.id.col_1_row_0);
                if(col_1_row_0.getTag()!="empty") {
                    Toast.makeText(this, "Choose other field!", Toast.LENGTH_SHORT).show();
                } else {
                    isYellowTurn = false;
                    col_1_row_0.setTranslationY(-2000);
                    col_1_row_0.setAlpha(1.0f);
                    col_1_row_0.setImageResource(R.drawable.yellow);
                    col_1_row_0.animate().translationYBy(2000).setDuration(1000);
                    col_1_row_0.setTag("yellow");
                    checkGameState();
                }
            }

            if (view.getId()==(R.id.col_2_row_0)) {
                col_2_row_0 = findViewById(R.id.col_2_row_0);
                if(col_2_row_0.getTag()!="empty") {
                    Toast.makeText(this, "Choose other field!", Toast.LENGTH_SHORT).show();
                } else {
                    isYellowTurn = false;
                    col_2_row_0.setTranslationY(-2000);
                    col_2_row_0.setAlpha(1.0f);
                    col_2_row_0.setImageResource(R.drawable.yellow);
                    col_2_row_0.animate().translationYBy(2000).setDuration(1000);
                    col_2_row_0.setTag("yellow");
                    checkGameState();
                }
            }

            if (view.getId()==(R.id.col_0_row_1)) {
                col_0_row_1 = findViewById(R.id.col_0_row_1);
                if(col_0_row_1.getTag()!="empty") {
                    Toast.makeText(this, "Choose other field!", Toast.LENGTH_SHORT).show();
                } else {
                    isYellowTurn = false;
                    col_0_row_1.setTranslationY(-2000);
                    col_0_row_1.setAlpha(1.0f);
                    col_0_row_1.setImageResource(R.drawable.yellow);
                    col_0_row_1.animate().translationYBy(2000).setDuration(1000);
                    col_0_row_1.setTag("yellow");
                    checkGameState();
                }
            }

            if (view.getId()==(R.id.col_1_row_1)) {
                col_1_row_1 = findViewById(R.id.col_1_row_1);
                if(col_1_row_1.getTag()!="empty") {
                    Toast.makeText(this, "Choose other field!", Toast.LENGTH_SHORT).show();
                } else {
                    isYellowTurn = false;
                    col_1_row_1.setTranslationY(-2000);
                    col_1_row_1.setAlpha(1.0f);
                    col_1_row_1.setImageResource(R.drawable.yellow);
                    col_1_row_1.animate().translationYBy(2000).setDuration(1000);
                    col_1_row_1.setTag("yellow");
                    checkGameState();
                }
            }

            if (view.getId()==(R.id.col_2_row_1)) {
                col_2_row_1 = findViewById(R.id.col_2_row_1);
                if(col_2_row_1.getTag()!="empty") {
                    Toast.makeText(this, "Choose other field!", Toast.LENGTH_SHORT).show();
                } else {
                    isYellowTurn = false;
                    col_2_row_1.setTranslationY(-2000);
                    col_2_row_1.setAlpha(1.0f);
                    col_2_row_1.setImageResource(R.drawable.yellow);
                    col_2_row_1.animate().translationYBy(2000).setDuration(1000);
                    col_2_row_1.setTag("yellow");
                    checkGameState();
                }
            }

            if (view.getId()==(R.id.col_0_row_2)) {
                col_0_row_2 = findViewById(R.id.col_0_row_2);
                if(col_0_row_2.getTag()!="empty") {
                    Toast.makeText(this, "Choose other field!", Toast.LENGTH_SHORT).show();
                } else {
                    isYellowTurn = false;
                    col_0_row_2.setTranslationY(-2000);
                    col_0_row_2.setAlpha(1.0f);
                    col_0_row_2.setImageResource(R.drawable.yellow);
                    col_0_row_2.animate().translationYBy(2000).setDuration(1000);
                    col_0_row_2.setTag("yellow");
                    checkGameState();
                }
            }

            if (view.getId()==(R.id.col_1_row_2)) {
                col_1_row_2 = findViewById(R.id.col_1_row_2);
                if(col_1_row_2.getTag()!="empty") {
                    Toast.makeText(this, "Choose other field!", Toast.LENGTH_SHORT).show();
                } else {
                    isYellowTurn = false;
                    col_1_row_2.setTranslationY(-2000);
                    col_1_row_2.setAlpha(1.0f);
                    col_1_row_2.setImageResource(R.drawable.yellow);
                    col_1_row_2.animate().translationYBy(2000).setDuration(1000);
                    col_1_row_2.setTag("yellow");
                    checkGameState();
                }
            }

            if (view.getId()==(R.id.col_2_row_2)) {
                col_2_row_2 = findViewById(R.id.col_2_row_2);
                if(col_2_row_2.getTag()!="empty") {
                    Toast.makeText(this, "Choose other field!", Toast.LENGTH_SHORT).show();
                } else {
                    isYellowTurn = false;
                    col_2_row_2.setTranslationY(-2000);
                    col_2_row_2.setAlpha(1.0f);
                    col_2_row_2.setImageResource(R.drawable.yellow);
                    col_2_row_2.animate().translationYBy(2000).setDuration(1000);
                    col_2_row_2.setTag("yellow");
                    checkGameState();
                }
            }

        } else {

            if (view.getId()==(R.id.col_0_row_0)) {
                col_0_row_0 = findViewById(R.id.col_0_row_0);
                if(col_0_row_0.getTag()!="empty") {
                    Toast.makeText(this, "Choose other field!", Toast.LENGTH_SHORT).show();
                } else {
                    isYellowTurn = true;
                    col_0_row_0.setTranslationY(-2000);
                    col_0_row_0.setAlpha(1.0f);
                    col_0_row_0.setImageResource(R.drawable.red);
                    col_0_row_0.animate().translationYBy(2000).setDuration(1000);
                    col_0_row_0.setTag("red");
                    checkGameState();
                }
            }

            if (view.getId()==(R.id.col_1_row_0)) {
                col_1_row_0 = findViewById(R.id.col_1_row_0);
                if(col_1_row_0.getTag()!="empty") {
                    Toast.makeText(this, "Choose other field!", Toast.LENGTH_SHORT).show();
                } else {
                    Log.i("INFORMACJA", "RED TOKEN ON CHART!");
                    isYellowTurn = true;
                    col_1_row_0.setTranslationY(-2000);
                    col_1_row_0.setAlpha(1.0f);
                    col_1_row_0.setImageResource(R.drawable.red);
                    col_1_row_0.animate().translationYBy(2000).setDuration(1000);
                    col_1_row_0.setTag("red");
                    checkGameState();
                }
            }

            if (view.getId()==(R.id.col_2_row_0)) {
                col_2_row_0 = findViewById(R.id.col_2_row_0);
                if(col_2_row_0.getTag()!="empty") {
                    Toast.makeText(this, "Choose other field!", Toast.LENGTH_SHORT).show();
                } else {
                    isYellowTurn = true;
                    col_2_row_0.setTranslationY(-2000);
                    col_2_row_0.setAlpha(1.0f);
                    col_2_row_0.setImageResource(R.drawable.red);
                    col_2_row_0.animate().translationYBy(2000).setDuration(1000);
                    col_2_row_0.setTag("red");
                    checkGameState();
                }
            }

            if (view.getId()==(R.id.col_0_row_1)) {
                col_0_row_1 = findViewById(R.id.col_0_row_1);
                if(col_0_row_1.getTag()!="empty") {
                    Toast.makeText(this, "Choose other field!", Toast.LENGTH_SHORT).show();
                } else {
                    isYellowTurn = true;
                    col_0_row_1.setTranslationY(-2000);
                    col_0_row_1.setAlpha(1.0f);
                    col_0_row_1.setImageResource(R.drawable.red);
                    col_0_row_1.animate().translationYBy(2000).setDuration(1000);
                    col_0_row_1.setTag("red");
                    checkGameState();
                }
            }

            if (view.getId()==(R.id.col_1_row_1)) {
                col_1_row_1 = findViewById(R.id.col_1_row_1);
                if(col_1_row_1.getTag()!="empty") {
                    Toast.makeText(this, "Choose other field!", Toast.LENGTH_SHORT).show();
                } else {
                    isYellowTurn = true;
                    col_1_row_1.setTranslationY(-2000);
                    col_1_row_1.setAlpha(1.0f);
                    col_1_row_1.setImageResource(R.drawable.red);
                    col_1_row_1.animate().translationYBy(2000).setDuration(1000);
                    col_1_row_1.setTag("red");
                    checkGameState();
                }
            }

            if (view.getId()==(R.id.col_2_row_1)) {
                col_2_row_1 = findViewById(R.id.col_2_row_1);
                if(col_2_row_1.getTag()!="empty") {
                    Toast.makeText(this, "Choose other field!", Toast.LENGTH_SHORT).show();
                } else {
                    isYellowTurn = true;
                    col_2_row_1.setTranslationY(-2000);
                    col_2_row_1.setAlpha(1.0f);
                    col_2_row_1.setImageResource(R.drawable.red);
                    col_2_row_1.animate().translationYBy(2000).setDuration(1000);
                    col_2_row_1.setTag("red");
                    checkGameState();
                }
            }

            if (view.getId()==(R.id.col_0_row_2)) {
                col_0_row_2 = findViewById(R.id.col_0_row_2);
                if(col_0_row_2.getTag()!="empty") {
                    Toast.makeText(this, "Choose other field!", Toast.LENGTH_SHORT).show();
                } else {
                    isYellowTurn = true;
                    col_0_row_2.setTranslationY(-2000);
                    col_0_row_2.setAlpha(1.0f);
                    col_0_row_2.setImageResource(R.drawable.red);
                    col_0_row_2.animate().translationYBy(2000).setDuration(1000);
                    col_0_row_2.setTag("red");
                    checkGameState();
                }
            }

            if (view.getId()==(R.id.col_1_row_2)) {
                col_1_row_2 = findViewById(R.id.col_1_row_2);
                if(col_1_row_2.getTag()!="empty") {
                    Toast.makeText(this, "Choose other field!", Toast.LENGTH_SHORT).show();
                } else {
                    isYellowTurn = true;
                    col_1_row_2.setTranslationY(-2000);
                    col_1_row_2.setAlpha(1.0f);
                    col_1_row_2.setImageResource(R.drawable.red);
                    col_1_row_2.animate().translationYBy(2000).setDuration(1000);
                    col_1_row_2.setTag("red");
                    checkGameState();
                }
            }

            if (view.getId()==(R.id.col_2_row_2)) {
                col_2_row_2 = findViewById(R.id.col_2_row_2);
                if(col_2_row_2.getTag()!="empty") {
                    Toast.makeText(this, "Choose other field!", Toast.LENGTH_SHORT).show();
                } else {
                    isYellowTurn = true;
                    col_2_row_2.setTranslationY(-2000);
                    col_2_row_2.setAlpha(1.0f);
                    col_2_row_2.setImageResource(R.drawable.red);
                    col_2_row_2.animate().translationYBy(2000).setDuration(1000);
                    col_2_row_2.setTag("red");
                    checkGameState();
                }
            }
        }
    }

    public boolean chartIsFilled(){
        return (col_0_row_0.getTag() != "empty") && (col_1_row_0.getTag() != "empty") && (col_2_row_0.getTag() != "empty") &&
                (col_0_row_1.getTag() != "empty") && (col_1_row_1.getTag() != "empty") && (col_2_row_1.getTag() != "empty") &&
                (col_0_row_2.getTag() != "empty") && (col_1_row_2.getTag() != "empty") && (col_2_row_2.getTag() != "empty");
    }

    public boolean yellowHasWon(){
       return ((col_0_row_0.getTag()=="yellow") && (col_1_row_0.getTag()=="yellow") && (col_2_row_0.getTag()=="yellow")) ||
                ((col_0_row_1.getTag()=="yellow") && (col_1_row_1.getTag()=="yellow") && (col_2_row_1.getTag()=="yellow")) ||
                ((col_0_row_2.getTag()=="yellow") && (col_1_row_2.getTag()=="yellow") && (col_2_row_2.getTag()=="yellow")) ||
                ((col_0_row_0.getTag()=="yellow") && (col_0_row_1.getTag()=="yellow") && (col_0_row_2.getTag()=="yellow")) ||
                ((col_1_row_0.getTag()=="yellow") && (col_1_row_1.getTag()=="yellow") && (col_1_row_2.getTag()=="yellow")) ||
                ((col_2_row_0.getTag()=="yellow") && (col_2_row_1.getTag()=="yellow") && (col_2_row_2.getTag()=="yellow")) ||
                ((col_0_row_0.getTag()=="yellow") && (col_1_row_1.getTag()=="yellow") && (col_2_row_2.getTag()=="yellow")) ||
                ((col_2_row_0.getTag()=="yellow") && (col_1_row_1.getTag()=="yellow") && (col_0_row_2.getTag()=="yellow"));
    }

    public boolean redHasWon(){
       return ((col_0_row_0.getTag()=="red") && (col_1_row_0.getTag()=="red") && (col_2_row_0.getTag()=="red")) ||
                ((col_0_row_1.getTag()=="red") && (col_1_row_1.getTag()=="red") && (col_2_row_1.getTag()=="red")) ||
                ((col_0_row_2.getTag()=="red") && (col_1_row_2.getTag()=="red") && (col_2_row_2.getTag()=="red")) ||
                ((col_0_row_0.getTag()=="red") && (col_0_row_1.getTag()=="red") && (col_0_row_2.getTag()=="red")) ||
                ((col_1_row_0.getTag()=="red") && (col_1_row_1.getTag()=="red") && (col_1_row_2.getTag()=="red")) ||
                ((col_2_row_0.getTag()=="red") && (col_2_row_1.getTag()=="red") && (col_2_row_2.getTag()=="red")) ||
                ((col_0_row_0.getTag()=="red") && (col_1_row_1.getTag()=="red") && (col_2_row_2.getTag()=="red")) ||
                ((col_2_row_0.getTag()=="red") && (col_1_row_1.getTag()=="red") && (col_0_row_2.getTag()=="red"));
    }

    public void setClicking(boolean x){
        col_0_row_0.setClickable(x);
        col_1_row_0.setClickable(x);
        col_2_row_0.setClickable(x);
        col_0_row_1.setClickable(x);
        col_1_row_1.setClickable(x);
        col_2_row_1.setClickable(x);
        col_0_row_2.setClickable(x);
        col_1_row_2.setClickable(x);
        col_2_row_2.setClickable(x);
    }

    public void resetPoints(View view){
        redPoints = 0;
        yellowPoints = 0;
        displayPoints();
    }

    @SuppressLint("SetTextI18n")
    public void displayPoints(){
        yellowPointsTextView = findViewById(R.id.yellowPointsTextView);
        redPointsTextView = findViewById(R.id.redPointsTextView);
        yellowPointsTextView.setText("Yellow: "+yellowPoints);
        redPointsTextView.setText("Red: "+redPoints);
    }

    public void checkGameState(){
        if(yellowHasWon())
        {
            yellowPoints++;
            setClicking(false);
            Toast.makeText(this, "YELLOW WON!", Toast.LENGTH_SHORT).show();
        } else
        if(redHasWon())
        {
            redPoints++;
            setClicking(false);

            Toast.makeText(this, "RED WON!", Toast.LENGTH_SHORT).show();
        } else
        if (chartIsFilled()) {
            setClicking(false);
            Toast.makeText(this, "DRAW!", Toast.LENGTH_SHORT).show();
        }
        displayPoints();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resetGame(getCurrentFocus());
        resetPoints(getCurrentFocus());
    }
}
