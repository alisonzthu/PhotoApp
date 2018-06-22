package com.example.macstudio.submissionappalison.ui

import android.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBar
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.widget.RelativeLayout
import com.example.macstudio.submissionappalison.R
import com.example.macstudio.submissionappalison.common.CommonHelloService
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var mDrawerLayout: DrawerLayout

    @Inject
    lateinit var commonHelloService: CommonHelloService

//    @Inject
//    lateinit var viewModelFactory: ViewModelFactory
//
//    lateinit var viewModel: ImageListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val actionbar: ActionBar? = supportActionBar
        actionbar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.menu_icon)
        }

        mDrawerLayout = findViewById(R.id.drawer_layout)

        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener{ menuItem ->
            menuItem.isChecked = true

            mDrawerLayout.closeDrawers()
//            TODO("add code here to update the UI based on item selected. e.g. swap fragments here")
            true
        }

        if (findViewById<RelativeLayout>(R.id.main_content) != null) {
            // if we're being restored from a previous state we don'tneed to do anything
            // otherwise we could end up with overlapping fragments
            if (savedInstanceState != null) {
                return
            }
            val photoListFragment: PhotoListFragment = PhotoListFragment()
            supportFragmentManager.beginTransaction().add(R.id.main_content, photoListFragment).commit()
        }

//        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ImageListViewModel::class.java)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            android.R.id.home -> {
                mDrawerLayout.openDrawer(GravityCompat.START)
                true
            } else -> super.onOptionsItemSelected(item)
        }
    }
}
