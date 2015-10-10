package com.example.prabhjot.genx;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import static android.support.v4.app.ActivityCompat.startActivity;

/**
 * Created by prabhjot on 9/10/15.
 */
public class prabh_activity extends start {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prabh_activity);

        prabh_pB = (ImageButton) findViewById(R.id.prabh_phoneButton);
        prabh_mB = (ImageButton) findViewById(R.id.prabh_whatsapp_imageButton);

        prabh_pB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callprabhjot();
            }
        });
        prabh_mB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whatsapp_prabhjot();
            }
        });

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment()).commit();
        }
    }

    private void whatsapp_prabhjot() {
        Toast.makeText(this,"Whatsapping..",Toast.LENGTH_SHORT).show();
        Intent wa = new Intent(Intent.ACTION_CHOOSER);
    }

    protected void callprabhjot() {
        Toast.makeText(this, "Calling Prabhjot", Toast.LENGTH_SHORT).show();
        Intent phoneintent = new Intent(Intent.ACTION_DIAL);
        phoneintent.setData(Uri.parse("+919805830800"));
        try {
            startActivity(phoneintent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "Activity not found");
        }
    }

}
