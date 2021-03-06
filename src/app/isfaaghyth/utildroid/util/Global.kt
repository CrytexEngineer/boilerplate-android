package app.isfaaghyth.utildroid.util

object Global {
    object Prefix {
        val PRESENTER = "Presenter"
        val VIEW = "View"
        val FRAGMENT = "Fragment"
        val ACTIVITY = "Activity"
    }

    object System {
        val DIR_PROPERTY = "user.dir"
    }

    object Directory {
        val ANDROID_PROJECT = "/app/src/main/java"
        val ANDROID_RES = "/app/src/main/res/layout/"
    }

    object Template {
        val FRAGMENT = "fragment.template"
        val ACTIVITY = "activity.template"
        val LAYOUT = "layout.template"
        object Mvp {
            val Presenter = "mvppresenter.template"
            val View = "mvpview.template"
        }
    }

    object Ext {
        val Kt = ".kt"
        val Java = ".java"
        val Xml = ".xml"
    }
}