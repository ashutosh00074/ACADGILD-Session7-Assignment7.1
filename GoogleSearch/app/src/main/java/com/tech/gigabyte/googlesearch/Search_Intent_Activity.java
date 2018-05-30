package com.tech.gigabyte.googlesearch;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Search_Intent_Activity extends AppCompatActivity {

    private EditText editTextInput;

    /**
     * Called when the activity is first created.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search__intent_);

        editTextInput = (EditText) findViewById(R.id.search_bar);
    }

    public void onSearchClick(View v) {
        try {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);  //Activity Action: Perform a web search
            String term = editTextInput.getText().toString();
            intent.putExtra(SearchManager.QUERY, term);
            startActivity(intent);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
