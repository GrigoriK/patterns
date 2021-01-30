package patterns.behavioural.visitor;

public interface Visitor {
    void recyclePaper( Paper paper);
    void recyclePlastic(Plastic plastic);
    void recyclePCan(Can can);
}
