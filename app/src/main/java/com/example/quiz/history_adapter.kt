package com.example.quiz

import android.content.Context
import android.graphics.Point
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quiz.databinding.ItemRecycleBinding
import javax.security.auth.Subject

class history_adapter(var context: Context, var allscores: List<historyentity>): RecyclerView.Adapter<history_adapter.history_view_holder>() {

    class history_view_holder(var binding: ItemRecycleBinding): RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): history_view_holder {
        return history_view_holder(ItemRecycleBinding.inflate(LayoutInflater.from(parent.context), parent , false))
    }

    override fun onBindViewHolder(holder: history_view_holder, position: Int) {
        var current  = allscores[position]


        holder.binding.tvSubject.text = current.subject_name
        holder.binding.tvScore.text = current.score.toString()
        holder.binding.tvDate.text = current.date.toString()

    }

    override fun getItemCount(): Int {
        return allscores.size
    }


}