import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list=new ArrayList<>();
        while (true){
            String line =scanner.nextLine();
            if(line.equals("End")){
                break;

            }
            String[] part=line.split("\\s+");
            if(part.length==5){
                list.add(part[4]);

            }if(part[0].equals("Pet")){
                list.add(part[2]);
            }

        }
        String year=scanner.nextLine();
        list=list.stream()
                .filter(e-> e.endsWith(year))
                .collect(Collectors.toList());
        if(list.isEmpty()){
            System.out.println("<no output>");

        }else list.stream().forEach(e-> System.out.println(e));


    }
}
