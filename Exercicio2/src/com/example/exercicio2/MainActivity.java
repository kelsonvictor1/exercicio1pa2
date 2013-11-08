package com.example.exercicio2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Button bt1 = (Button) findViewById(R.id.bt1);
		
		bt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				String texto = "Hello!";
				
				Toast toast = Toast.makeText(MainActivity.this, texto, Toast.LENGTH_SHORT);
				toast.show();

			} 
			
		});	
		
		final Button bt2 = (Button) findViewById(R.id.bt2);
		
		bt2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				String msgToast = "GoodBye!";
				
				Toast toast = Toast.makeText(MainActivity.this, msgToast, Toast.LENGTH_SHORT);
				toast.show();

			} 
			
		});

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
