//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var person = Person("Mike")

    val result = person.also {
        it.name = "Kevin"
    }.name

    print(result)

}