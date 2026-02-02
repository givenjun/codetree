import java.util.*;
import java.io.*;

class Index implements Comparable<Index>{
    int val;
    int idx;
    public Index(int val) {
        this.val = val;
        this.idx = -1;
    }
    @Override
    public int compareTo(Index i) {
        return val - i.val;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        String nBlank = br.readLine().trim();
        int n = Integer.parseInt(nBlank);
        String[] s = br.readLine().split(" ");
        Index[] index = new Index[n];
        int[] list = new int[n];
        for (int i = 0; i < n; i++){
            int val = Integer.parseInt(s[i]);
            list[i] = val;
            index[i] = new Index(val);
        }
        Arrays.sort(list);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (list[i] == index[j].val && index[j].idx == -1) {
                    index[j].idx = i + 1;
                    break;
                }
            }
        }

        for (Index i : index) 
            bw.write(i.idx + " ");
        bw.flush();
        bw.close();
    }
}