package jp.techacademy.naomasa.sakamoto.kotlinlog

import android.util.Log

open class Dog: Animal, Movable {

    constructor(name: String, age:Int): super(name, age)
    //メソッド
    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "[ワンワン]")
    }

    override fun move() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "は全力で走った。")
    }
}

//プライマリコンストラクタ
//class Dog(var name: String, var age: Int) {
    //プロパティ以外の処理を行う時はinitを使う
    //init {
        // 処理
    //}
    //メソッド
    //fun say() {
        //Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "[ワンワン]")
    //}
//}

//class Dog(var name: String, var age: Int) {
    // コンパニオンオブジェクトを使用した方法
    //companion object {
        //val to_jp = "犬"

        //fun introduce() {
            //Log.d("kotlintest", "これは犬クラスです。")
        //}
    //}

    // メソッド
    //fun say() {
        //Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    //}
//}