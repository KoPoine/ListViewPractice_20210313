package com.example.listviewpractice_20210313.adapters

// ArrayAdapter를 상속받음 ( : ArrayAdapter)
import android.content.Context
import android.view.LayoutInflater
import android.widget.ArrayAdapter
// Student를 받아서 뿌릴꺼야 (<Student = 방금 만든 데이터 class>()
import com.example.listviewpractice_20210313.datas.Student
// 3가지 받아오고 받아오는 순서대로 대입
class StudentAdapter(
    val mContext : Context, 
    val resId : Int, 
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {

//    xml > 코틀린 변수로 꺼내오도록 도와주는 클래스. (LayoutInflater)
    val inflater = LayoutInflater.from(mContext)


}