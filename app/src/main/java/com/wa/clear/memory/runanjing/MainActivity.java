package com.wa.clear.memory.runanjing;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.app.AlertDialog.*;

public class MainActivity extends Activity 
{

	private Button clear;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		clear = (Button)findViewById(R.id.clear);
		clear.setOnClickListener(new View.OnClickListener(){
				private ProgressDialog xh_pDialog;
				@Override
				public void onClick(View p1)
				{
					for (int i = 0; i <= 500; i++)
					{
						xh_pDialog = new ProgressDialog(MainActivity.this);  
						xh_pDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);  
						xh_pDialog.setTitle("内存泄漏");
						xh_pDialog.setMessage("内存泄漏");  
						xh_pDialog.setCancelable(true);  
						xh_pDialog.show();
					}
					xh_pDialog.dismiss();
					android.os.Process.killProcess(android.os.Process.myPid());
				}
			});
    }
}
