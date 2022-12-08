package com.example.recycler_menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder>{

    ArrayList<modelmenu> menulist;
    Context context;

    MenuAdapter(Context context, ArrayList<modelmenu> menulist)
    {
        this.context = context;
        this.menulist = menulist;
    }

    @NonNull
    @Override
    public MenuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.menulayout, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.ViewHolder holder, int position) {
        holder.app.setText(menulist.get(position).app_name);
        holder.image.setImageResource(menulist.get(position).app_image);
    }

    @Override
    public int getItemCount() {
        return menulist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView app;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            app = itemView.findViewById(R.id.Text_1);
            image = itemView.findViewById(R.id.Image_1);
        }
    }
}
