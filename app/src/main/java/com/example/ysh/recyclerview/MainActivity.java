package com.example.ysh.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    RecyclerViewAdapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        linearLayoutManager = new LinearLayoutManager(this);

        recyclerView.addItemDecoration(new DividerItemDecoration(this,linearLayoutManager.getOrientation()));
        recyclerView.setLayoutManager(linearLayoutManager);

        // ArrayList에 person 객체(이름과 번호) 넣기
        List<Person> person = new ArrayList<>();
        person.add(new Person("김덕배","010-1234-5678"));
        person.add(new Person("강구팔","010-5678-1234"));
        person.add(new Person("이배윤","010-3412-7856"));
        person.add(new Person("버기","123-1256-3478"));

        // Adapter생성
        recyclerViewAdapter = new RecyclerViewAdapter(this,person);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}
