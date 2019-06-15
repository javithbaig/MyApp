package grm.com.activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import grm.com.R;

public class Stock_Inward extends AppCompatActivity {
    String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Grape", "Kiwi", "Mango", "Pear"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stock__inward);

        //Creating the instance of ArrayAdapter containing list of fruit names
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.select_dialog_item, fruits);
        //Getting the instance of AutoCompleteTextView
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        actv.setThreshold(1);//will start working from first character
        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        actv.setTextColor(Color.RED);
    }


}
