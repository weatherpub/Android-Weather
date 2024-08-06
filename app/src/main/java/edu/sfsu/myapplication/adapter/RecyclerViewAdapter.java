package edu.sfsu.myapplication.adapter;

import android.util.Log;
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

    Listener listener;

    // Inner interface
    public interface Listener {
        void onClick(int position);
    }

    public RecyclerViewAdapter(ArrayList<MenuModel> menuModel) {
       this.menuModel = menuModel;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        View itemView = holder.itemView;
        MenuModel item = menuModel.get(position);
        holder.category.setText(String.format("%s", item.getCurrent()));

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(listener != null) {
                    listener.onClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        Log.v("LOG", "getItemCount -> " + menuModel.size());
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