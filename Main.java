//int N = Integer.parseInt(br.readLine());
///String N = br.readLine();
//String[] str1 = br.readLine().split(" ");
//bw.write(String.valueOf(""));

//StringTokenizer st = new StringTokenizer(s);
//int a = Integer.parseInt(st.nextToken());
//int b = Integer.parseInt(st.nextToken());
//String array[] = s.split(" ");
//int N = Integer.parseInt(str[0]);

import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //String[] str = br.readLine().split(" ");
        //int input = Integer.parseInt(br.readLine());
        //int K = Integer.parseInt(str[0]);
        double cal = 0;
        String s;
        double result = 0;
        //bw.write(String.valueOf(""));
        int N = Integer.parseInt(br.readLine());

        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            cal = Double.parseDouble(str[i]);
            s = String.format("$%.2f\n", cal*0.8);
            bw.write(String.valueOf(s));
           //bw.write(".2f", Double.parseDouble(str[i]));
        }

        bw.flush();
        br.close();
        bw.close();
    }

}



