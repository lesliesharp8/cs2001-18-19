package group8.level2.learnado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class LoginActivity extends AppCompatActivity {


    private EditText Name;
    private EditText Password;
    private Button Login;
    private int counter = 5;
    private TextView Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Name =(EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Login=(Button)findViewById(R.id.btnLogIn);
        Register= (TextView)findViewById(R.id.tvRegister);



        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignUp.class);
                startActivity(intent);// This is to enable the user to access the register page if they have no login.
            }
        });

    }



    private void validate(String userName, String userPassword){

        if(userName.equals("Admin") && userPassword.equals("1234")){
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent); // This starts another activity which enables them to go to another page.
        }else{

            counter --;

            if(counter == 0){
                Login.setEnabled(false); //if statement regarding the login button

            }


        }
    }




}
