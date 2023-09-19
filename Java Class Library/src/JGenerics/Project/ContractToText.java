package JGenerics.Project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ContractToText {
    public static void toText(List<ContractManager> contractsmanager ) throws IOException{
        // sort by instructor TeachingSubject
        List<String> data = new ArrayList<>();
        contractsmanager.stream()
        .forEach(contractlist -> {
            contractlist.getListof().stream()
            .sorted(Comparator.comparing(t -> t.getInstructor().getTeachingSubject().toString()))
            .forEach(p -> data.add(p.toString()));});
            // .collect(Collectors.toList());

        try{
            Path contractsFilePath = Path.of("contracts.txt");
            Files.write(contractsFilePath, data, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            System.out.println("Successfull!");
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
    

