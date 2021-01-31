package com.gould.optionpicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OptionAdapter extends RecyclerView.Adapter<OptionAdapter.OptionViewHolder> {
    private ArrayList<Option> mOptionList;

    public static class OptionViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;

        public OptionViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.checkBox);
        }
    }

    public OptionAdapter(ArrayList<Option> optionList) {
        mOptionList = optionList;
    }

    @NonNull
    @Override
    public OptionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.option, parent, false);
        OptionViewHolder ovh = new OptionViewHolder(v);
        return ovh;
    }

    @Override
    public void onBindViewHolder(@NonNull OptionViewHolder holder, int position) {
        Option currentOption = mOptionList.get(position);

        holder.mTextView.setText(currentOption.getText());
    }

    @Override
    public int getItemCount() {
        return mOptionList.size();
    }
}