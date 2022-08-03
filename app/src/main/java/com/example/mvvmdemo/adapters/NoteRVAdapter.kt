package com.example.mvvmdemo.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmdemo.R
import com.example.mvvmdemo.roomdata.User

class UserRVAdapter(
    val context: Context,
    val userClickDeleteInterface: UserClickDeleteInterface,
    val userClickInterface: UserClickInterface
) :
    RecyclerView.Adapter<UserRVAdapter.ViewHolder>() {
  
    // on below line we are creating a 
    // variable for our all users list.
    private val allUsers by lazy { ArrayList<User>() }

    // on below line we are creating a view holder class.
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // on below line we are creating an initializing all our 
        // variables which we have added in layout file.
        val userTV = itemView.findViewById<TextView>(R.id.idTVNote)
        val dateTV = itemView.findViewById<TextView>(R.id.idTVDate)
        val deleteIV = itemView.findViewById<ImageView>(R.id.idIVDelete)
    }
  
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflating our layout file for each item of recycler view.
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.user_list_layout,
            parent, false
        )
        return ViewHolder(itemView)
    }
  
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // on below line we are setting data to item of recycler view.
        holder.userTV.setText(allUsers.get(position).name)
        holder.dateTV.setText("Last Updated : " + allUsers.get(position).dob)
        // on below line we are adding click listener to our delete image view icon.
        holder.deleteIV.setOnClickListener {
            // on below line we are calling a user click
            // interface and we are passing a position to it.
            userClickDeleteInterface.onDeleteIconClick(allUsers.get(position))
        }
  
        // on below line we are adding click listener
        // to our recycler view item.
        holder.itemView.setOnClickListener {
            // on below line we are calling a user click interface
            // and we are passing a position to it.
            userClickInterface.onUserClick(allUsers.get(position))
        }
    }
  
    override fun getItemCount(): Int {
        // on below line we are 
        // returning our list size.
        return allUsers.size
    }
  
    // below method is use to update our list of users.
    fun updateList(newList: List<User>) {
        // on below line we are clearing 
        // our users array list
        allUsers.clear()
        // on below line we are adding a 
        // new list to our all users list.
        allUsers.addAll(newList)
        // on below line we are calling notify data 
        // change method to notify our adapter.
        notifyDataSetChanged()
    }
}
  
interface UserClickDeleteInterface {
    // creating a method for click 
    // action on delete image view.
    fun onDeleteIconClick(user: User)
}
  
interface UserClickInterface {
    // creating a method for click action
    // on recycler view item for updating it.
    fun onUserClick(user: User)
}