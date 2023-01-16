package com.example.e_cmmerceapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.e_cmmerceapp.R;
import com.example.e_cmmerceapp.activities.MainActivity;
import com.example.e_cmmerceapp.databinding.ItemCategoriesBinding;
import com.example.e_cmmerceapp.modal.categarymodel;

import java.util.ArrayList;

public class categaryAdapter extends RecyclerView.Adapter<categaryAdapter.categarviewholder> {

      ArrayList<categarymodel> categories;
    Context context;

    public categaryAdapter(MainActivity context, ArrayList<categarymodel> categories) {
        this.context=context;
        this.categories= categories;

    }

    @NonNull
    @Override
    public categarviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_categories,parent,false);
        categarviewholder viewHolder=new categarviewholder(view);
        return viewHolder;
    }




    @Override
    public void onBindViewHolder(@NonNull categarviewholder holder, int position) {
       categarymodel categarymodel= categories.get(position);
         holder.binding.textView2.setText(categarymodel.getName());
        Glide.with(context).load(categarymodel.getIcon()).into(holder.binding.image2);
      //  holder.binding.image2.setBackground(Color.parseColor(categarymodel.getColor()));
    }

    @Override
    public int getItemCount() {
       return categories.size();
    }

    public class categarviewholder extends RecyclerView.ViewHolder{
        ItemCategoriesBinding binding;
        public categarviewholder(@NonNull View itemView) {
            super(itemView);
            binding=ItemCategoriesBinding.bind(itemView);
        }
    }
}
