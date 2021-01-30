package patterns.behavioural.visitor;

public interface Trash {
    void throwOut();
    void recycle(Visitor visitor);
}
