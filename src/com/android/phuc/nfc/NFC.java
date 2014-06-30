package com.android.phuc.nfc;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class NFC extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //Set listen for all button
        
        View continueButton = findViewById(R.id.continue_button);
        continueButton.setOnClickListener(this);
        View newButton = findViewById(R.id.new_button);
        newButton.setOnClickListener(this);
        View aboutButton = findViewById(R.id.about_button);
        aboutButton.setOnClickListener(this);
        View exitButton = findViewById(R.id.exit_button);
        exitButton.setOnClickListener(this);
     }

    public void onClick(View v){
    	switch (v.getId()){
    	case R.id.about_button:
 //   		Toast.makeText(getApplicationContext(), "ROTATED", Toast.LENGTH_LONG).show();
    		Intent i = new Intent(this, About.class);
    		startActivity(i);
    		break;
    	case R.id.new_button:
    		startActivity(new Intent(this, ActivityManagement.class));
    	break;
    	case R.id.continue_button:
    		startActivity(new Intent(this, WriteText.class));
		break;
    	case R.id.exit_button:
//    		Toast.makeText(getApplicationContext(), "ZOOM IN", Toast.LENGTH_LONG).show();
    	break;
			}
    	}
}