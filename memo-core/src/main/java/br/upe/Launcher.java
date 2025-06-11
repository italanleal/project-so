package br.upe;

public class Launcher {
    private static final EnvironmentVariables env = new EnvironmentVariables();

    public static void main(String[] args) {
        MemoryManager memoryManager = new MemoryManager();

        PhysicalMemory pMemo = new PhysicalMemory();
        VirtualMemory  vMemo = new VirtualMemory();
        DiskMemory     dMemo = new DiskMemory();

        memoryManager.registerComponent(pMemo);
        memoryManager.registerComponent(dMemo);
        memoryManager.registerComponent(dMemo);

    }
}
