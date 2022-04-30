import java.util.Scanner;

class TagPrinter{
    public static void main(String[] args){
        Tag[] t = new Tag[1024];
        int n, padding, len, i=0;
        String name, lower;
        char decochar;
        while(true){
            System.out.println("[1] Normal Tag, [2] Decorated Tag, [3] Framed Tag, [4] Tilted Tag ... [9] Draw and quit");
            Scanner in = new Scanner(System.in);
            System.out.print("Select one: ");
            n = in.nextInt();
            if(n==9)
                break;
            System.out.print("Name?: ");
            name = in.next();
            if(n==1){
                t[i] = new Tag(name);
            }else if(n==2){
                System.out.print("Decoration char?: ");
                decochar = in.next().charAt(0);
                System.out.print("How long?: ");
                len = in.nextInt();
                t[i] = new DecoratedTag(name, decochar, len);
            }else if(n==3){
                System.out.print("Padding?: ");
                padding = in.nextInt();
                t[i] = new FramedTag(name, padding);
            }else if(n==4){
                System.out.print("lower? [y/n]: ");
                lower = in.next();
                if(lower.equals("y")){
                    t[i] = new TiltedTag(name, true);
                }else if(lower.equals("n")){
                    t[i] = new TiltedTag(name, false);
                }else{
                    System.out.println("Error : 不正な入力がありました．終了します");
                    System.exit(0);
                }
            }
            i++;
        }
        int all = i;
        for(i=0; i<all; i++){
            t[i].show();
            System.out.println();
        }
    }
}