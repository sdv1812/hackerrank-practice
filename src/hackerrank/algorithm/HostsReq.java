package hackerrank.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class HostsReq {
private static final Scanner scan = new Scanner(System.in);

    public static void main(String args[]) throws Exception {
        String filename;
        filename = scan.nextLine()+".txt";
        String output_filename = "records_"+filename;

        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader(filename);
            br = new BufferedReader(fr);

            String str;

            br = new BufferedReader(new FileReader(filename));
            HashMap<String, Integer> map = new HashMap<>();

            while ((str = br.readLine()) != null) {
                map = findHostRequest(str,map);
            }
            writeToFile(map,output_filename);

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }

    private static HashMap<String, Integer> findHostRequest(String currentLine,HashMap<String, Integer> map){
        String[] strings = currentLine.split(" ");                    
        if(map.containsKey(strings[0])){
            int occurence = map.get(strings[0]);
            map.put(strings[0], occurence+1);
        }else{
            map.put(strings[0],1);
        }
        return map;
    }

    private static void writeToFile(HashMap<String, Integer> map, String outputFile){
        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            Iterator<String> keys = map.keySet().iterator();

            fw = new FileWriter(outputFile);
            bw = new BufferedWriter(fw);

            while(keys.hasNext()){

                String hostName = keys.next();
                int ocurrences = map.get(hostName);

                bw.append(hostName+" "+String.valueOf(ocurrences));
                bw.newLine();

            }

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {

                if (bw != null)
                    bw.close();

                if (fw != null)
                    fw.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }


        }
    }
}