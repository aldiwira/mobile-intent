package id.ac.polinema.intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileBundleActivity extends AppCompatActivity {

    public static final String USERNAME_KEY = "username";
    public static final String NAME_KEY = "name";
    public static final String AGE_KEY = "age";
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);

        // TODO: bind here
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            String username = extras.getString(BundleActivity.USERNAME_KEY);
            usernameText.setText(username);
            String name = extras.getString(BundleActivity.NAME_KEY);
            nameText.setText(name);
            String age = String.valueOf(extras.getInt(BundleActivity.AGE_KEY));
            ageText.setText(age);
        }
    }
}
