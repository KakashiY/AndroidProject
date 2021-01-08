package com.kaka.androidprojects;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecylerViewActivity extends AppCompatActivity {

    public static final String TAG = "RecylerViewActivity";
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyler_view);
        rv = findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new RecyclerView.Adapter() {
            @NonNull
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return new UserViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv,parent,false));
            }

            @Override
            public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
                ((UserViewHolder)holder).tv.setText(holder.getAdapterPosition()+"");
            }

            @Override
            public int getItemCount() {
                return 30;
            }
        });

        rv.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                LinearLayoutManager lm = (LinearLayoutManager)recyclerView.getLayoutManager();
                Log.i(TAG,lm.findFirstVisibleItemPosition()+"--"+lm.findLastVisibleItemPosition()+"--"+lm.findLastCompletelyVisibleItemPosition());
                Log.i(TAG,lm.getChildCount()+"--"+lm.getItemCount());

            }
        });
    }

    class UserViewHolder extends RecyclerView.ViewHolder{

       public TextView tv;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv);

        }
    }
}