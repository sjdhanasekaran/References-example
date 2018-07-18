import com.softwareag.cluster.Executor;
import com.softwareag.cluster.helper.ClusterHelper;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cluster {
    public static void main(String[] args) throws FileNotFoundException {


/*
        nodeArray.forEach(aNodeArray->
                tempArray.removeIf(atemp->atemp.contains(aNodeArray)));
*/

/*        while (true) {
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("Welcome To the CLuster(HA) Setup !");
            System.out.println();

            System.out.print("Number of Nodes : [ 3 ] ?");
            String temp = inputScanner.nextLine();
            int nodes = temp.isEmpty() ? 3 : Integer.parseInt(temp);
            System.out.println();

            String[] runnableArray = new String[nodes];
            String[] hostOrIp = new String[nodes];
            for (int i = 0; i < nodes; i++) {
                System.out.print("Enter HostName or IP of Node " + String.valueOf(i + 1) + " : ");
                hostOrIp[i] = inputScanner.nextLine();
                System.out.print("Enter Runnables in Node " + String.valueOf(i + 1) + " : ");
                runnableArray[i] = inputScanner.nextLine();
            }


            String dir = Controller.getInstance().isWindows() ? "C:\\SoftwareAG\\" : "/opt/softwareag/";
            System.out.print("Installed Directory : [ " + dir + "] ? ");
            temp = inputScanner.nextLine();
            String installationDirectory = temp.isEmpty() ? dir : temp;

            System.out.print("Installed Type : [ s ] ? ");
            temp = inputScanner.nextLine();
            String installationType = temp.isEmpty() ? "s" : temp;

            System.out.print("Enter Cloud Controller Port :");
            String accPort = inputScanner.nextLine();

            System.out.print("Elastic Port : [ 14230 ] ? ");
            temp = inputScanner.nextLine();
            String elasticPort = temp.isEmpty() ? "14230" : temp;
            System.out.print("ClusterName : [ apiportal_101_cluster ] ?");
            temp = inputScanner.nextLine();
            String clusterName = temp.isEmpty() ? "apiportal_101_cluster" : temp;

            System.out.println("Cluster Properties You Entered : " + nodes+"\n"
                    + Arrays.toString(hostOrIp)+"\n"
                    + Arrays.toString(runnableArray)+"\n"
                    + installationDirectory+"\n"
                    + installationType+"\n"
                    + accPort+"\n"
                    + elasticPort+"\n"
                    + clusterName);

            System.out.print("Is this Ok [ Y / N / exit ] ? ");
            temp = inputScanner.nextLine();
            if (temp.equals("Y")) {
                createNodesJson(nodes, runnableArray, hostOrIp, installationDirectory, installationType, accPort, elasticPort, clusterName);
                break;
            } else if (temp.equals("exit")) {
                System.exit(1);
            }
        }
    }

    public static void createNodesJson(int nodes, String[] runnableArray, String[] hostOrIp, String installationDirectory, String installationType, String accPort, String elasticPort, String clusterName) {
            JSONArray hostArray = new JSONArray();
            for (int i = 0; i < nodes; i++) {
                JSONObject json = new JSONObject();
                json.put("ip", hostOrIp[i]);
                String temp1= runnableArray[i].toString();
                String[] splitToList =temp1.split(",");
                JSONArray jsonArray = new JSONArray();
                jsonArray.addAll(Arrays.asList(splitToList));
                json.put("n" + String.valueOf(i + 1), jsonArray);
                hostArray.add(json);

            }

            PrintWriter p = null;
            try {
                if (Controller.getInstance().isWindows()) {
                    p = new PrintWriter(installationDirectory + "API_Portal\\server\\nodes.json");

                } else if (Controller.getInstance().isLinux()) {
                    p = new PrintWriter(installationDirectory + "API_Portal/server/nodes.json");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            JSONObject jsonObject = new JSONObject();
            jsonObject.put("installedDirectory", installationDirectory);
            jsonObject.put("accPort", accPort);
            jsonObject.put("elasticPort",elasticPort);
            jsonObject.put("installationType", installationType);
            jsonObject.put("nodes", hostArray);

            assert p != null;
            try {
                System.out.println(jsonObject.toJSONString());
                jsonObject.writeJSONString(p);
                p.flush();
                p.close();

            } catch (Exception e) {
                e.printStackTrace();
            }*/

    }
}
/*          System.out.println("Starting Deconfiguration Process...");
        ArrayList<String>deConfList=new <>();
        ArrayList<Parser>nodeDetails=new ArrayList<>();
        BufferedReader r1 = new BufferedReader(new FileReader("C:\\Users\\dje\\Desktop\\ne.txt"));
        String l1 = r1.readLine();
        while (l1 != null) {
              if (l1.contains("com.aris")) {
                  String[] ss = l1.split("\\s+");
                  nodeDetails.add(new Parser(ss[0], ss[1], ss[2]));
              }
            l1 = r1.readLine();
          }
            ArrayList<Parser> tempArray = new ArrayList<>();
            ArrayList<String> nodeArray = JsonHelper.getInstance().getNodes().get(1).getRunnable();
            tempArray.addAll(nodeDetails);
            for (Parser aTemp : tempArray) {
                if (aTemp.getID().contains("zoo")) {
                    deConfList.add("on n1 force deconfigure zoo_s");
                }
            }

            for (String aNodeArray : nodeArray) {
                for (int k = 0; k < tempArray.size(); k++) {
                    if (tempArray.get(k).getID().contains(aNodeArray)) {
                        tempArray.remove(k);
                    }
                }
            }
            for (Parser aTempArray : tempArray) {
                if (!(aTempArray.getID().contains("zoo"))) {
                    String com = "on n1 force deconfigure " + aTempArray.getID();
                    deConfList.add(com);
                }
            }
        System.out.println(deConfList);*/
       /* Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);
        cfg.setClassForTemplateLoading(Cluster.class, "/templates/");
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        cfg.setLogTemplateExceptions(false);
        cfg.setWrapUncheckedExceptions(true);
        Template temp = cfg.getTemplate("kibana.tp");
        Map<String,String> replaceMap= new HashMap<>();
        replaceMap.put("nodeName","n"+String.valueOf(1));
        replaceMap.put("clusterName",JsonHelper.getInstance().getClusterName());
        replaceMap.put("hosts","new");
        StringWriter writer = new StringWriter();
        temp.process(replaceMap, writer);
         String s= writer.toString();
         s = s.replaceAll("\r\n", " ");
         System.out.println(s);*/
