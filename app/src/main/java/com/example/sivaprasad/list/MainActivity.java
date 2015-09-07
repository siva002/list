package com.example.sivaprasad.list;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] contacts = new String[] {"Name 1 name asdf asdf dsf sdf asdf sdf sdf sd fsad f sdaf sdf sdfa sda sda sdaf sdaf ds dsf dsf sfd dfs fsd dfs dsf fsd fsd fsd sfda dfs dfsa fsda fds","Name 2", "Name 3","Name 4",
                "Name 5", "Name 6", "Name 7", "Name 8",
                "Name 9", "Name 10", "Name 11" , "Name 12"};

        String[][] cars = {
                {"This is a Premium Car. Price : $40,000", "premium"},
                {"This is a Standard Car. Price : $20,000", "standard"},
                {"This is another Standard Car. Price : $10,000", "standard"}
        };

        ContactAdapter contactAdapter = new ContactAdapter(this, cars);

        ListView listView = (ListView) findViewById(R.id.listView1);
        listView.setAdapter(contactAdapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                        TextView textView = (TextView)view.findViewById(R.id.textView2);
                        String contact = textView.getText().toString();
                        Toast.makeText(MainActivity.this,contact,Toast.LENGTH_SHORT).show();

                    }
                }

        );
    }



}
