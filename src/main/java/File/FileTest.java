package File;

import java.io.File;
import java.util.ArrayList;

public class FileTest {
    private static String systemFile = "$RECYCLE.BIN";

    public static void main(String[] args) {
        String path = "D:\\";
        File file = new File(path);
        File[] files = file.listFiles();
        D d = visitFile(files, path);
    }
    public static D visitFile(File[] files, String Path) {
        D d = new D();
        d.path = Path;
        for (File f : files) {
            if (f.getName().equals(systemFile)) continue;
//            System.out.println(sb.toString() + Path + f.getName());
            if (f.isDirectory()) {
                Component c = visitFile(f.listFiles(), Path + f.getName() + System.getProperty("file.separator"));
                d.addchildrens(c);
            }
            F ff = new F();
            ff.path = Path + f.getName();
        }
        return d;
    }
}
class Component {
    String path;

    public String getPath() {
        return path;
    }
}
class F extends Component {

}
class D extends Component {
    ArrayList<Component> childrens;
    public void addchildrens(Component c) {
        childrens.add(c);
    }
}
