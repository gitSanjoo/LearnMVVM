package com.sanjoo.learnmvvm.retrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sanjoo.learnmvvm.R;
import com.sanjoo.learnmvvm.retrofit.Tablayout.TabAdapter;
import com.sanjoo.learnmvvm.retrofit.models.Todo;

import java.util.List;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoViewHolder> {
    List<Todo> todoList;

    public TodoAdapter( List<Todo> todoList){
        this.todoList=todoList;
    }

    @NonNull
    @Override
    public TodoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_todos_layout,parent,false);
        return new TodoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TodoViewHolder holder, int position) {

        holder.tt1.setText(todoList.get(position).getUserId());
        holder.tt2.setText(todoList.get(position).getId());
        holder.tt3.setText(todoList.get(position).getTitle());
        holder.tt4.setText(todoList.get(position).getCompleted().toString());
    }

    @Override
    public int getItemCount() {
        return todoList.size();
    }

    public class TodoViewHolder extends RecyclerView.ViewHolder{
        TextView tt1,tt2,tt3,tt4;

        public TodoViewHolder(@NonNull View itemView) {
            super(itemView);
            tt1=itemView.findViewById(R.id.tt1);
            tt2=itemView.findViewById(R.id.tt2);
            tt3=itemView.findViewById(R.id.tt3);
            tt4=itemView.findViewById(R.id.tt4);
        }

    }
}
