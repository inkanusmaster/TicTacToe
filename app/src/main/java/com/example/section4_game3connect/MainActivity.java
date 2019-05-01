package com.example.section4_game3connect;

import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ImageView col_0_row_0;
    ImageView col_1_row_0;
    ImageView col_2_row_0;
    ImageView col_0_row_1;
    ImageView col_1_row_1;
    ImageView col_2_row_1;
    ImageView col_0_row_2;
    ImageView col_1_row_2;
    ImageView col_2_row_2;
    boolean isYellowTurn = true;

    protected void resetGame(){
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
                    col_2_row_0.setImageResource(R.drawable.red);
                    col_2_row_0.animate().translationYBy(2000).setDuration(1000);
                    col_2_row_0.setTag("yellow");
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
                }
            }
        }
    }

    public void checkGameState(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resetGame();
    }
}
