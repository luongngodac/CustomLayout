package vn.edu.ntu.ngodacluong.customlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    RecyclerView recyclerView;
    List<Model> list;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();
        recyclerView = findViewById(R.id.rvList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        list.add(new Model("Thu Cúc", "14/02/1990", "0976324865"));
        list.add(new Model("Thu Thảo", "14/02/1990", "0976324865"));
        list.add(new Model("Thu Đủ", "14/02/1990", "0976324865"));
        list.add(new Model("Thu Tiền", "14/02/1990", "0976324865"));
        list.add(new Model("Nguyễn Y Vân", "14/02/1990", "0976324865"));
        list.add(new Model("Vẫn Y Nguyên", "14/02/1990", "0976324865"));
        list.add(new Model("Vũ Như Cẩn", "14/02/1990", "0976324865"));
        list.add(new Model("Vẫn Như Cũ", "14/02/1990", "0976324865"));
        list.add(new Model("Tôi Thật Hoàng", "14/02/1990", "0976324865"));
        list.add(new Model("Tiền Vô Hạn", "14/02/1990", "0976324865"));
        list.add(new Model("Toán Vô Nghiệm", "14/02/1990", "0976324865"));

        adapter = new Adapter(list, getApplicationContext());
        recyclerView.setAdapter(adapter);
    }
}
