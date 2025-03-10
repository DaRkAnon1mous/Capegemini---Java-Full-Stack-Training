
//import java.util.Stream.Collectors;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ClassHouseFormation {

    HashSet<String> studSet = new HashSet<String>();

    // Incude getters and setters

    public HashSet<String> getStudSet() {
        return studSet;
    }

    public void setStudSet(HashSet<String> studSet) {
        this.studSet = studSet;
    }

    // HashSet<String> newStu = new HashSet<String>();
    public void addName(String details) {

        String s[] = details.split(":");
        String s1 = s[1];
        studSet.add(s1);

    }

    public HashSet<String> formTeam() {

        HashSet<String> res = new HashSet<String>();
        Set<String> s1 = studSet.stream().filter(n -> n.matches("^[A-H].*")).map(n -> n + ":RED")
                .collect(Collectors.toSet());
        Set<String> s2 = studSet.stream().filter(n -> n.matches("^[I-P].*")).map(n -> n + ":BLUE")
                .collect(Collectors.toSet());
        Set<String> s3 = studSet.stream().filter(n -> n.matches("^[Q-Z].*")).map(n -> n + ":GREEN")
                .collect(Collectors.toSet());
        res.addAll(s1);
        res.addAll(s2);
        res.addAll(s3);
        return res;
    }

}