/*       ProcessBuilder p=new ProcessBuilder("cmd","/c","acc.bat -n ../nodelist.pt -c ../generated.apptypes.cfg");
       p.directory(new File("C:\\SoftwareAG\\API_Portal\\server\\acc"));
       Process pb=p.start();
        Scanner sc=new Scanner(pb.getErrorStream());
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
            if(!sc.hasNextLine()){
                System.out.println("Exiting From the Cluster Setup");
                System.exit(1);
            }
        }*/
/*      boolean result;
        try {
            Socket socket = new Socket("192.168.56.101", 18008);
//            socket.connect(new InetSocketAddress("192.168.56.101", 18008));
            socket.close();
            result = true;
        } catch (IOException e) {
            result = false;
            e.printStackTrace();
        }
        System.out.println(result);*/
/*

    ProgressBar progress = new ProgressBar();
        progress.start();
                progress.showProgress = true;
                System.out.println("\nDone ");
                }
                }
class ProgressBar extends Thread {
    public boolean showProgress = true;
    public void run() {
        StringBuilder string=new StringBuilder();
        int x = 0;
        while (showProgress) {
            string.append("=");
            System.out.print("\rProcessing "+ string.toString());
            try {
                Thread.sleep(500);
            }
            catch (Exception e) {

            }
        }
    }
}
  /* try {
            ProcessBuilder pb = null;
            String directory = "";
            if (Controller.getInstance().isWindows()) {
                String fileDir = JsonHelper.getInstance().getInsDir() +"API_Portal\\server\\";
                directory = JsonHelper.getInstance().getInsDir() +"API_Portal\\server\\acc\\";
                String accCommand = "acc.bat -n " + fileDir + "nodelist.pt -c " + fileDir + "generated.apptypes.cfg";
                pb = new ProcessBuilder("cmd.exe", "/c", accCommand);
            } else if (Controller.getInstance().isLinux()) {
                String fileDir = JsonHelper.getInstance().getInsDir() +"API_Portal/server/";
                directory = JsonHelper.getInstance().getInsDir() + "API_Portal/server/acc/";
                String accCommand = "sh acc.sh -n " + fileDir + "nodelist.pt -c " + fileDir + "generated.apptypes.cfg";
                pb = new ProcessBuilder("/bin/bash", "-c", accCommand);
            }
            assert pb != null;
            pb.directory(new File(directory));
            Process p=pb.start();
            if(p.getInputStream()!=null){
                p.destroy();
            }
            Scanner sc = new Scanner(p.getErrorStream());
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
                if (!sc.hasNextLine()) {
                    System.out.println("Exiting From the Cluster Setup");
                    System.exit(1);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }*/
      /*  ProgressBar progress = new ProgressBar();
        progress.start();
        progress.showProgress = true;
        System.out.println("\nDone ");*/
