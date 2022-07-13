package com.example.remember

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.example.remember.databinding.HomeBinding

class MainActivity : AppCompatActivity() {

    private lateinit var homeBinding: HomeBinding
    private val rotateOpen: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.rotate_open_anim) }
    private val rotateClose: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.rotate_close_anim) }
    private val fromBottom: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.from_bottom_anim) }
    private val toBottom: Animation by lazy { AnimationUtils.loadAnimation(this, R.anim.to_bottom_anim) }
    private var clicked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homeBinding = HomeBinding.inflate(layoutInflater)

        val home = homeBinding.root
        val fab = homeBinding.fab
        val taskFab = homeBinding.taskFab
        val eventFab = homeBinding.eventFab
        val noteFab = homeBinding.noteFab

        setContentView(home)
        fab.setOnClickListener { onFabClicked() }
        taskFab.setOnClickListener { Toast.makeText(this, "Add a task", Toast.LENGTH_SHORT).show() }
        eventFab.setOnClickListener { Toast.makeText(this, "Add an event", Toast.LENGTH_SHORT).show() }
        noteFab.setOnClickListener { Toast.makeText(this, "Add a note", Toast.LENGTH_SHORT).show() }

    }

    private fun onFabClicked() {
        setVisibility(isCLicked = clicked)
        setAnimation(isCLicked = clicked)
        setClickable(isCLicked = clicked)
        clicked = !clicked
    }

    private fun setVisibility(isCLicked: Boolean) {

        if (!isCLicked) {
            homeBinding.taskFab.visibility = View.VISIBLE
            homeBinding.eventFab.visibility = View.VISIBLE
            homeBinding.noteFab.visibility = View.VISIBLE
        } else {
            homeBinding.taskFab.visibility = View.INVISIBLE
            homeBinding.eventFab.visibility = View.INVISIBLE
            homeBinding.noteFab.visibility = View.INVISIBLE
        }

    }

    private fun setAnimation(isCLicked: Boolean) {

        if (!isCLicked) {
            homeBinding.taskFab.startAnimation(fromBottom)
            homeBinding.eventFab.startAnimation(fromBottom)
            homeBinding.noteFab.startAnimation(fromBottom)
            homeBinding.fab.startAnimation(rotateOpen)
        } else {
            homeBinding.taskFab.startAnimation(toBottom)
            homeBinding.eventFab.startAnimation(toBottom)
            homeBinding.noteFab.startAnimation(toBottom)
            homeBinding.fab.startAnimation(rotateClose)
        }

    }

    private fun setClickable(isCLicked: Boolean) {

        if (!isCLicked) {
            homeBinding.taskFab.isClickable = true
            homeBinding.eventFab.isClickable = true
            homeBinding.noteFab.isClickable = true
        } else {
            homeBinding.taskFab.isClickable = false
            homeBinding.eventFab.isClickable = false
            homeBinding.noteFab.isClickable = false
        }

    }

}