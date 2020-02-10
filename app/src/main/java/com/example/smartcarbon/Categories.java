package com.example.smartcarbon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

//A seperate page demonstrating an array of options from the addition icon
public class Categories extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        //Button that leads to the energy consumption page
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnergy();
            }
        });
    }

    //On click, go to the energy page
    public void openEnergy(){
        Intent intent = new Intent(this, Energy.class);
        startActivity(intent);
    }
}
