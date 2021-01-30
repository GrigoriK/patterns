package patterns.structural.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;

@Data
public class Tree {
    private String name;
    private Collection<Branch> branches = new ArrayList<>();
    public  void addBranch(Branch branch){
        branches.add(branch);
    }
    public int branchesLeafCount(){
        return  branches.stream().mapToInt(Branch::countOfLeaf)
                .sum();
    }
}
