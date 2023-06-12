package com.example.quiz

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.quiz.databinding.ActivityMathsquizBinding
import com.example.quiz.databinding.ItemBorderBinding

class question_adapter(val queslist:ArrayList<questions>):RecyclerView.Adapter<question_adapter.viewholder>(){


     class viewholder(var binding:ItemBorderBinding):RecyclerView.ViewHolder(binding.root){}

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {

          return viewholder(ItemBorderBinding.inflate(LayoutInflater.from(parent.context),parent,false))
     }

     override fun onBindViewHolder(holder: viewholder, position: Int) {
         var quesno: questions= queslist[position]

          holder.binding.tvBorder.text=quesno.id.toString()

         when {
              quesno.isselected-> {

                  holder.binding.tvBorder.background=ContextCompat.getDrawable(holder.itemView.context,R.drawable.current_ques_border)
              }

             quesno.iscompleted-> {
                 holder.binding.tvBorder.background=ContextCompat.getDrawable(holder.itemView.context,R.drawable.circular_border_filled)
             }

         }

             



     }

     override fun getItemCount(): Int {
           return queslist.size
     }


}