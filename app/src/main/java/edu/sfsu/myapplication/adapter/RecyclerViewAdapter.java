package edu.sfsu.myapplication.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import edu.sfsu.myapplication.R;
import edu.sfsu.myapplication.model.MenuModel;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    ArrayList<MenuModel> menuModel;

    public RecyclerViewAdapter(ArrayList<MenuModel> menuModel) {
       this.menuModel = menuModel;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MenuModel item = menuModel.get(position);
        holder.category.setText(String.format("%s", item.getCurrent()));
    }

    @Override
    public int getItemCount() {
        return menuModel.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView category;

        public ViewHolder(@NonNull View view) {
            super(view);
            category = (TextView) view.findViewById(R.id.tv_category);
        }
    }
}