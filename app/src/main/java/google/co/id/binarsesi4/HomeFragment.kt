package google.co.id.binarsesi4

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.view.*

/**
 * Created by pertadima on 15,October,2018
 */

class HomeFragment : Fragment() {
    lateinit var callback: FragmentChange

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, null)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity is FragmentChange) {
            callback = activity as FragmentChange
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.button.setOnClickListener {
            callback.onFragnmentChange("category")
        }

        view.button_dua.setOnClickListener {
            callback.rating()
        }
    }
}