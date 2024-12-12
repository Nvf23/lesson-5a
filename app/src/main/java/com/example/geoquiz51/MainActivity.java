package com.example.geoquiz51;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonDialog = findViewById(R.id.button_dialog);
        textViewMessage = findViewById(R.id.text_view_message);

        buttonDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });
    }

    private void showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Hello");
        builder.setMessage("Mensaje de alerta");
        builder.setIcon(android.R.drawable.ic_dialog_alert);

        builder.setPositiveButton("OK", (dialog, which) -> {
            textViewMessage.setText("Has Pulsado ok";
        });

        builder.setNegativeButton("CANCEL", (dialog, which) -> {
            dialog.dismiss();
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}