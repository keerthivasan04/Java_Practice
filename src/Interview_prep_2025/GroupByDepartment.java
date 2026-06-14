package Interview_prep_2025;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Jhon", "HR", 50000),
                new Employee(1, "Jhon", "IT", 50000),
                new Employee(1, "Jhon", "Testing", 500000),
                new Employee(1, "Jhon", "IT", 500000),
                new Employee(1, "Jhon", "HR", 55000)
        );
    }
}
