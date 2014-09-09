package com.example.ustmap;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

	
	static final String EXTRA_MESSAGE = "com.example.USTmap.MESSAGE";

	public void USTmap(View view){
		Intent intent = new Intent(this, DisplayMapActivity.class);
		EditText editText = (EditText) findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		 startActivity(intent);
	}
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        
        setContentView(R.layout.activity_main);
       
        
        
        
        
       
        
        getActionBar().setDisplayHomeAsUpEnabled(true);
 
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	
    	
    	 MenuInflater inflater = getMenuInflater();
		    inflater.inflate(R.menu.main_activity_actions, menu);
		    return super.onCreateOptionsMenu(menu);
		    
			
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    
    	

		 switch (item.getItemId()) {
	        case R.id.action_search:
    		Toast.makeText(getBaseContext(),"Click on the search icon", Toast.LENGTH_LONG).show();
	            //openSearch();
	           return true;
	        case R.id.title_activity_display_map:
	        Toast.makeText(getBaseContext(),"Click on the title icon", Toast.LENGTH_LONG).show();
	     //       openSettings();
	      //      return true;
	     //   default:
		 
	          
	        	}
	            
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
      // int id = item.getItemId();
      // if (id == R.id.action_settings) {
      //     return true;
      // }
      // if (id == R.id.home)
       //{
       // 	return true;
        	
      // }
        return super.onOptionsItemSelected(item);
    }
}
