import com.monitor.util.SigarUtil;
import org.hyperic.sigar.Sigar;

/**
 * Created by oushaku on 16/8/4.
 */
public class MainTest {

    public static void main(String[] args) {
        Sigar sigar = SigarUtil.sigar;
        System.out.println(sigar);
    }
}
