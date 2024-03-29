package io.startform.parent;

public sealed interface Color permits Color.Blue, Color.Red {
    record Red (String color) implements Color{}
    non-sealed interface Blue extends Color {}
}
