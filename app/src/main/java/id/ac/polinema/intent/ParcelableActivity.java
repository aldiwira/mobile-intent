package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ParcelableActivity extends AppCompatActivity {
    public static final String DATA_KEY = "data";
    private EditText usernameInput;
    private EditText nameInput;
    private EditText ageInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);
        usernameInput = findViewById(R.id.input_username);
        nameInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);
    }

    public void handleSubmitParcelable(View view) {
        String username = usernameInput.getText().toString();
        String name = nameInput.getText().toString();
        int age = Integer.parseInt(ageInput.getText().toString());
        Intent inten = new Intent(this, ProfileParcelableActivity.class);
        User user = new User(username, name, age);
        inten.putExtra(DATA_KEY, user);
        startActivity(inten);
    }
}
