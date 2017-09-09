package com.algonquincollege.hurdleg.activitylifecyle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

/**
 *  Display this Activity's current lifecyle state.
 *
 *  @author Gerald.Hurdle@AlgonquinCollege.com
 */
public class MainActivity extends AppCompatActivity {
    // CLASS VARIABLES
    // Tag to identify this app in LogCat
    private final static String TAG = "Activity Lifecyle";

    // INSTANCE VARIABLES
    // TextView to display the lifecyle
    private TextView activityLifecyle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // reference the TextView that displays the current state of the lifecyle
        activityLifecyle = (TextView) findViewById( R.id.activityLifecyle );

        // Display the current lifecyle state to the user
        if (activityLifecyle.getText().length() == 0) {
            activityLifecyle.setText( "onCreate()" );
        } else {
            activityLifecyle.setText( activityLifecyle.getText() + "\nonCreate() [again]" );
        }

        // Display LogCat message
        Log.i( TAG, "onCreate()" );

        // Toast is a light-weight notification to the user.
        Toast.makeText( getApplicationContext(), "onCreate()", Toast.LENGTH_SHORT ).show();
    }

    // Remaining lifecycle method overrides (in alphabetical order)

    @Override
    public void onDestroy() {
        super.onDestroy();

        activityLifecyle.setText( activityLifecyle.getText() + "\nonDestroy()" );
        Log.i( TAG, "onDestroy()" );
        Toast.makeText( getApplicationContext(), "onDestroy()", Toast.LENGTH_SHORT ).show();
    }

    @Override
    public void onPause() {
        super.onPause();

        activityLifecyle.setText( activityLifecyle.getText() + "\nonPause()" );
        Log.i( TAG, "onPause()" );
        Toast.makeText( getApplicationContext(), "onPause()", Toast.LENGTH_SHORT ).show();
    }

    @Override
    public void onRestart() {
        super.onRestart();

        activityLifecyle.setText( activityLifecyle.getText() + "\nonRestart()" );
        Log.i( TAG, "onRestart()" );
        Toast.makeText( getApplicationContext(), "onRestart()", Toast.LENGTH_SHORT ).show();
    }

    @Override
    public void onResume() {
        super.onResume();

        activityLifecyle.setText( activityLifecyle.getText() + "\nonResume()" );
        Log.i( TAG, "onResume()" );
        Toast.makeText( getApplicationContext(), "onResume()", Toast.LENGTH_SHORT ).show();
    }

    @Override
    public void onStart() {
        super.onStart();

        activityLifecyle.setText( activityLifecyle.getText() + "\nonStart()" );
        Log.i( TAG, "onStart()" );
        Toast.makeText( getApplicationContext(), "onStart()", Toast.LENGTH_SHORT ).show();
    }

    @Override
    public void onStop() {
        super.onStop();

        activityLifecyle.setText( activityLifecyle.getText() + "\nonStop()" );
        Log.i( TAG, "onStop()" );
        Toast.makeText( getApplicationContext(), "onStop()", Toast.LENGTH_SHORT ).show();
    }
}
