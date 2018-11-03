package pack

import util.Global
import util.Util
import java.io.File

class Templating(private val fileName: String) {

    private fun getTemplate(type: String): String {
        return "${Util.currentDir}${Global.Directory.TEMPLATE}$type"
    }

    fun create(initial: HashMap<String, String>, extension: String) {
        val packageName = initial[Global.Key.ROOT_PACKAGE].toString()
        val fullPackage = initial[Global.Key.PACKAGE].toString()
        val projectDirectory = initial[Global.Key.DIRECTORY].toString()

        val newFile = File("$projectDirectory$fileName$extension")

        val fragmentTemplate = File(getTemplate(Global.Template.FRAGMENT))
        var temporary = fragmentTemplate.readText()
        temporary = temporary.replace("~CLASS", fileName).trim()
        temporary = temporary.replace("~ROOT_PACKAGE", packageName).trim()
        temporary = temporary.replace("~PACKAGE", fullPackage).trim()
        temporary = temporary.replace("~TIME", Util.getTimeNow()).trim()
        println(temporary)

        newFile.writeText(temporary)
    }
}