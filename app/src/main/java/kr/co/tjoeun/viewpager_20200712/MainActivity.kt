package kr.co.tjoeun.viewpager_20200712

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.viewpager_20200712.adapters.MainViewPagerAdapter

class MainActivity : BaseActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

//        어댑터 연결
        mvpa = MainViewPagerAdapter(supportFragmentManager)  //Activity의 기능 중에 supportFragmentManager 지원함
        mainViewPager.adapter = mvpa

//        탭레이아웃 + 뷰페이저 연결
        myTabLayout.setupWithViewPager(mainViewPager)
    }


}