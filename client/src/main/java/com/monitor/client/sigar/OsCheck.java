package com.monitor.client.sigar;

public final class OsCheck {
  /**
   * types of Operating Systems
   */
  public enum OSType {
    Windows, MacOS, Linux, Other
  }

  protected static OSType detectedOS;

  /**
   * detected the operating system from the os.name System property and cache
   * the result
   * 
   * @returns - the operating system detected
   */
  public static OSType getOperatingSystemType() {
    if (detectedOS == null) {
      String OS = System.getProperty("os.name", "generic").toLowerCase();
      if (OS.contains("win")) {
        detectedOS = OSType.Windows;
      } else if ((OS.contains("mac")) || (OS.contains("darwin"))) {
        detectedOS = OSType.MacOS;
      } else if (OS.contains("nux")) {
        detectedOS = OSType.Linux;
      } else {
        detectedOS = OSType.Other;
      }
    }
    return detectedOS;
  }
}