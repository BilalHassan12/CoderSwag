package com.smartherd.coderswag.Adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.smartherd.coderswag.Model.Category
import java.util.*

class CategoryAdapter(context: Context, categories:List<Category>) : BaseAdapter(){

    val context = context

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

    }

    override fun getItem(position: Int): Any {

    }

    override fun getItemId(position: Int): Long {
       return 0
    }

    override fun getCount(): Int {

    }

}