package net.wtfitio.appactivity;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
    RelativeLayout layout;
    Button but;
    EditText number1;
    EditText number2;
    TextView text;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sta_activity);

         but= (Button)findViewById(R.id.color_button);
         layout = (RelativeLayout)findViewById(R.id.r_layout);
         number1=(EditText)findViewById(R.id.edit_number1);
         number2 = (EditText)findViewById(R.id.edit_number2);
         text= (TextView)findViewById(R.id.number_view);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cald();
            }


        });
       /* if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }*/
    }

    private void cald() {
        String num1 = number1.getText().toString();
        String num2 = number2.getText().toString();
        if ((num1!=null)||(num2!=null)||(num1.length()>0)||(num2.length()>0)){

            float n1 =Float.parseFloat(num1);
            float n2 = Float.parseFloat(num2);

            float sum = n1+n2;

            text.setText(String.valueOf(sum));
        }
        else{
            Toast.makeText(getApplicationContext(),"Empty",Toast.LENGTH_SHORT);
        }
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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

    protected void onPause(){
        super.onPause();
    }

}
