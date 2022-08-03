package com.example.mvvmdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvmdemo.adapters.UserClickDeleteInterface
import com.example.mvvmdemo.adapters.UserClickInterface
import com.example.mvvmdemo.adapters.UserRVAdapter
import com.example.mvvmdemo.roomdata.UserDatabase
import com.example.mvvmdemo.roomdata.repository.UserRepository
import com.example.mvvmdemo.roomdata.viewmodel.UserViewModelFactory
import com.example.mvvmdemo.viewModels.MainVewModel
import com.example.mvvmdemo.databinding.ActivityMainBinding
import com.example.mvvmdemo.roomdata.User

class MainActivity : AppCompatActivity(), UserClickInterface, UserClickDeleteInterface {

    private lateinit var subscriberViewModel: MainVewModel

    companion object{
        public lateinit var userRVAdapter: UserRVAdapter

        public lateinit var binding: ActivityMainBinding


    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val dao = UserDatabase(this)
        val repository = UserRepository(dao)
        val factory = UserViewModelFactory(repository)
        subscriberViewModel = ViewModelProvider(this,factory).get(MainVewModel::class.java)
        binding.myViewModel = subscriberViewModel
        binding.lifecycleOwner = this


        // on below line we are setting layout
        // manager to our recycler view.
        binding.userRecyclerView.layoutManager = LinearLayoutManager(this)

        // on below line we are initializing our adapter class.
        userRVAdapter = UserRVAdapter(this, this, this)

        // on below line we are setting
        // adapter to our recycler view.
        binding.userRecyclerView.adapter = userRVAdapter

        // on below line we are
        // initializing our view modal.

        // on below line we are calling all notes method
        // from our view modal class to observer the changes on list.
       RefreshAll()

        binding.btnsave.setOnClickListener {
            binding.myViewModel?.saveOrUpdate()
            RefreshAll()
        }
    }





    fun RefreshAll()
    {
        binding.myViewModel?.getAllUser()?.observe(this, Observer { list ->
            list?.let {
                // on below line we are updating our list.
                userRVAdapter.updateList(it)
            }
        })
    }
    override fun onDeleteIconClick(user: User) {
        binding.myViewModel?.deleteUser(user)
        // displaying a toast message
    }

    override fun onUserClick(user: User) {
       /* val intent = Intent(this@MainActivity, AddEditNoteActivity::class.java)
        intent.putExtra("noteType", "Edit")
        intent.putExtra("noteTitle", note.noteTitle)
        intent.putExtra("noteDescription", note.noteDescription)
        intent.putExtra("noteId", note.id)
        startActivity(intent)
        this.finish()*/
        binding.edtname.setText(user.name)
        binding.edtdob.setText(user.dob)
        binding.edtgender.setText(user.gender)
        binding.myViewModel?.saveOrUpdateButtonText?.value = resources.getString(R.string.lblupdate)
        binding.btnsave.setText(resources.getString(R.string.lblupdate))
    }
}