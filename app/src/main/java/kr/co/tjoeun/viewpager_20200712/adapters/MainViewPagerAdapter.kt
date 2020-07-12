package kr.co.tjoeun.viewpager_20200712.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.fragment_20200712.fragments.FirstFragment
import kr.co.tjoeun.fragment_20200712.fragments.SecondFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
//        Kotlin스럽지 않다
//        if (position == 0) {
//            return "첫째 페이지"
//        }
//        else {
//            return "둘째 페이지"
//        }

//        별로 Kotlin 스럽지 않다
//        when(position) {
//            0 -> {return "첫째 페이지"}
//            else -> {return "둘째 페이지"}
//        }

        return when (position) {
            0 -> "첫째 페이지"
            else -> "둘째 페이지"
        }
    }
    override fun getItem(position: Int): Fragment {
//        if (position == 0) {
//            return FirstFragment()
//        }
//        else {
//            return SecondFragment()
//        }

        return when (position) {
            0 -> FirstFragment()
            else -> SecondFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }
}