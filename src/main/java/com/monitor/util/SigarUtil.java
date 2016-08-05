package com.monitor.util;

import com.google.common.io.Resources;
import org.hyperic.sigar.Sigar;

import java.io.File;

public class SigarUtil {

    public final static Sigar sigar = initSigar();

    private static Sigar initSigar() {
        try {
            String file = Resources.getResource("sigar/sigar-amd64-winnt.dll").getFile();
            File classPath = new File(file).getParentFile();

            String path = System.getProperty("java.library.path");
            if (OsCheck.getOperatingSystemType() == OsCheck.OSType.Windows) {
                path += ";" + classPath.getCanonicalPath();
            } else {
                path += ":" + classPath.getCanonicalPath();
            }
            System.setProperty("java.library.path", path);

            return new Sigar();
        } catch (Exception e) {
            return null;
        }
    }
}