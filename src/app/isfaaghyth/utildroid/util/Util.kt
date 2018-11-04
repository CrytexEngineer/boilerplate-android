package app.isfaaghyth.utildroid.util

import java.io.InputStream
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object Util {
    val currentDir = System.getProperty(Global.System.DIR_PROPERTY)

    fun getTimeNow(): String {
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        return current.format(formatter)
    }

    fun layoutName(fileName: String): String {
        var tmpLayoutName = ""
        for (name in fileName.split("(?<=[a-z])(?=[A-Z])".toRegex()).reversed()) {
            tmpLayoutName += name.toLowerCase() + "_"
        }
        return tmpLayoutName.substring(0, tmpLayoutName.length - 1)
    }

    fun getTemplate(type: String): InputStream {
        return javaClass.getResourceAsStream("/$type")
    }

    fun projectPackage(packageName: String): String {
        var projectLocation = ""
        val packages = packageName.split(".")
        for (domain in packages) projectLocation = "$projectLocation/$domain"
        return projectLocation
    }
}