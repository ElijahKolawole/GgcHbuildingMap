package com.adefemikolawole.ggchbuildingmap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.btnFirstFloor);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFirstFloor();
            }
        });

        button2 = (Button) findViewById(R.id.btnSecondFloor);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondFloor();
            }
        });

        button3 = (Button) findViewById(R.id.btnThridFloor);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThirdFloor();
            }
        });

        button4 = (Button) findViewById(R.id.btncampusMap);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCampusMapPage();
            }
        });

        button5 = (Button) findViewById(R.id.btnAbout);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutPage();
            }
        });
    }
public void openFirstFloor(){
    Intent intent = new Intent(this, FirstFloor.class) ;
    startActivity(intent);
    }

    public void openSecondFloor(){
        Intent intent = new Intent(this, SecondFloor.class);
        startActivity(intent);
    }

    public void openThirdFloor(){
        Intent intent = new Intent (this, ThirdFloor.class);
        startActivity(intent);
        }


        public void openCampusMapPage(){
Intent intent = new Intent(this, CampusMap.class);
startActivity(intent);
    }

    public void openAboutPage(){
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }
    }

