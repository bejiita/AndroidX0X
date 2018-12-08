package giavu.hoangvm.japanfood.jfd

import android.app.Application

/**
 * @Author: Hoang Vu
 * @Date:   2018/12/08
 */
open class JFDApp: Application() {

    override fun onCreate() {
        super.onCreate()
        KoinInitializer(this).initialize()
    }
}