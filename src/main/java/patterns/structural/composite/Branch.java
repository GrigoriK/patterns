package patterns.structural.composite;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;
@Data
public class Branch {
    private Collection<Leaf> leaf = new ArrayList<>();
    private Collection<Branch> branches = new ArrayList<>();
    public  void addBranch(Branch branch){
        branches.add(branch);
    }
    public  void removeBranch(Branch branch){
        branches.remove(branch);
    }

    public int countOfLeaf(){
        int sum = leaf.size();
        if( branches.size() !=0){
            sum += branches.stream()
                    .mapToInt(Branch::countOfLeaf).sum();
        }
        return sum;
    }
}
