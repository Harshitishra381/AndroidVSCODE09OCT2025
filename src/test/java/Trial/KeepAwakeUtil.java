package Trial;

import java.io.IOException;

public class KeepAwakeUtil {
    private static Process caffeinate;
    private static Process pmsetProcess;
    
    public static void startKeepAwake() {
        try {
            // Disable all sleep settings
            ProcessBuilder pmsetBuilder = new ProcessBuilder("sudo", "-n", "pmset", "-a", "sleep", "0", "displaysleep", "0", "disksleep", "0");
            pmsetProcess = pmsetBuilder.start();
            
            // Start aggressive caffeinate
            ProcessBuilder pb = new ProcessBuilder("caffeinate", "-dimsu", "-w", String.valueOf(ProcessHandle.current().pid()));
            caffeinate = pb.start();
            
            System.out.println("🔋 Enhanced keep-awake started - screen lock prevented");
            System.out.println("💻 Display will stay active even when lid is closed");
        } catch (IOException e) {
            System.out.println("⚠️ Could not start enhanced keep-awake: " + e.getMessage());
            // Fallback to basic caffeinate
            startBasicKeepAwake();
        }
    }
    
    private static void startBasicKeepAwake() {
        try {
            ProcessBuilder pb = new ProcessBuilder("caffeinate", "-dimsu");
            caffeinate = pb.start();
            System.out.println("🔋 Basic keep-awake started as fallback");
        } catch (IOException e) {
            System.out.println("❌ Failed to start any keep-awake mechanism");
        }
    }
    
    public static void stopKeepAwake() {
        if (caffeinate != null && caffeinate.isAlive()) {
            caffeinate.destroy();
        }
        if (pmsetProcess != null && pmsetProcess.isAlive()) {
            pmsetProcess.destroy();
        }
        
        // Restore normal sleep settings
        try {
            ProcessBuilder restoreBuilder = new ProcessBuilder("sudo", "-n", "pmset", "-a", "sleep", "1", "displaysleep", "2", "disksleep", "10");
            restoreBuilder.start();
            System.out.println("🔋 Keep-awake stopped - normal sleep behavior restored");
        } catch (IOException e) {
            System.out.println("⚠️ Could not restore sleep settings: " + e.getMessage());
        }
    }
}