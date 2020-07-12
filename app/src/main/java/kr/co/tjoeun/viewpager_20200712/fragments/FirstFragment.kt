package kr.co.tjoeun.fragment_20200712.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_first.*
import kr.co.tjoeun.viewpager_20200712.R


class FirstFragment : Fragment() {  //상속은 꼭 생성자()로 만들어줘야 한다.

    override fun onCreateView(
        inflater: LayoutInflater,  //xml을 객체로 바꿔주는 기능(inflate). ListView에서도 썼었음
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)  //null 넣었던 ListView와 달리 container, false 넣어주기

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        changeInfoBtn.setOnClickListener {
            infoTxt.text = "변경된 문구"
        }
    }

}