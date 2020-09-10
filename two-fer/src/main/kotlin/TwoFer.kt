//Internal is a modifier and that means it’ll be available in the same module only
internal fun twofer(name: String = "you"): String {
    return "One for " + name + ", one for me."
}

//I could also have done:
//internal fun twofer(name: String = "you") = "One for $name, one for me."
