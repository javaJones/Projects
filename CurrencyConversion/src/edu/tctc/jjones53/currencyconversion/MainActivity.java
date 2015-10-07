//Name: Jamison Jones
//Date: 17Feb2015
//Proj: Currency Conversion
//Desc: This app has three uses. It converts
//      dollars to Euros. It converts dollars to
//      Mexican pesos, and also US dollars
//      to Canadian dollars.

package edu.tctc.jjones53.currencyconversion;
	
import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	// declare variables
	double conversionRateEuros = 0.779840;
	double conversionRatePesos = 13.2661;
	double conversionRateCanadian = 1.10106;
	double dEntered;
	double convertedD;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// initialize each instance
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText USD = (EditText) findViewById(R.id.txtUSD);
		final RadioButton euros = (RadioButton) findViewById(R.id.radEuros);
		final RadioButton pesos = (RadioButton) findViewById(R.id.radPesos);
		final RadioButton canadian = (RadioButton) findViewById(R.id.radCanadian);
		final TextView result = (TextView) findViewById(R.id.txtResult);
		Button convert = (Button) findViewById(R.id.btnConvert);
		
		convert.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				dEntered=Double.parseDouble(USD.getText().toString());
				DecimalFormat tenth = new DecimalFormat("#########.##");

				// euros radio button checked
				if(euros.isChecked()){
					if(dEntered <=100000){
						// logic
						convertedD = dEntered * conversionRateEuros;
						result.setText(tenth.format(convertedD) + " Euros");
					}else {
						Toast.makeText(MainActivity.this, "Dollars must be lest than 100,000", Toast.LENGTH_LONG).show();
					}
				}
				// pesos radio button checked
				if(pesos.isChecked()){
					if(dEntered <=100000){
						// logic
						convertedD = dEntered * conversionRatePesos;
						result.setText(tenth.format(convertedD) + " Pesos");
					}else {
						Toast.makeText(MainActivity.this, "Dollars must be lest than 100,000", Toast.LENGTH_LONG).show();
					}
				}
				// canadian radio button checked
				if(canadian.isChecked()){
					if(dEntered <=100000){
						// logic
						convertedD = dEntered * conversionRateCanadian;
						result.setText(tenth.format(convertedD) + " Canadian Dollars");
					}else {
						Toast.makeText(MainActivity.this, "Dollars must be less than 100,000", Toast.LENGTH_LONG).show();
					}
				}
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
}
