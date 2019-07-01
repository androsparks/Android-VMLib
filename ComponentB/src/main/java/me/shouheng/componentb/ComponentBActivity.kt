package me.shouheng.componentb

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import me.shouheng.component.api.UserService

@Route(path = "/componentb/main")
class ComponentBActivity : AppCompatActivity() {

    private lateinit var userService: UserService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_component_b)

        userService = ARouter.getInstance().navigation(UserService::class.java)

        findViewById<View>(R.id.btn_request_user).setOnClickListener {
            userService.requestUser()
        }
    }
}