package com.example.exerciciopa2;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	
	//Button b1 = (Button) findViewById(R.id.clickme);
	
	//Button b2 = (Button) findViewById(R.id.pushme);
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button bt1 = (Button) findViewById(R.id.clickme);
       
        
        bt1.setOnClickListener(new OnClickListener() {
			
        	int contador = 0;
        	
			@Override
			public void onClick(View v) {
				
				TextView txt = (TextView) findViewById(R.id.clickme);
				
				txt.setTextColor(retornaCor());
				
				contador++;
				
				TextView text = (TextView) findViewById(R.id.textContador);
				text.setText(String.valueOf(contador));
		
				
			}
		});
        
        
        Button bt2 = (Button) findViewById(R.id.pushme);
        
        bt2.setOnClickListener(new OnClickListener() {
			
        	int contador = 0;
        	
			@Override
			public void onClick(View v) {
				
				TextView txt = (TextView) findViewById(R.id.pushme);
				
				txt.setTextColor(retornaCor());
				
				contador++;
				
				TextView text = (TextView) findViewById(R.id.textContador2);
				text.setText(String.valueOf(contador));
		
				
			}
		});
        
        
        
        
        
        
        
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
	
	public int retornaCor() {  
		   ArrayList<Integer> lista = new ArrayList<Integer>();  
		   
		   lista.add(Color.BLUE);  
		   lista.add(Color.RED);  
		   lista.add(Color.GREEN);
		   lista.add(Color.GRAY);
		   lista.add(Color.CYAN); 
		     
		   return lista.get((int) (Math.random() * lista.size()));  
		  
		}  
    
}
