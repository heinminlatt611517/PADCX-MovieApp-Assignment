package com.example.padcx_movieapp_assignment.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.padcx_movieapp_assignment.R
import com.example.padcx_movieapp_assignment.data.vos.CrewVO
import com.example.shared.viewholder.BaseViewHolder
import com.example.padcx_movieapp_assignment.views.viewHolders.CreatorViewHolder
import com.example.shared.adapter.BaseRecyclerAdapter

class CreatorAdapter : BaseRecyclerAdapter<BaseViewHolder<CrewVO>, CrewVO>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<CrewVO> {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_actors_layout, parent, false)
        return CreatorViewHolder(view)
    }
}