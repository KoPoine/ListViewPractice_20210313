package com.example.listviewpractice_20210313.adapters

// ArrayAdapter를 상속받음 ( : ArrayAdapter)
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listviewpractice_20210313.R
// Student를 받아서 뿌릴꺼야 (<Student = 방금 만든 데이터 class>()
import com.example.listviewpractice_20210313.datas.Student
// 3가지 받아오고 받아오는 순서대로 대입
class StudentAdapter(
    val mContext : Context, 
    val resId : Int, 
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {

//    xml > 코틀린 변수로 꺼내오도록 도와주는 클래스. (LayoutInflater)
    val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

//        return 지우는 행위 >> 기존의 결과를 버리고 새로우 결과를 직접 만들어서 사용
//        position : 지금 그려주려는 위치가 어디인지를 알려준다.
//        convertView : 재활용 할 요소가 있는지 확인하고 있다면 활용, 없다면 새로 그려주자.

        var tempRow = convertView

//        재활용 할 요소가 없나? => 없으면 그려줘야함
        if (tempRow == null) {
//            if 문 내부로 진입 > tempRow 내부가 비어있는 상황! => 채워주자
            tempRow = inflater.inflate(R.layout.student_list_item, null)
        }

//        tempRow는 절대 null이 아니다 > 무조건 결과로 나가도 된다. (null이면 if에서 채웠고, null이 아니라면 바로 왔을테니까
        val row = tempRow!!

//        완성된 row가 화면에 뿌려질 결과로 선정
        return row


    }

}