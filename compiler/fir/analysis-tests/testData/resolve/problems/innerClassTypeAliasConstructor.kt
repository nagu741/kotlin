class Outer {
    inner class Inner
}

typealias Alias = Outer.Inner

fun Outer.test() = <!UNRESOLVED_REFERENCE!>Alias<!>()        // FE 1.0: Ok
fun Outer.test2() = Outer.<!UNRESOLVED_REFERENCE!>Inner<!>() // FE 1.0: resolution to classifier
