package xyz.thanhhaidev.addstudentoop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btnAddStudent;
    EditText edID, edName;
    TextView txtResult;
    List<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvents();
    }

    private void addEvents() {
        studentList = new ArrayList<Student>();
        btnAddStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = Integer.parseInt(edID.getText().toString());
                String name = edName.getText().toString();

                studentList.add(new Student(id, name));
                String result = "Số lượng sv: " + Student.getCount() + "\n";
                for (int i = 0; i < studentList.size(); i++) {
                    result += studentList.get(i).getInfo() + "\n";
                }
                txtResult.setText(result);
                edID.setText("");
                edName.setText("");
            }
        });
    }

    private void addControls() {
        btnAddStudent = findViewById(R.id.btnAddStudent);
        edID = findViewById(R.id.edID);
        edName = findViewById(R.id.edName);
        txtResult = findViewById(R.id.txtResult);
    }
}
