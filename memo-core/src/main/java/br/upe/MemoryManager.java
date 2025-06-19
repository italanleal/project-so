package br.upe;

public class MemoryManager implements MemoryManagementMediator {
    private PhysicalMemory pMemo;
    private VirtualMemory  vMemo;
    private DiskMemory     dMemo;

    public void registerComponent(MemoryManagementComponent component) {
        component.setMediator(this);
        switch (component.getName()) {
            case "PhysicalMemory":
                pMemo = (PhysicalMemory) component;
                break;
            case "VirtualMemory":
                vMemo = (VirtualMemory) component;
                break;
            case "DiskMemory":
                dMemo = (DiskMemory) component;
                break;
        }
    }

}
