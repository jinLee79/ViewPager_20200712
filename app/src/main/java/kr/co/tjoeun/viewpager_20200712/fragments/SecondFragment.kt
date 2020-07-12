package kr.co.tjoeun.fragment_20200712.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_second.*
import kr.co.tjoeun.viewpager_20200712.R

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toastBtn.setOnClickListener {
            Toast.makeText(activity, "두번째 프래그먼트입니다.", Toast.LENGTH_SHORT).show() //fragment를 들고 있는 activity를 넣어준다.
        }
    }

}