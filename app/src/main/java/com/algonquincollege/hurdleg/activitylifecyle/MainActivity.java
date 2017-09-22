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

    /**
     * Called when the activity is first created.
     * This is where you should do all of your normal static set up: create views,
     * bind data to lists, etc.
     * This method also provides you with a Bundle containing the activity's previously frozen state,
     * if there was one.
     * Always followed by onStart().
     */
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

    /**
     * The final call you receive before your activity is destroyed.
     * This can happen either because the activity is finishing (someone called finish() on it,
     * or because the system is temporarily destroying this instance of the activity to save space.
     * You can distinguish between these two scenarios with the isFinishing() method.
     */
    @Override
    public void onDestroy() {
        super.onDestroy();

        activityLifecyle.setText( activityLifecyle.getText() + "\nonDestroy()" );
        Log.i( TAG, "onDestroy()" );
        Toast.makeText( getApplicationContext(), "onDestroy()", Toast.LENGTH_SHORT ).show();
    }

    /**
     * Called when the system is about to start resuming a previous activity.
     * This is typically used to commit unsaved changes to persistent data, stop animations and
     * other things that may be consuming CPU, etc. Implementations of this method must be very
     * quick because the next activity will not be resumed until this method returns.
     *
     * Followed by either onResume() if the activity returns back to the front,
     * or onStop() if it becomes invisible to the user.
     */
    @Override
    public void onPause() {
        super.onPause();

        activityLifecyle.setText( activityLifecyle.getText() + "\nonPause()" );
        Log.i( TAG, "onPause()" );
        Toast.makeText( getApplicationContext(), "onPause()", Toast.LENGTH_SHORT ).show();
    }

    /**
     * Called after your activity has been stopped, prior to it being started again.
     * Always followed by onStart()
     */
    @Override
    public void onRestart() {
        super.onRestart();

        activityLifecyle.setText( activityLifecyle.getText() + "\nonRestart()" );
        Log.i( TAG, "onRestart()" );
        Toast.makeText( getApplicationContext(), "onRestart()", Toast.LENGTH_SHORT ).show();
    }

    /**
     * Called when the activity will start interacting with the user. At this point your activity
     * is at the top of the activity stack, with user input going to it.
     * Always followed by onPause().
     */
    @Override
    public void onResume() {
        super.onResume();

        activityLifecyle.setText( activityLifecyle.getText() + "\nonResume()" );
        Log.i( TAG, "onResume()" );
        Toast.makeText( getApplicationContext(), "onResume()", Toast.LENGTH_SHORT ).show();
    }

    /**
     * Called when the activity is becoming visible to the user.
     * Followed by onResume() if the activity comes to the foreground, or onStop() if it becomes hidden.
     */
    @Override
    public void onStart() {
        super.onStart();

        activityLifecyle.setText( activityLifecyle.getText() + "\nonStart()" );
        Log.i( TAG, "onStart()" );
        Toast.makeText( getApplicationContext(), "onStart()", Toast.LENGTH_SHORT ).show();
    }

    /**
     * Called when the activity is no longer visible to the user, because another activity has been
     * resumed and is covering this one. This may happen either because a new activity is being
     * started, an existing one is being brought in front of this one, or this one is being destroyed.
     * Followed by either onRestart() if this activity is coming back to interact with the user,
     * or onDestroy() if this activity is going away.
     */
    @Override
    public void onStop() {
        super.onStop();

        activityLifecyle.setText( activityLifecyle.getText() + "\nonStop()" );
        Log.i( TAG, "onStop()" );
        Toast.makeText( getApplicationContext(), "onStop()", Toast.LENGTH_SHORT ).show();
    }
}
