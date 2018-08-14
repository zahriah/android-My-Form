package my.edu.utem.myform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    TextView nameTextView, emailTextView, phoneTextView, cellTextView, messageTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nameTextView=findViewById(R.id.second_nameTextView);
        emailTextView=findViewById(R.id.second_emailTextView);
        phoneTextView = findViewById(R.id.second_phoneTextView);
        cellTextView = findViewById(R.id.second_cellTextView);
        messageTextView = findViewById(R.id.second_messageTextView);

        Intent intent = getIntent();
        String nameValue = intent.getStringExtra("name");
        nameTextView.setText(nameValue);
        emailTextView.setText(intent.getStringExtra("email"));
        phoneTextView.setText(intent.getStringExtra("phone"));
        cellTextView.setText(intent.getStringExtra("cell"));
        messageTextView.setText(intent.getStringExtra("message"));

    }
}
