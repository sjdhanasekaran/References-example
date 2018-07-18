import java.io.File;
import java.io.InputStream;
import java.nio.file.*;
public class Cluster {
    public static void main(String[] args) throws Exception {
       /* InputStream in = Cluster.class.getResourceAsStream("/lib/test.txt");
        File dest=new File("abc.txt");
        Files.copy(in,dest.toPath(),StandardCopyOption.REPLACE_EXISTING);
        System.out.println(dest.getAbsolutePath());
        System.out.println(dest.getPath());
        System.out.println(dest.getCanonicalPath());
       *//* URI resource = Cluster.class.getClassLoader().getResource("lib/").toURI();
        try {
            DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(resource));
            for (Path entry : stream) {
                System.out.println(entry.toString());
            }
        }catch (Exception e){
            e.printStackTrace();
        }*/
        File f=new File("templates/cloudsearch.tp");
        String absolutePath = f.getAbsolutePath();
        String replace = absolutePath.replace("\\", "\\\\");
        System.out.println(replace);
    }
}

