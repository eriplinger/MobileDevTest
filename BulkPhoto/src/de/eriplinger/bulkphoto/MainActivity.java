package de.eriplinger.bulkphoto;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

	@Override
	public View findViewById(int id)
	{
		// TODO: Implement this method
		return super.findViewById(id);
	}
	
	Button capture = (Button) findViewById(R.id.bulkphotoguiButton1);
	capture.setOnClickListener(new OnClickListener(){
		public void onClick(View p1){
			finish();
		}
	});
}
