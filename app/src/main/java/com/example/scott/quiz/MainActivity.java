package com.example.scott.quiz;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.Shape;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    public void doSomething(View v){
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto","sengle64@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "My Takeout Order");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Cheeseburger and fries");
        startActivity(Intent.createChooser(emailIntent, "Send email..."));

/*
        String address = "sengle64@gmail.com";
        String subject = "Takeout Order";
        String body = "Cheeseburgers";

      //  Intent intent = new Intent(Intent.ACTION_SENDTO);
       // intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto", address, null));

        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body);
        if (emailIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(emailIntent);
        }

*/
    }
}


