package com.example.smartcarbon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

//Main page demonstrating the users current statistics
public class HomeActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //Button to open up the categories icon
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCategories();
            }

        });

    }

    //Implement the fade-in/fade-out functionality to make it appear like it's the same page
    public void openCategories(){
            Intent welcome = new Intent(HomeActivity.this, Categories.class);
            startActivity(welcome);
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            finish();
    }
}
