package com.example.manddy;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    FirebaseAuth auth;
    EditText SignUpName, signUpUsername, signUpEmail, signupPassword;
    Button signupButton;
    TextView loginRedirectText;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();
        SignUpName = findViewById(R.id.signup_name);
        signUpUsername = findViewById(R.id.signup_username);
        signUpEmail = findViewById(R.id.signup_email);
        signupPassword = findViewById(R.id.signup_password);
        signupButton = findViewById(R.id.signup_button);
        loginRedirectText = findViewById(R.id.loginRedirectText);

        signupButton.setOnClickListener(view -> {
        database = FirebaseDatabase.getInstance();
        reference = database.getReference("Users");
        String user = signUpEmail.getText().toString();
        String pass = signupPassword.getText().toString();
        String name = SignUpName.getText().toString();
        String email = signUpEmail.getText().toString();

        if (user.isEmpty()) {
            signUpEmail.setError("Email cannot be empty");
        }
        if (pass.isEmpty()) {
            signupPassword.setError("Password cannot be empty");
        } else {
            auth.createUserWithEmailAndPassword(user, pass).addOnCompleteListener(task -> {
                if (task.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "SignUp Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                } else {
                    Toast.makeText(MainActivity.this, "SignUp Failed" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    });
   loginRedirectText.setOnClickListener(view -> {
       Intent intent = new Intent(MainActivity.this, LoginActivity.class);
       startActivity(intent);
   });
}}
