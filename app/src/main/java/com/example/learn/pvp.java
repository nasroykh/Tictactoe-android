package com.example.learn;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class pvp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_window);

    }

    public void btnClick(View view) {
        Button btnSelected =(Button) view;
        int cellID=0;
        switch (btnSelected.getId()){
            case R.id.btn1 :
                cellID=1;
                break;
            case R.id.btn2 :
                cellID=2;
                break;
            case R.id.btn3 :
                cellID=3;
                break;
            case R.id.btn4 :
                cellID=4;
                break;
            case R.id.btn5 :
                cellID=5;
                break;
            case R.id.btn6 :
                cellID=6;
                break;
            case R.id.btn7 :
                cellID=7;
                break;
            case R.id.btn8 :
                cellID=8;
                break;
            case R.id.btn9 :
                cellID=9;
                break;
        }
        playGame(cellID,btnSelected);
        checkWinner();
    }
    int activePlayer = 1;
    ArrayList<Integer> p1 = new ArrayList<Integer>();
    ArrayList<Integer> p2 = new ArrayList<Integer>();
    ArrayList<Integer> cellsPlayed = new ArrayList<Integer>();
    void playGame(int cellID, Button btnSelected) {
        if (activePlayer==1) {
            btnSelected.setText("X");
            btnSelected.setTextColor(Color.BLACK);
            btnSelected.setBackgroundColor(Color.parseColor("#8BC49F8D"));
            p1.add(cellID);
            cellsPlayed.add(cellID);
            activePlayer=2;
        }
        else if (activePlayer==2) {
            btnSelected.setText("O");
            btnSelected.setTextColor(Color.WHITE);
            btnSelected.setBackgroundColor(Color.parseColor("#8B150F40"));
            p2.add(cellID);
            cellsPlayed.add(cellID);
            activePlayer=1;
        }
        btnSelected.setEnabled(false);
    }
    void checkWinner(){
        if((p1.contains(1) && p1.contains(2) && p1.contains(3))
                || (p1.contains(1) && p1.contains(5) && p1.contains(9))
                || (p1.contains(3) && p1.contains(5) && p1.contains(7))
                || (p1.contains(1) && p1.contains(4) && p1.contains(7))
                || (p1.contains(2) && p1.contains(5) && p1.contains(8))
                || (p1.contains(3) && p1.contains(6) && p1.contains(9))
                || (p1.contains(4) && p1.contains(5) && p1.contains(6))
                || (p1.contains(7) && p1.contains(8) && p1.contains(9))) {
            Toast.makeText(getApplicationContext() , "Player 1 (X) is the winner" , Toast.LENGTH_LONG).show();
            Button btn1 = findViewById(R.id.btn1);
            btn1.setEnabled(false);
            Button btn2 = findViewById(R.id.btn2);
            btn2.setEnabled(false);
            Button btn3 = findViewById(R.id.btn3);
            btn3.setEnabled(false);
            Button btn4 = findViewById(R.id.btn4);
            btn4.setEnabled(false);
            Button btn5 = findViewById(R.id.btn5);
            btn5.setEnabled(false);
            Button btn6 = findViewById(R.id.btn6);
            btn6.setEnabled(false);
            Button btn7 = findViewById(R.id.btn7);
            btn7.setEnabled(false);
            Button btn8 = findViewById(R.id.btn8);
            btn8.setEnabled(false);
            Button btn9 = findViewById(R.id.btn9);
            btn9.setEnabled(false);
        }
        else if((p2.contains(1) && p2.contains(2) && p2.contains(3))
                || (p2.contains(1) && p2.contains(5) && p2.contains(9))
                || (p2.contains(3) && p2.contains(5) && p2.contains(7))
                || (p2.contains(1) && p2.contains(4) && p2.contains(7))
                || (p2.contains(2) && p2.contains(5) && p2.contains(8))
                || (p2.contains(3) && p2.contains(6) && p2.contains(9))
                || (p2.contains(4) && p2.contains(5) && p2.contains(6))
                || (p2.contains(7) && p2.contains(8) && p2.contains(9))) {
            Toast.makeText(getApplicationContext() , "Player 2 (O) is the winner" , Toast.LENGTH_LONG).show();
            Button btn1 = findViewById(R.id.btn1);
            btn1.setEnabled(false);
            Button btn2 = findViewById(R.id.btn2);
            btn2.setEnabled(false);
            Button btn3 = findViewById(R.id.btn3);
            btn3.setEnabled(false);
            Button btn4 = findViewById(R.id.btn4);
            btn4.setEnabled(false);
            Button btn5 = findViewById(R.id.btn5);
            btn5.setEnabled(false);
            Button btn6 = findViewById(R.id.btn6);
            btn6.setEnabled(false);
            Button btn7 = findViewById(R.id.btn7);
            btn7.setEnabled(false);
            Button btn8 = findViewById(R.id.btn8);
            btn8.setEnabled(false);
            Button btn9 = findViewById(R.id.btn9);
            btn9.setEnabled(false);
        }
        else if (cellsPlayed.size() == 9) {
            Toast.makeText(getApplicationContext() , "DRAW !" , Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.choice_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case (R.id.restart):
                p1.clear();
                p2.clear();
                recreate();
                Toast.makeText(getApplicationContext(), "NEW GAME !", Toast.LENGTH_SHORT).show();
                return true;


            case (R.id.returns):
                p1.clear();
                p2.clear();
                finish();
                Toast.makeText(getApplicationContext(), "RETURNED TO MAIN MENU", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
