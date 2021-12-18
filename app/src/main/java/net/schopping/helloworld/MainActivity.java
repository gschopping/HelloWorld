package net.schopping.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: complete file
    }

    public void onClickbtnRegister(View view) {
        EditText edFirstName = findViewById(R.id.edFirstName);
        EditText edLastName = findViewById(R.id.edLastName);
        EditText edEmail = findViewById(R.id.edEmail);
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);
        txtFirstName.setText("Voornaam: " + edFirstName.getText().toString());
        txtLastName.setText("Achternaam: " + edLastName.getText().toString());
        txtEmail.setText("E-mail: " + edEmail.getText().toString());

    }

}