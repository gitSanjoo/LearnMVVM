package com.sanjoo.learnmvvm.retrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sanjoo.learnmvvm.R;
import com.sanjoo.learnmvvm.retrofit.models.User;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UserViewHolder> {

    List<User> userList;

    public UsersAdapter(List<User> userList) {
    this.userList= userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_user_item,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.tvName.setText(userList.get(position).getName());
        holder.tvEmail.setText(userList.get(position).getEmail());
        holder.tvPhone.setText(userList.get(position).getPhone());
        holder.tvWebsite.setText(userList.get(position).getWebsite());
        holder.tvid.setText(userList.get(position).getId().toString());
        holder.tvuserName.setText(userList.get(position).getUsername());
        holder.tvAddress.setText(userList.get(position).getAddress().toString());
        holder.tvCompany.setText(userList.get(position).getCompany().toString());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        TextView tvName,tvEmail,tvPhone,tvWebsite,tvid,tvuserName,tvAddress,tvCompany;

        public UserViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvEmail = itemView.findViewById(R.id.email);
            tvPhone = itemView.findViewById(R.id.phone);
            tvWebsite = itemView.findViewById(R.id.website);
            tvid = itemView.findViewById(R.id.id);
            tvuserName = itemView.findViewById(R.id.userName);
            tvAddress = itemView.findViewById(R.id.address);
            tvCompany = itemView.findViewById(R.id.company);

        }
    }



}
