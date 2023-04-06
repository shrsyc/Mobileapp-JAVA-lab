public class MainActivity extends AppCompatActivity {
    EditText email,pass;
    TextView st;
    Button b1;
    String pattern = "[a-zA-Z]+[a-zA-Z0-9_.$#*n--;&]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText) findViewById(R.id.editTextTextEmailAddress);
        pass = (EditText) findViewById(R.id.editTextTextPassword);
        st = (TextView) findViewById(R.id.textView3);
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
