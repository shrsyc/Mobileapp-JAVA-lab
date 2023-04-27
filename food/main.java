package com.example.gan6;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
 CheckBox cb1,cb2,cb3,cb4;
 Button b1,b2;
 TextView t1;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 b1=(Button) findViewById(R.id.button);
 b2=(Button) findViewById(R.id.button2);
 cb1=(CheckBox) findViewById(R.id.checkBox);
 cb2=(CheckBox) findViewById(R.id.checkBox2);
 cb3=(CheckBox) findViewById(R.id.checkBox3);
 cb4=(CheckBox) findViewById(R.id.checkBox4);
 t1=(TextView) findViewById(R.id.textView);
 b1.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 int total = 0;
 if (cb1.isChecked())
 total = total + 120;
 if (cb2.isChecked())
 total = total + 200;
 if (cb3.isChecked())
 total = total + 150;
 if (cb4.isChecked())
 total = total + 300;
 t1.setText("Total : " + String.valueOf(total));
 }
});
 b2.setOnClickListener(new View.OnClickListener() {
 @Override
public void onClick(View view) {
 AlertDialog.Builder alert = new 
AlertDialog.Builder(MainActivity.this);
 alert.setCancelable(true);
 alert.setTitle("Alert Message");
 alert.setMessage("Payment to be done");
 alert.setPositiveButton("OK", new 
DialogInterface.OnClickListener() {
 @Override
 public void onClick(DialogInterface 
dialogInterface, int i) {
 Toast.makeText(getApplicationContext(), 
"Continue Payment", Toast.LENGTH_LONG).show();
 }
 });
 alert.setNegativeButton("Cancle", new 
DialogInterface.OnClickListener() {
 @Override
public void onClick(DialogInterface 
dialogInterface, int i) {
 dialogInterface.cancel();
 Toast.makeText(getApplicationContext(), 
"Continue Payment", Toast.LENGTH_LONG).show();
 }
 });
alert.show();
 }
 });
 }
}