/*
class ProgressBar extends Thread {
    boolean showProgress = true;
    public void run() {
        String anim  = "===================";
        int x = 0;
        while (showProgress) {
            if(x%anim.length()==0){
                StringBuilder b=new StringBuilder(" ");
                for(int i=0;i<=anim.length();i++){
                    b.append("   ");
                }
                System.out.print("\r"+b);
            }
            System.out.print("\rProcessing "+ anim.substring(0, x++ % anim.length())
                    + " ");
            try { Thread.sleep(300); }
            catch (Exception e) {};
        }
    }
    }
*/

/* private static String tempString = "";

    public void print(String printString) {
        if (!(printString.equals(tempString))) {
            StringBuilder space = new StringBuilder();
            for (int i = 0; i < tempString.length(); i++) {
                space.append("  ");
            }
            System.out.print("\r" + space);
            System.out.print("\r" + printString);
            tempString = printString;
        } else {
            System.out.print("\r" + printString);
        }

    }*/
	
	
	//////////
	
	sql
	  /* try (
*//*                    Connection conn = DriverManager.getConnection(
                            "jdbc:oracle:thin:@vmchnapi01w:1521:XE", "USER", "PASSWORD123");*//*
                    Connection conn = DriverManager.getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=AdventureWorks;user=UserName;password=*****");
                    Statement stmt = conn.createStatement()
            ) {
                String strSelect = "SELECT COUNT(*) AS count FROM ALL_USERS WHERE USERNAME='API_MASTER'";
                System.out.println("The SQL query is: " + strSelect);
                System.out.println();

                ResultSet rset = stmt.executeQuery(strSelect);
                int count=0;
                while(rset.next()) {   // Move the cursor to the next row, return false if no more row
                    count = rset.getInt("count");

                }
                if(count>0){
                    System.out.println("records found");
                }
            } catch(SQLException ex) {
                String message=ex.getLocalizedMessage();
                System.out.println(ex.getLocalizedMessage());
                if(message.contains("connection")){
                    System.out.println("Could No connect to you Database . Please verify the Port or server is accesible");
                }else if(message.contains("logon denied")){
                    System.out.println("Enter Correct username and password");
                }

            }*/
	
	
	
	
	
	
	////////////////////////
