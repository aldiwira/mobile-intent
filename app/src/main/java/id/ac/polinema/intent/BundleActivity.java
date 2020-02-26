package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class BundleActivity extends AppCompatActivity {

    public static final String USERNAME_KEY = "username";
    public static final String NAME_KEY = "name";
    public static final String AGE_KEY = "age";
    private EditText usernameInput;
    private EditText nameInput;
    private EditText ageInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);
        usernameInput = findViewById(R.id.input_username);
        nameInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);
    }

    public void handleSubmitBundle(View view) {

        String username = usernameInput.getText().toString();
        String name = nameInput.getText().toString();
        int age = Integer.parseInt(ageInput.getText().toString());
        Intent inten = new Intent(this, ProfileBundleActivity.class);
        inten.putExtra(USERNAME_KEY, username);
        inten.putExtra(NAME_KEY, name);
        inten.putExtra(AGE_KEY, age);
        startActivity(inten);
    }
}
