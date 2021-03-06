package io.dragonsbane.neurocog.tests;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import io.dragonsbane.data.ImpairmentTest;
import io.dragonsbane.neurocog.DBApplication;
import io.dragonsbane.neurocog.R;

public class TestReportActivity extends AppCompatActivity {

    private List<ImpairmentTest> tests;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tests = ((DBApplication) getApplicationContext()).getTests();
        setContentView(R.layout.activity_test_report);

        Toolbar toolbar = findViewById(R.id.action_bar);
        TextView titleTextView = (TextView) toolbar.getChildAt(0);
        titleTextView.setTextColor(getResources().getColor(R.color.dragonsbaneBlack));
        titleTextView.setTypeface(((DBApplication)getApplication()).getNexaBold());
    }

//    public void sendResults(View view) {
//        Log.i(MainActivity.class.getName(),"Sending results...");
//        DID to;
//        DID from = ((DBApplication)getApplication()).getDid();
//        String subject = "Neurocog Test Results.";
//        String message;
//        Email email = new Email(to, from, subject, message);
//        EmailAPI.sendEmail(this, email);
//    }

    public void endTest(View view) {
        Intent intent = new Intent(this, TestHistoryActivity.class);
        startActivity(intent);
    }
}
