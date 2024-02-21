package Company;

public enum Salaries {
    JN(2000),
    MD(2500),
    SN(3000),
    HR(3500);


    private int salary;

    Salaries(int salary){
        this.salary=salary;
    }

    public int getSalary(){
        return salary;
    }
}
