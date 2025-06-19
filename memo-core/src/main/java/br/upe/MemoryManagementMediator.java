package br.upe;

public interface MemoryManagementMediator {
    void registerComponent(MemoryManagementComponent component);

    void loadPage();
    void removePage();
    void storePage();
}
