package br.upe;

public class MemoryManager implements MemoryManagementMediator {
    private PhysicalMemory pMemo;
    private VirtualMemory  vMemo;
    private DiskMemory     dMemo;

    public void registerComponent(MemoryManagementComponent component) {
        component.setMediator(this);
        switch (component.getName()) {
            case "AddButton":
                add = (AddButton)component;
                break;
            case "DelButton":
                del = (DeleteButton)component;
                break;
            case "Filter":
                filter = (Filter)component;
                break;
        }
    }

}
