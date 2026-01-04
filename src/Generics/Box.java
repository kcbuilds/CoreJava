package Generics;

public class Box <T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class Box2 <N extends Number> {
    private N value;

    public N getValue() {
        return value;
    }

    public void setValue(N value) {
        this.value = value;
    }
}

