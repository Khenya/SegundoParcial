package examen2.template.chainOfResponsability;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();

    // criterio para menejar el problema
    void criteriaHandler(int amount);

}
