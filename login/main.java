package com.example.loginpage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText email,pass;
    TextView st;
    Button b1;
    String pattern = "[a-zA-Z]+[a-zA-Z0-9_.$#*n--;&]+";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.usernameinput);
        pass = (EditText) findViewById(R.id.passwordinput);
        st = (TextView) findViewById(R.id.password);
        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String em = String.valueOf(email.getText());
                String pw = String.valueOf(pass.getText());
                if (isEmailValid(em) & pw.matches(pattern))
                    st.setText("Login Successful");
                else if (!isEmailValid(em))
                    st.setText("Email In-Correct");
                else if(!(pw.matches(pattern)))
                    st.setText("Password InCorrect");


            }

            private boolean isEmailValid(String email) {
                return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
            }
        });
    }
}
