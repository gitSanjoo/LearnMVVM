package com.sanjoo.learnmvvm.retrofit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sanjoo.learnmvvm.R;
import com.sanjoo.learnmvvm.retrofit.models.Photos;

import java.util.List;

public class PhotosAdapter extends RecyclerView.Adapter<PhotosAdapter.PhotosViewHolder> {

    List<Photos> photoList;

    public PhotosAdapter(List<Photos> photoList){
        this.photoList=photoList;
    }
    @NonNull
    @Override
    public PhotosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.list_photos_item,parent,false);
        return new PhotosAdapter.PhotosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhotosViewHolder holder, int position) {

        holder.t1.setText(photoList.get(position).getAlbumId());
        holder.t2.setText(photoList.get(position).getId());
        holder.t3.setText(photoList.get(position).getTitle());
        holder.t4.setText(photoList.get(position).getUrl());
        holder.t5.setText(photoList.get(position).getThumbnailUrl());
    }

    @Override
    public int getItemCount() {
       return photoList.size();
    }

    public class PhotosViewHolder extends RecyclerView.ViewHolder{

        TextView t1,t2,t3,t4,t5;

        public PhotosViewHolder(@NonNull View itemView) {
            super(itemView);
            t1=itemView.findViewById(R.id.t1);
            t2=itemView.findViewById(R.id.t2);
            t3=itemView.findViewById(R.id.t3);
            t4=itemView.findViewById(R.id.t4);
            t5=itemView.findViewById(R.id.t5);

        }
    }
}
