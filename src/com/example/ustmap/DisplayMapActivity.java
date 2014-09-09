package com.example.ustmap;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMapActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		
		TextView textView = new TextView(this);
	    textView.setTextSize(40);
	    textView.setText(message);
	    
	    setContentView(textView);
		
	   
		setContentView(R.layout.maps);{
			
		} 
		 getActionBar().setDisplayHomeAsUpEnabled(true);	
	}
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		
		
		
		 getActionBar().setDisplayHomeAsUpEnabled(true);
		    
		getMenuInflater().inflate(R.menu.display_map, menu);
		return true;
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		
		
		
		
	            
	            
	            
	            
	            
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	 @SuppressLint("NewApi") public static class PlaceholderFragment extends Fragment {

	        public PlaceholderFragment() { }

	        @Override
	        public View onCreateView(LayoutInflater inflater, ViewGroup container,
	                  Bundle savedInstanceState) {
	              View rootView = inflater.inflate(R.layout.activity_display_map,
	                      container, false);
	              return rootView;
	        }
	    }
}
