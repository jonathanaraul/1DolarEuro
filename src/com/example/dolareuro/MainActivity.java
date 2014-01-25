package com.example.dolareuro;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	EditText etEuros;
	EditText etDolares;
	EditText etBolivares;
	Button btCalcular;
	TextView etResultado;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        etEuros = (EditText) findViewById(R.id.etEuros);
        etDolares = (EditText) findViewById(R.id.etDolares);
        etBolivares = (EditText) findViewById(R.id.etBolivares);
        btCalcular = (Button) findViewById(R.id.btCalcular);
        etResultado = (TextView) findViewById(R.id.etResultado);
        
        btCalcular.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.btCalcular:
			double euros = Double.parseDouble(etEuros.getText().toString());
			double dolares = Double.parseDouble(etDolares.getText().toString());
			double tasaCambioBsDolar = Double.parseDouble(etBolivares.getText().toString());
			double tasaCambioEuroDolar = dolares/ euros;
			double bolivares = dolares * tasaCambioBsDolar;
			etResultado.setText("La tasa de cambio fue: "+tasaCambioEuroDolar+" y la cantidad de Bolívares es= "+bolivares);
			etResultado.setTextSize(20);
	        etResultado.setTextColor(Color.RED);
	        
			break;
		
		}
		
	}
    
}
