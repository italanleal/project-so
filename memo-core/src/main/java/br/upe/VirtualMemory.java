package br.upe;

import java.util.HashMap;

public class VirtualMemory implements MemoryManagementComponent {
    private Page[] pages;
    private HashMap<Page, Counter> counters;
    private HashMap<Page, Address> pageTable;

    private MemoryManagementMediator mediator;
    @Override
    public void setMediator(MemoryManagementMediator mediator) {
        this.mediator = mediator;
    }
    @Override
    public String getName() {
        return "VirtualMemory";
    }
}
