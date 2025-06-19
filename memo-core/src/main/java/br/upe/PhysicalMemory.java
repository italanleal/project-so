package br.upe;

public class PhysicalMemory implements MemoryManagementComponent {
    private byte[] memory;

    private MemoryManagementMediator mediator;
    @Override
    public void setMediator(MemoryManagementMediator mediator) {
        this.mediator = mediator;
    }
    @Override
    public String getName() {
        return "PhysicalMemory";
    }
}
