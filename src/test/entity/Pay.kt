package test.entity

import pay.User

class Pay {
    fun startPay(){
        var user : User = User("xiaomi",111);
        println("User:" + user);
    }
}