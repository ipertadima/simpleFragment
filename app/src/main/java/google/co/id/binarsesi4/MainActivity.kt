package google.co.id.binarsesi4

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), FragmentChange {
    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                changeFragment(HomeFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                changeFragment(CategoryFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                changeFragment(ProfileFragment())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        supportFragmentManager.beginTransaction().add(R.id.frame_layout, HomeFragment()).commit()
    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frame_layout, fragment).commit()
    }

    override fun onFragnmentChange(params: String) {
        when (params) {
            "home" -> {

            }
            "profile" -> {

            }
            "category" -> {
                changeFragment(CategoryFragment())
            }
        }
    }

    override fun rating() {
        Log.d("Rating", "refresh rating")
    }
}
