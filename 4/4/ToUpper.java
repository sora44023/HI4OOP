import java.io.*;

class ToUpper {
    public static void main(String[] args){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("out.txt")));
            String line;
            while((line = reader.readLine())!=null){
                writer.println(line.toUpperCase().replace(' ','_'));
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("out.txtに書き込むことができません．終了します．");
        } catch (IOException e){
            System.out.println(e);
        }
    }
}